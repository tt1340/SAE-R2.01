import java.util.Random;

public class RobotNickel extends Robot{
    private final int indice ;
    private int stockMax ;
    private int stockInitial ;
    private int capaciteExtraction ;

    // CONSTRUCTOR
    public RobotNickel(){
        super();
        this.stockMax = 6 ;
        this.stockInitial = 0 ;
        this.capaciteExtraction = 3 ;
        this.indice = 0 ;
    }

    public RobotNickel(int x , int y, Random random, int indice){
        super(x,y);
        this.stockMax = 5+random.nextInt(10-5);
        this.stockInitial = 0 ;
        this.capaciteExtraction = 1+ random.nextInt(4-1);
        this.indice = indice ;

    }
    // GETTER AND SETTER
    public int getStockMax() {
        return stockMax;
    }

    public int getStockInitial() {
        return stockInitial;
    }

    public int getCapaciteExtraction() {
        return capaciteExtraction;
    }

    public void setStockMax(int stockMax) {
        this.stockMax = stockMax;
    }

    public void setStockInitial(int stockInitial) {
        this.stockInitial = stockInitial;
    }

    public void setCapaciteExtraction(int capaciteExtraction) {
        this.capaciteExtraction = capaciteExtraction;
    }

    public int getIndice() {
        return indice;
    }
    //  TO STRING METHOD
    public String toString(){
        String s = "";
        s+= "R " + this.getIndice() + " Cordonnee X :"+ this.getX()+ " Coordonnee Y "+this.getY();
        s+="\n Stock Max Nickel :"+this.getStockMax()+ " StockInitial Nickel "+this.getStockInitial()+ " Capacite d'extraction Nickel :"+this.getCapaciteExtraction();
        return s ;
    }
}
