package org.example;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private List<String> instrumentos;

    public Equipo() {
        this.instrumentos = new ArrayList<>();
    }

    public void agregarInstrumento(String instrumento) {
        instrumentos.add(instrumento);
    }

    public List<String> getInstrumentos() {
        return instrumentos;
    }

    @Override
    public String toString() {
        return "Equipo: " + instrumentos;
    }
}
