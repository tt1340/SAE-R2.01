public abstract class Robot {
    private int x ;
    private int y ;

    // CONSTRUCTOR
    public Robot(){
        this.x = 0 ;
        this.y = 0 ;
    }
    public Robot(int x , int y ){
        this.x = x ;
        this.y = y ;
    }

    // GETTER AND SETTER
    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

}
