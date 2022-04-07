import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();

        MineNickel mineNickel1 = new MineNickel(15,12,random,1);
        MineOr mineOr1 = new MineOr(14,8,random,2);
        MineNickel mineNickel2 = new MineNickel(32,5,random,3);

        System.out.println("---------Affichage des mines----------- ");
        System.out.println("------------------------------");
        System.out.println(mineNickel1.toString());
        System.out.println("------------------------------");
        System.out.println(mineOr1.toString());
        System.out.println("------------------------------");
        System.out.println(mineNickel2.toString());

        RobotNickel robotNickel = new RobotNickel(1,1,random,1);
        RobotNickel robotNickel2 = new RobotNickel(1,1,random,2);
        RobotNickel robotNickel3 = new RobotNickel(1,1,random,3);

        RobotOr robotOr = new RobotOr(2,45,random,4);
        RobotOr robotOr2 = new RobotOr(2,45,random,4);

        System.out.println("----------Affichage des robots-----------------");
        System.out.println("-----------------------------");
        System.out.println(robotNickel.toString());
        System.out.println("---------------------");
        System.out.println(robotNickel2.toString());
        System.out.println("---------------------");
        System.out.println(robotNickel3.toString());
        System.out.println("---------------------------");
        System.out.println(robotOr.toString());
        System.out.println("----------------------");
        System.out.println(robotOr2.toString());




    }
}
