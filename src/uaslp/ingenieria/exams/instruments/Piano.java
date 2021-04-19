package uaslp.ingenieria.exams.instruments;

import uaslp.ingenieria.exams.Nota;

public class Piano extends Instrumento{

    public void presionaTecla(Nota nota){
        tocar(nota);
    }
}
