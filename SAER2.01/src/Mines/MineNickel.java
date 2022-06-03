package Mines;

import java.util.Random;

public class MineNickel extends Mine {
    private final int indice ;
    private final int quantiteNickel ;
    private int nickelRestant ;

    public MineNickel(int indice){
        super();
        Random random = new Random();
        this.quantiteNickel = 50+ random.nextInt(101-50);
        this.indice = indice ;
        this.nickelRestant = quantiteNickel ;
    }

    public int getQuantiteNickel() {
        return quantiteNickel;
    }

    public int getIndice() {
        return indice;
    }

    public int getNickelRestant() {
        return nickelRestant;
    }

    public void setNickelRestant(int nickelRestant) {
        this.nickelRestant = nickelRestant;
    }

    public void minageNickel(int nb){
        if(nb > this.getNickelRestant() || nb > 0){
            System.out.println("Problème"); //todo
        }
        else{
            this.setNickelRestant(this.nickelRestant-nb);
        }
    }
}
