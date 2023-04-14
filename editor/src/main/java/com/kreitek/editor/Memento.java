package com.kreitek.editor;

import java.util.ArrayList;

public class Memento {
    private static ArrayList<String> estado;
    public void setEstado(ArrayList<String> estado){
        this.estado = estado;
    }
    public ArrayList<String> getEstado(){
        return estado;
    }
}
