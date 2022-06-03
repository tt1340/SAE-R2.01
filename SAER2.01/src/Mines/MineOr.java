package Mines;

import java.util.Random;

public class MineOr extends Mine {
    private final int indice ;
    private final int quantiteOr;
    private int orRestant ;

    // CONSTRUCTOR
    public MineOr(int indice){
        super();
        Random random = new Random();
        this.quantiteOr = 50+ random.nextInt(101-50);
        this.indice = indice ;
        this.orRestant = quantiteOr ;

    }
    // GETTER AND SETTER
    public int getQuantiteOr() {
        return quantiteOr;
    }

    public int getIndice() {
        return indice;
    }

    public int getOrRestant() {
        return orRestant;
    }

    public void setOrRestant(int orRestant) {
        this.orRestant = orRestant;
    }

    public void minageOr(int nb){
        if(nb > this.getOrRestant() || nb > 0){
            System.out.println("Problème"); //todo
        }
        else{
            this.setOrRestant(this.orRestant-nb);
        }
    }
}
