package Monde;

import Robots.Robot;
import Robots.RobotNickel;
import Robots.RobotOr;

public interface IDeplacement {

    // déplacement robot or
    public void gauche(Robot robot, Monde monde);

    public void droit(Robot robot, Monde monde);

    public void haut(Robot robot, Monde monde);

    public void bas(Robot robot, Monde monde);


}
