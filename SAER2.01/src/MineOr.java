import java.util.Random;

public class MineOr extends Mine {
    private final int indice ;
    private final int quantiteOr;
    private int orRestant ;

    //CONSTRUCTOR
    public MineOr(){
        super();
        this.indice = 0 ;
        this.quantiteOr = 55 ;
        this.orRestant = 55 ;
    }

    public MineOr(int x , int y, Random random , int indice){
        super(x,y);
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

    // TO STRING METHOD
    public String toString(){
        String s = "";
        s+= "M" + this.getIndice() + " Coordonnee X :" + this.getX() + " Coordonnee Y :" + this.getY() ;
        s+= "\n Quantite d'or" + this.orRestant + "/"+this.quantiteOr ;
        return s ;
    }


}
