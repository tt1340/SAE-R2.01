package Monde;

import java.util.Random;

public abstract class ObjetTerrain extends ComposantMonde {
    private final int x ;
    private final int y ;

    // cette classe va permettre de spécifier tous les objets qui ne peuvent pas
    // se déplacer (mines , plan d'eau, entrepot)

    // constructor
    public ObjetTerrain() {
        Random random = new Random();
        this.x = random.nextInt(10);
        this.y = random.nextInt(10);
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }



}
