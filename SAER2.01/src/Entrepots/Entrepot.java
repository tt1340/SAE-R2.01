package Entrepots;

import Monde.ObjetTerrain;


public abstract  class Entrepot extends ObjetTerrain {
    private final int indice ;


    public Entrepot(int indice){
        super();
        this.indice = indice;
    }
}
