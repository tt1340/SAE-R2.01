package Robots;

import Entrepots.EntrepotNickel;
import Robots.Robot;

import java.util.Random;

public class RobotNickel extends Robot {
    private final int stockMax ;
    private int stockInitial ;
    private final int capaciteExtraction ;

    // CONSTRUCTOR
    public RobotNickel(int indice){
        super(indice);
        Random random = new Random();
        this.stockMax = 5+random.nextInt(10-5);
        this.stockInitial = 0 ;
        this.capaciteExtraction = 1+ random.nextInt(4-1);
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

    public void setStockInitial(int stockInitial) {
        this.stockInitial = stockInitial;
    }


    public String toString(){
        String s = "";
        s+= "R " + this.getIndice() + " Cordonnee X :"+ this.getX()+ " Coordonnee Y "+this.getY();
        s+="\n Stock Max Nickel :"+this.getStockMax()+ " StockInitial Nickel "+this.getStockInitial()+ " Capacite d'extraction Nickel :"+this.getCapaciteExtraction();
        return s ;
    }

    // methode pour calculer le nombre de minerais que peut prendre un robot
    public void quantiteRecup(int mineraisRecup){
        if( !(this.getCapaciteExtraction() < mineraisRecup )){
           if(this.getStockMax() > this.getStockInitial() + mineraisRecup){
               this.setStockInitial(this.getStockInitial() + mineraisRecup);
           }
           else{
               System.out.println("probleme"); //todo
           }
        }
        else{
            System.out.println("probleme"); //todo
        }
    }

    // methode pour déposer dans les entrepots
    public void deposeMinerais(EntrepotNickel entrepotNickel){
        entrepotNickel.setStockage(entrepotNickel.getStockage() + this.getStockInitial());
    }

}
