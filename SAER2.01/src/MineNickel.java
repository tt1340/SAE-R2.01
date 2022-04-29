import java.util.Random;

public class MineNickel extends Mine{
    private final int indice ;
    private int quantiteNickel ;
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

    public void setQuantiteNickel(int quantiteNickel) {
        this.quantiteNickel = quantiteNickel;
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

    // TO STRING METHOD
    // affichage des données pour faire un recap du monde
    public String toStringGeneral(){
        String res ="M "+this.getIndice() + " ";
        res = res  +  this.getX() + "\t" +  this.getY() + " NI " + this.getNickelRestant() + " / " + this.getQuantiteNickel();
        return res;
    }
    public String toStringMap(){
        String res = "_______\n";
        res = res + "|M |"+this.getIndice()+" |\n";
        res = res + "|  |  |\n¯¯¯¯¯¯¯";
        return res ;
    }
}
