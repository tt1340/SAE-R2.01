package Robots;

import Entrepots.EntrepotNickel;
import Entrepots.EntrepotOr;
import Robots.Robot;

import java.util.Random;

public class RobotOr extends Robot {
    private final int stockMax ;
    private int stockInitial ;
    private final int capaciteExtraction ;


    // CONSTRUCTOR

    public RobotOr(int indice){
        super(indice);
        Random random = new Random();
        this.stockMax = 5+random.nextInt(10-5);
        this.stockInitial = 0 ;
        this.capaciteExtraction = 1+ random.nextInt(4-1);
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

    public void setStockInitial(int stockInitial) {
        this.stockInitial = stockInitial;
    }


    // methode pour calculer le nombre de minerais que peut prendre un robot
    public void quantiteRecup(int mineraisRecup){
        if( !(this.getCapaciteExtraction() < mineraisRecup )){
            if(this.getStockMax() > this.getStockInitial() + mineraisRecup){
                this.setStockInitial(this.getStockInitial() + mineraisRecup);
            }
            else{
                System.out.println("Problème"); //todo
            }
        }
        else{
            System.out.println("probleme"); //todo
        }
    }

    // methode pour déposer dans les entrepots
    public void deposeMinerais(EntrepotOr entrepotOr){
        entrepotOr.setStockageOr(entrepotOr.getStockageOr() + this.getStockInitial());
    }

}
