package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

import java.io.File;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        String fileName = "archivo.music"; //args[0];


        SongPlayer songPlayer = new SongPlayer();
        Song song = new Song(new File(fileName));

        Piano piano = new Piano();
        Guitarra guitarra = new Guitarra();
        Violin violin = new Violin();
        Flauta flauta = new Flauta();






    }
}
