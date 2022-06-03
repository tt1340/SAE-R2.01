package Robots;

import Exceptions.PlanEauException;
import Exceptions.SortieMapException;
import Monde.ComposantMonde;

import java.util.Random;

public abstract class Robot extends ComposantMonde {
    private int x ;
    private int y ;
    private final int indice;

    public Robot(int indice ){
        Random random = new Random();
        this.x = random.nextInt(10) ;
        this.y = random.nextInt(10) ;
        this.indice = indice;
    }


    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getIndice() {
        return indice;
    }

}
