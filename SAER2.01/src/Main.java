import Entrepots.EntrepotNickel;
import Entrepots.EntrepotOr;
import Exceptions.GenerationMondeEchecException;
import Mines.MineNickel;
import Mines.MineOr;
import Monde.Monde;
import Robots.RobotNickel;
import Robots.RobotOr;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    // todo revoir les conditions de la génération
    public static void main(String[] args){
        Random random = new Random();

        Monde monde = new Monde(random.nextInt(4), random.nextInt(10));
        RobotNickel RN = new RobotNickel(1);
        RobotOr RO = new RobotOr(2);
        try{
            for(int i = 0 ; i<monde.getComposantMondes().length;i++) {
                for (int j = 0; j < monde.getComposantMondes()[0].length; j++) {
                    // test de génération des Mines
                    if (monde.getComposantMondes()[i][j] instanceof MineNickel || monde.getComposantMondes()[i][j] instanceof MineOr) {
                        for (int k = 0; k < monde.getMineOrs().size(); k++) {

                            for (int l = 0; l < monde.getMineNickels().size(); l++) {

                                if ((monde.getMineOrs().get(k).getX() == monde.getMineNickels().get(l).getX()
                                        && monde.getMineOrs().get(k).getY() == monde.getMineNickels().get(l).getY())
                                        || //X
                                        (monde.getMineOrs().get(k).getX() == monde.getEntrepotNickel().getX()
                                                && monde.getMineOrs().get(k).getX() == monde.getEntrepotOr().getX()
                                                && monde.getMineNickels().get(l).getX() == monde.getEntrepotNickel().getX()
                                                && monde.getMineNickels().get(l).getX() == monde.getEntrepotOr().getX()
                                                //Y
                                                && monde.getMineOrs().get(k).getY() == monde.getEntrepotNickel().getY()
                                                && monde.getMineOrs().get(k).getY() == monde.getEntrepotOr().getY()
                                                && monde.getMineNickels().get(l).getY() == monde.getEntrepotNickel().getY()
                                                && monde.getMineNickels().get(l).getY() == monde.getEntrepotOr().getY())) {
                                    throw new GenerationMondeEchecException();
                                } else{
                                    // verification pour les plans d'eau
                                    for(int m = 0 ; m<monde.getPlanEaus().size();m++){
                                        if( //X
                                                monde.getPlanEaus().get(m).getX() == monde.getMineNickels().get(l).getX()
                                                && monde.getPlanEaus().get(m).getX() == monde.getMineOrs().get(k).getX()
                                                && monde.getPlanEaus().get(m).getX() == monde.getEntrepotNickel().getX()
                                                && monde.getPlanEaus().get(m).getX() == monde.getEntrepotOr().getX()
                                                        //Y
                                                && monde.getPlanEaus().get(m).getY() == monde.getMineNickels().get(l).getY()
                                                && monde.getPlanEaus().get(m).getY() == monde.getMineOrs().get(k).getY()
                                                && monde.getPlanEaus().get(m).getY() == monde.getEntrepotNickel().getY()
                                                && monde.getPlanEaus().get(m).getY() == monde.getEntrepotOr().getY()
                                        ){
                                            throw new GenerationMondeEchecException();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    // test de generation des robots nickel
                    if(monde.getComposantMondes()[i][j] instanceof RobotNickel){
                        for(int n = 0 ; n<monde.getPlanEaus().size();n++){
                            if(
                                    monde.getRobotNickel().getX() == monde.getPlanEaus().get(n).getX()
                                    &&  monde.getRobotNickel().getY() == monde.getPlanEaus().get(n).getY()
                            ){
                                throw new GenerationMondeEchecException();
                            }
                        }
                    }
                    // test de generation des robots or
                    if(monde.getComposantMondes()[i][j] instanceof RobotOr){
                        for (int o = 0 ; o<monde.getPlanEaus().size();o++){
                            if(
                                    monde.getRobotOr().getX() == monde.getPlanEaus().get(o).getX()
                                    && monde.getRobotOr().getY() == monde.getPlanEaus().get(o).getY()
                            ){
                                throw new GenerationMondeEchecException();
                            }
                        }
                    }


                }
            }
        } catch (GenerationMondeEchecException e){
            System.out.println("Génération du monde en cours ...");
            main(args);
        }
        System.out.println("Génération terminé");

        System.out.println(monde.toString());



        // boucle pour le jeu
        while(monde.getNbTour() < 200){
            monde.setNbTour(monde.getNbTour()+1);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Déplacement robot, choisissez : RO : 1. RN : 2");
            int robot = scanner.nextInt();

            // Robot or déplacement
            if (robot == 1){
                Scanner robO = new Scanner(System.in);
                System.out.println("gauche : 1 , bas : 2 , droite : 3 , haut : 5");
                int robot2 = robO.nextInt();

                if (robot2 == 1){
                    monde.deplacementRobotOr(1,RO);
                }
                if (robot2 == 2){
                    monde.deplacementRobotOr(2,RO);
                }
                if (robot2 == 3){
                    monde.deplacementRobotOr(3,RO);
                }
                if (robot2 == 5){
                    monde.deplacementRobotOr(5,RO);
                }
            }
            // Robot Nickel déplacement
            if (robot == 2){
                robot = 0;
                Scanner rob1 = new Scanner(System.in);
                System.out.println("gauche : 1 , bas : 2 , droite : 3 , haut : 5");
                robot = rob1.nextInt();

                if (robot == 1){
                    monde.deplacementRobotNickel(1,RN);
                }
                if (robot == 2){
                        monde.deplacementRobotNickel(2,RN);
                }
                if (robot == 3){
                    monde.deplacementRobotNickel(3,RN);
                }
                if (robot == 5){
                    monde.deplacementRobotNickel(5,RN);
                }
            }

            System.out.println(monde.toString());
            System.out.println(monde.toStringRecap());

        }






    }
}
