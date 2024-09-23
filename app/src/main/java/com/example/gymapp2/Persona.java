package com.example.gymapp2;

import java.io.Serializable;

public class Persona  implements Serializable {

    private String peso;
    private String Masa_muscular;

    public Persona(String Masa_muscular,String peso) {
        this.Masa_muscular = Masa_muscular;
        this.peso = peso;
    }

    public String getMasa_muscular() {
        return Masa_muscular;
    }

    public void setMasa_muscular(String masa_muscular) {
        Masa_muscular = masa_muscular;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Masa_muscular='" + Masa_muscular + '\'' +
                ", peso='" + peso + '\'' +
                '}';
    }
}
