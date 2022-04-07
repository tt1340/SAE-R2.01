public abstract class Mine {
    private int x ;
    private int  y;

    // CONSTRUCTOR
    public Mine(){
        this.x = 0 ;
        this.y = 0 ;
    }

    public Mine(int x , int y ){
        this.x = x ;
        this.y = y ;
    }
    // GETTER AND SETTER
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
