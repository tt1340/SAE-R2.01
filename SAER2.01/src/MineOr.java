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

    // TO STRING METHOD
    // affichage des données pour faire un recap du monde
    public String toStringGeneral(){
        String res ="M "+this.getIndice() + " ";
        res = res + this.getX() + "\t" +  this.getY() + " OR " + this.getOrRestant() + " / " + this.getQuantiteOr();
        return res;
    }
    public String toStringMap(){
        String res = "_______\n";
        res = res + "|M |"+this.getIndice()+" |\n";
        res = res + "|  |  |\n¯¯¯¯¯¯¯";
        return res ;
    }


}
