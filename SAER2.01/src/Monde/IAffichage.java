package Monde;

import Entrepots.EntrepotNickel;
import Entrepots.EntrepotOr;
import Mines.MineNickel;
import Mines.MineOr;
import Obstacles.PlanEau;
import Robots.RobotNickel;
import Robots.RobotOr;

public interface IAffichage {

    // to string mine or (case)
    public String toStringMineOrCase(MineOr mineOr);

    // to string mine or (recap)
    public String toStringMineOrRecap(MineOr mineOr);

    // to string mine nickel
    public String toStringMineNickelCase(MineNickel mineNickel);

    // to string mine nickel
    public String toStringMineNickelRecap(MineNickel mineNickel);

    // to string entrepot or (case)
    public String toStringEntrepotOrCase(EntrepotOr entrepotOr);

    // to string entrepot or (recap)
    public String toStringEntrepotOrcRecap(EntrepotOr entrepotOr);

    // to string entrepot nickel (case)
    public String toStringEntrepotNickelCase(EntrepotNickel entrepotNickel);

    //to string entrepot nickel (recap)
    public String toStringEntrepotNickelRecap(EntrepotNickel entrepotNickel);

    // to string robot or case
    public String toStringRobotOrCase(RobotOr robotOr);

    // to string robot or recap
    public String toStringRobotOrRecap(RobotOr robotOr);

    // to string robot nickel case
    public String toStringRobotNickelCase(RobotNickel robotNickel);

    // to string robot nickel recap
    public String toStringRobotNickelRecap(RobotNickel robotNickel);

    //to string plan d'eau
    public String toStringPlanEauCase(PlanEau planEau);


    // to string vide
    public String vide();
}
