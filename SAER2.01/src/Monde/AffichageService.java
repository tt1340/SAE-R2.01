package Monde;

import Entrepots.EntrepotNickel;
import Entrepots.EntrepotOr;
import Mines.MineNickel;
import Mines.MineOr;
import Obstacles.PlanEau;
import Robots.RobotNickel;
import Robots.RobotOr;

public class AffichageService implements IAffichage{

    public AffichageService(){

    }
    @Override
    public String toStringMineOrCase(MineOr mineOr) {
        return "|M "+mineOr.getIndice() + "|";
    }

    @Override
    public String toStringMineOrRecap(MineOr mineOr) {
        return "M "+ mineOr.getIndice() + " or " +mineOr.getOrRestant() + " / " + mineOr.getQuantiteOr() ;
    }

    @Override
    public String toStringMineNickelCase(MineNickel mineNickel) {
        return "|M "+mineNickel.getIndice()+ "|";
    }

    @Override
    public String toStringMineNickelRecap(MineNickel mineNickel) {
        return "M "+ mineNickel.getIndice() + " nickel " + mineNickel.getNickelRestant() + " / " + mineNickel.getQuantiteNickel() ;
    }

    @Override
    public String toStringEntrepotOrCase(EntrepotOr entrepotOr) {
        return "|E O|" ;
    }

    @Override
    public String toStringEntrepotOrcRecap(EntrepotOr entrepotOr) {
        return "E O" + entrepotOr.getStockageOr();
    }

    @Override
    public String toStringEntrepotNickelCase(EntrepotNickel entrepotNickel) {
        return "|E N|";
    }

    @Override
    public String toStringEntrepotNickelRecap(EntrepotNickel entrepotNickel) {
        return "E nickel "+ entrepotNickel.getStockage() ;
    }

    @Override
    public String toStringRobotOrCase(RobotOr robotOr) {
        return "|R " + robotOr.getIndice()+"|";
    }

    @Override
    public String toStringRobotOrRecap(RobotOr robotOr) {
        return "R or " + robotOr.getStockInitial() + " / " + robotOr.getStockMax() + " x :" + robotOr.getX() + " y :"+robotOr.getY() ;
    }

    @Override
    public String toStringRobotNickelCase(RobotNickel robotNickel) {
        return "|R " + robotNickel.getIndice()+"|";
    }

    @Override
    public String toStringRobotNickelRecap(RobotNickel robotNickel) {
        return "R N" + robotNickel.getStockInitial() + " / " + robotNickel.getStockMax() + " x :" + robotNickel.getX() + " y :"+robotNickel.getY();
    }

    @Override
    public String toStringPlanEauCase(PlanEau planEau) {
        return "|X X|";
    }


    @Override
    public String vide() {
        return "|   |";


}}
