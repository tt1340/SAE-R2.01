import Exceptions.SortieMapException;


public abstract class Robot {
    private int x ;
    private int y ;


    public Robot(){
        this.x = 0 ;
        this.y = 0 ;
    }
    public Robot(int x , int y ){
        this.x = x ;
        this.y = y ;
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

    /*
    code a verifer et tester
     */

    //methode de déplacement gauche
    public void gauche(){
        try{
            if(this.getY()-1 < 0){
                throw new SortieMapException();
            } else{
                this.setY(this.getY()-1);
            }
        }
        catch(SortieMapException e){
            e.printStackTrace();
        }
    }
    //methode de déplacement droit
    public void droite(){
        try{
            if(this.getY()+1 > 10){
                throw new SortieMapException();
            }
            else{
                this.setY(this.getY()+1);
            }
        }
        catch(SortieMapException e){
            e.printStackTrace();
        }
    }
    //methode de déplacement haut
    public void haut(){
        try{
            if(this.getX()-1 < 0){
                throw new SortieMapException();
            }
            else{
                this.setX(this.getX()-1);
            }
        }
        catch(SortieMapException e){
            e.printStackTrace();
        }
    }
    //methode de déplacement bas
    public void bas(){
        try {
            if(this.getX()+1 > 10){
                throw new SortieMapException();
            }
            else{
                this.setX(this.getX()+1);
            }
        }
        catch(SortieMapException e){
            e.printStackTrace();
        }
    }

}
