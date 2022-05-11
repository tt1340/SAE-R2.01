package Robots;

import java.util.Random;

public class RobotOr extends Robot {
    private final int indice ;
    private int stockMax ;
    private int stockInitial ;
    private int capaciteExtraction ;


    // CONSTRUCTOR
    public RobotOr(){
        super();
        this.stockMax = 6 ;
        this.stockInitial = 0 ;
        this.capaciteExtraction = 3 ;
        this.indice = 0 ;
    }
    public RobotOr(int x , int y , Random random,int indice){
        super(x,y);
        this.stockMax = 5+random.nextInt(10-5);
        this.stockInitial = 0 ;
        this.capaciteExtraction = 1+ random.nextInt(4-1);
        this.indice = indice ;
    }

    // GETTER AND SETTER
    public int getCapaciteExtraction() {
        return capaciteExtraction;
    }

    public int getStockInitial() {
        return stockInitial;
    }

    public int getStockMax() {
        return stockMax;
    }

    public void setCapaciteExtraction(int capaciteExtraction) {
        this.capaciteExtraction = capaciteExtraction;
    }

    public void setStockInitial(int stockInitial) {
        this.stockInitial = stockInitial;
    }

    public void setStockMax(int stockMax) {
        this.stockMax = stockMax;
    }

    public int getIndice() {
        return indice;
    }
    //  TO STRING METHOD

    public String toString(){
        String s = "";
        s+= "R " + this.getIndice() + " Cordonnee X :"+ this.getX()+ " Coordonnee Y "+this.getY();
        s+="\n Stock Max Or :"+this.getStockMax()+ " StockInitial Or "+this.getStockInitial()+ " Capacite d'extraction Or :"+this.getCapaciteExtraction();
        return s ;
    }

    // methode pour récupérer des minerais

    // methode pour déposer des minerais dans un entrepot

}
