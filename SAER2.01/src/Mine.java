import java.util.Random;

public abstract class Mine {
    private final int x ;
    private final int y;

    // CONSTRUCTOR
    public Mine(){
        Random random = new Random();
        this.x = random.nextInt(10);
        this.y = random.nextInt(10);
    }
    // GETTER AND SETTER
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
