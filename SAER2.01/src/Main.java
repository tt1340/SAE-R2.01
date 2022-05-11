import Entrepots.EntrepotNickel;
import Entrepots.EntrepotOr;
import Exceptions.GenerationMondeEchecException;
import Mines.MineNickel;
import Mines.MineOr;
import Monde.Monde;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();

        Monde monde = new Monde(random.nextInt(4), random.nextInt(10));
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

                                    }
                                }
                            }
                        }
                    }
                    // test de generation des entrepots
                    if (monde.getComposantMondes()[i][j] instanceof EntrepotOr || monde.getComposantMondes()[i][j] instanceof EntrepotNickel) {
                        if (monde.getEntrepotOr().getX() == monde.getEntrepotNickel().getX() && monde.getEntrepotOr().getY() == monde.getEntrepotNickel().getY()) {
                            throw new GenerationMondeEchecException();
                        }
                    }

                }
            }
        } catch (GenerationMondeEchecException e){
            System.out.println("Génération du monde en cours ...");
            main(args);
        }
        // boucle pour le jeu
        while(true){
            //todo
        }








    }
}
