package Monde;

import Entrepots.EntrepotNickel;
import Entrepots.EntrepotOr;
import Mines.MineNickel;
import Mines.MineOr;
import Obstacles.PlanEau;
import Robots.RobotNickel;
import Robots.RobotOr;
import Monde.ComposantMonde;

import java.util.ArrayList;

public class Monde {
    // attributes
    private RobotOr robotOr;
    private RobotNickel robotNickel;
    private ArrayList<MineNickel> mineNickels;
    private ArrayList<MineOr> mineOrs;
    private ArrayList<PlanEau> planEaus;
    private EntrepotNickel entrepotNickel;
    private EntrepotOr entrepotOr;
    private ComposantMonde[][] composantMondes;
    private int nbTour;

    //constructor
    public Monde(int nbMine, int nbPlanEau){
        this.nbTour = 0 ;
        this.robotOr = new RobotOr();
        this.robotNickel = new RobotNickel();
        this.entrepotNickel = new EntrepotNickel(1);
        this.entrepotOr = new EntrepotOr(2);
        this.planEaus = new ArrayList<>();
        if(nbMine == 1){ // 1 OR // 1 NICKEL
            this.mineNickels = new ArrayList<>();
            this.mineNickels.add(new MineNickel(1));
            this.mineOrs = new ArrayList<>();
            this.mineOrs.add(new MineOr(1));
        }

        else if(nbMine == 2){ // 2 OR // 1 NICKEL
            this.mineNickels = new ArrayList<>();
            this.mineNickels.add(new MineNickel(1));
            this.mineOrs = new ArrayList<>();
            this.mineOrs.add(new MineOr(1));
            this.mineOrs.add(new MineOr(2));
        }

        else if(nbMine == 3){ // 1 OR // 2 NICKEL
            this.mineNickels = new ArrayList<>();
            this.mineNickels.add(new MineNickel(1));
            this.mineNickels.add(new MineNickel(2));
            this.mineOrs = new ArrayList<>();
            this.mineOrs.add(new MineOr(1));
        }

        else if(nbMine == 4){ // 2 OR // 2 NICKEL
            this.mineNickels = new ArrayList<>();
            this.mineNickels.add(new MineNickel(1));
            this.mineNickels.add(new MineNickel(2));
            this.mineOrs = new ArrayList<>();
            this.mineOrs.add(new MineOr(1));
            this.mineOrs.add(new MineOr(2));
        }
        while(nbPlanEau < 0){
            this.planEaus.add(new PlanEau());
            nbPlanEau--;
        }
        this.composantMondes = new ComposantMonde[10][10];
        this.composantMondes[this.robotNickel.getX()][this.robotNickel.getY()] = this.robotNickel;
        this.composantMondes[this.robotOr.getX()][this.robotOr.getY()] = this.robotOr;
        this.composantMondes[this.entrepotOr.getX()][this.entrepotOr.getY()] = this.entrepotOr;
        this.composantMondes[this.entrepotNickel.getX()][this.entrepotNickel.getY()] = this.entrepotNickel;

        for(int i = 0 ; i < this.mineNickels.size();i++){
            this.composantMondes[this.mineNickels.get(i).getX()][this.mineNickels.get(i).getY()] = this.mineNickels.get(i);
        }
        for(int j = 0 ; j<this.mineOrs.size();j++){
            this.composantMondes[this.mineOrs.get(j).getX()][this.mineOrs.get(j).getY()] = this.mineOrs.get(j);
        }
        for(int k = 0 ; k<this.planEaus.size();k++){
            this.composantMondes[this.planEaus.get(k).getX()][this.planEaus.get(k).getY()] = this.planEaus.get(k);
        }
    }
    //GETTER AND SETTER


    public ArrayList<MineNickel> getMineNickels() {
        return mineNickels;
    }

    public ArrayList<MineOr> getMineOrs() {
        return mineOrs;
    }

    public ArrayList<PlanEau> getPlanEaus() {
        return planEaus;
    }

    public EntrepotNickel getEntrepotNickel() {
        return entrepotNickel;
    }

    public EntrepotOr getEntrepotOr() {
        return entrepotOr;
    }

    public RobotNickel getRobotNickel() {
        return robotNickel;
    }

    public RobotOr getRobotOr() {
        return robotOr;
    }

    public ComposantMonde[][] getComposantMondes() {
        return composantMondes;
    }

    public int getNbTour() {
        return nbTour;
    }

    public void setNbTour(int nbTour) {
        this.nbTour = nbTour;
    }

    //TO STRING
    // methode to string pour mine or (case)
    public String toStringMineOrCase(){
        //todo
        return "";
    }

    // methode to string pour mine or (recap)
    public String toStringMineOrRecap(){
        //todo
        return "";
    }
    // methode to string pour mine nickel (case)
    public String toStringMineNickelCase(){
        //todo
        return "";
    }
    // methode to string pour mine nickel (recap)
    public String toStringMineNickelRecap(){
        //todo
        return "";
    }
    // methode to string pour entrepot or (case)
    public String toStringEntrepotOrCase(){
        //todo
        return"";
    }
    //methode to string pour entrepot or (recap)
    public String toStringEntrepotOrRecap(){
        //todo
        return "";
    }

    // methode to string pour entrepot nickel (case)
    public String toStringEntrepotNickelCase(){
        //todo
        return"";
    }
    // methode to string pour entrepot nickel(recap)
    public String toStringEntrepotNickelRecap(){
        //todo
        return "";
    }

    // methode to string pour robot or (case)
    public String toStringRobotOrCase(){
        //todo
        return "";
    }
    // methode to string pour robot or (recap)
    public String toStringRobotOrRecap(){
        //todo
        return "";
    }
    //methode to string pour robot nickel (case)
    public String toStringRobotNickelCase(){
        //todo
        return "";
    }
    // methode to string pour robot nickel (recap)
    public String toStringRobotNickelRecap(){
        //todo
        return "";
    }
    // methode to string pour plan d'eau (case) pas de recap nécessaire
    public String toStringPlanEauCase(){
        //todo
        return"";
    }
    // methode to string general pour afficher toutes les cases
    public String toStringMondeCase(){
        //todo
        return "";
    }
    // methode to string pour le recap general
    public String ToStringMondeRecap(){
        //todo
        return "";
    }


}
