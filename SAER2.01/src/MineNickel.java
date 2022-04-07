import java.util.Random;

public class MineNickel extends Mine{
    private final int indice ;
    private int quantiteNickel ;
    private int nickelRestant ;

    public MineNickel(){
        super();
        this.quantiteNickel = 55 ;
        this.indice = 0 ;
        this.nickelRestant = 55 ;
    }

    public MineNickel(int x , int y , Random random, int indice){
        super(x,y);
        this.quantiteNickel = 50+ random.nextInt(101-50);
        this.indice = indice ;
        this.nickelRestant = quantiteNickel ;
    }

    public int getQuantiteNickel() {
        return quantiteNickel;
    }

    public void setQuantiteNickel(int quantiteNickel) {
        this.quantiteNickel = quantiteNickel;
    }

    public int getIndice() {
        return indice;
    }

    // TO STRING METHOD

    public String toString(){
        String s = "";
        s+= "M" + this.getIndice() + " Coordonnee X :" + this.getX() + " Coordonnee Y :" + this.getY() ;
        s+= "\n Quantite de Nickel " + this.nickelRestant + "/"+this.quantiteNickel ;
        return s ;
    }
}
