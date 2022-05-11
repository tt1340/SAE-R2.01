package Robots;

public class RobotNickel extends Robot {
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

    public String toString(){
        String s = "";
        s+= "R " + this.getIndice() + " Cordonnee X :"+ this.getX()+ " Coordonnee Y "+this.getY();
        s+="\n Stock Max Nickel :"+this.getStockMax()+ " StockInitial Nickel "+this.getStockInitial()+ " Capacite d'extraction Nickel :"+this.getCapaciteExtraction();
        return s ;
    }

    // methode pour calculer le nombre de minerais que peut prendre un robot
    public int quantiteRecup(){
        //todo
        return 0;
    }

    // methode pour récupérer des minerais dans une mine
    public void recupMinerais(int quantite){
        //todo
    }

    // methode pour déposer dans les entrepots
    public void deposeMinerais(){
        //todo
    }
}
