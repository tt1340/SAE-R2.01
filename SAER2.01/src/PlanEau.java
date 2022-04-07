import java.util.Random;

public class PlanEau {
    private int x ;
    private  int y ;

    public PlanEau(){
        this.x = 0 ;
        this.y = 0 ;
    }
    public PlanEau(Random random){
        this.x = 50+ random.nextInt(100-50);
        this.y = 50+ random.nextInt(100-50);

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
