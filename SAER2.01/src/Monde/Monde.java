package Monde;


import Entrepots.EntrepotNickel;
import Entrepots.EntrepotOr;
import Mines.MineNickel;
import Mines.MineOr;
import Obstacles.PlanEau;
import Robots.RobotNickel;
import Robots.RobotOr;

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
    private AffichageService service = new AffichageService();
    private DeplacementService deplacementService = new DeplacementService();

    //constructor
    public Monde(int nbMine, int nbPlanEau){
        this.nbTour = 0 ;
        this.robotOr = new RobotOr(1);
        this.robotNickel = new RobotNickel(2);
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
        else if (nbMine == 0 ){
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

    // TO STRING

    public String toString(){ //todo reparer
        String general = "";
        for(int i = 0 ; i < this.composantMondes.length; i++){
            general = general + " \n";
            for(int j = 0 ; j < this.composantMondes[0].length;j++){
                for(int k = 0 ; k<this.mineOrs.size();k++){
                    if(mineOrs.get(k).getX() == i && mineOrs.get(k).getY() == j){
                        general = general + service.toStringMineOrCase(mineOrs.get(k));
                    }
                }
                for (int k = 0 ; k <this.mineNickels.size();k++){
                    if(mineNickels.get(k).getX() == i && mineNickels.get(k).getY() == j){
                        general = general + service.toStringMineNickelCase(mineNickels.get(k));
                    }
                }
                for (int k = 0 ; k< this.planEaus.size();k++){
                    if(planEaus.get(k).getX() == i && planEaus.get(k).getY() == j){
                        general = general + service.toStringPlanEauCase(planEaus.get(k));
                    }
                }

                if(entrepotNickel.getX() == i && entrepotNickel.getY() == j){
                    general = general + service.toStringEntrepotNickelCase(entrepotNickel);
                }
                if(entrepotOr.getX() == i && entrepotOr.getY() == j){
                    general = general + service.toStringEntrepotOrCase(entrepotOr);
                }
                if(robotOr.getX() == i && robotOr.getY() == j ){
                    general = general + service.vide();
                }
                if(robotNickel.getX() == i && robotNickel.getY() == j ) {
                    general = general + service.vide();
                }


                for(int k = 0 ; k<this.mineOrs.size();k++){
                    if(mineOrs.get(k).getX() == i && mineOrs.get(k).getY() == j){
                        general = general + service.vide();
                    }
                }
                for (int k = 0 ; k <this.mineNickels.size();k++){
                    if(mineNickels.get(k).getX() == i && mineNickels.get(k).getY() == j){
                        general = general + service.vide();
                    }
                }
                for (int k = 0 ; k< this.planEaus.size();k++){
                    if(planEaus.get(k).getX() == i && planEaus.get(k).getY() == j){
                        general = general + service.toStringPlanEauCase(planEaus.get(k));
                    }
                }
                for (int k = 0 ; k< this.planEaus.size();k++){
                    if(planEaus.get(k).getX() == i && planEaus.get(k).getY() == j){
                        general = general + service.toStringPlanEauCase(planEaus.get(k));
                    }

                }

                if(entrepotNickel.getX() == i && entrepotNickel.getY() == j){
                    general = general + service.vide();
                }
                if(entrepotOr.getX() == i && entrepotOr.getY() == j){
                    general = general + service.vide();
                }
                if(robotOr.getX() == i && robotOr.getY() == j ){
                    general = general + service.toStringRobotOrCase(robotOr);
                }
                if(robotNickel.getX() == i && robotNickel.getY() == j ){
                    general = general + service.toStringRobotNickelCase(robotNickel);
                }
                for (int k = 0 ; k< this.planEaus.size();k++){
                    if(planEaus.get(k).getX() == i && planEaus.get(k).getY() == j){
                        general = general + service.toStringPlanEauCase(planEaus.get(k));
                    }
                }
                if (!(this.getComposantMondes()[i][j] instanceof PlanEau || this.getComposantMondes()[i][j] instanceof RobotOr || this.getComposantMondes()[i][j] instanceof RobotNickel || this.getComposantMondes()[i][j] instanceof MineNickel || this.getComposantMondes()[i][j] instanceof MineOr || this.getComposantMondes()[i][j] instanceof EntrepotNickel || this.getComposantMondes()[i][j] instanceof EntrepotOr )) {
                    general = general + service.vide();
                }
            }
        }
        return general;
    }
    public String toStringRecap(){
        String resu = "";
        for (int i = 0 ; i<this.mineNickels.size();i++){
            resu = resu + service.toStringMineNickelRecap(mineNickels.get(i)) + "\n";
        }
        for (int i = 0 ; i<this.mineOrs.size();i++){
            resu = resu + service.toStringMineOrRecap(mineOrs.get(i)) + "\n";
        }
        resu = resu + service.toStringEntrepotOrcRecap(entrepotOr) + "\n" ;
        resu = resu + service.toStringEntrepotNickelRecap(entrepotNickel) + "\n";
        resu = resu + service.toStringRobotOrRecap(robotOr) + " \n";
        resu = resu + service.toStringRobotNickelRecap(robotNickel);
        return resu ;
    }
    public void deplacementRobotOr(int entree,RobotOr robotOr){
        if(entree == 1){
            this.deplacementService.gauche(robotOr,this);
        } else if(entree == 2){
            this.deplacementService.bas(robotOr,this);
        } else if(entree == 3){
            this.deplacementService.droit(robotOr,this);
        } else if(entree == 5){
            this.deplacementService.haut(robotOr,this);
        } else{
            System.out.println("hmmm, pas bon");
        }
    }

    public void deplacementRobotNickel(int entree, RobotNickel robotNickel){
        if(entree == 1){
            this.deplacementService.gauche(robotNickel,this);
        } else if(entree == 2){
            this.deplacementService.bas(robotNickel,this);
        } else if(entree == 3){
            this.deplacementService.droit(robotNickel,this);
        } else if(entree == 5){
            this.deplacementService.haut(robotNickel,this);
        } else{
            System.out.println("hmmm, pas bon");
        }
    }

}
