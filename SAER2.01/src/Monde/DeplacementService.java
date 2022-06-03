package Monde;

import Exceptions.PlanEauException;
import Exceptions.SortieMapException;
import Obstacles.PlanEau;
import Robots.Robot;
import Robots.RobotNickel;
import Robots.RobotOr;

public class DeplacementService implements IDeplacement{


    @Override
    public void gauche(Robot robot, Monde monde) {
       try{
           if( !(robot.getY()-1 <= 0) ){
               if(monde.getComposantMondes()[robot.getX()][robot.getY()-1] instanceof PlanEau){
                   throw new PlanEauException();
               }
               else {
                   robot.setY(robot.getY()-1);
               }
           }
           else{
               throw new SortieMapException();
           }
       }
       catch (SortieMapException | PlanEauException e){
           e.printStackTrace();
       }
    }

    @Override
    public void droit(Robot robot, Monde monde) {
        try{
            if( !(robot.getY()+1 <= 9) ){
                if(monde.getComposantMondes()[robot.getX()][robot.getY()+1] instanceof PlanEau){
                    throw new PlanEauException();
                }
                else {
                    robot.setY(robot.getY()+1);
                }
            }
            else{
                throw new SortieMapException();
            }
        }
        catch (SortieMapException | PlanEauException e){
            e.printStackTrace();
        }
    }

    @Override
    public void haut(Robot robot, Monde monde) {
        try{
            if( !(robot.getX()+1 <= 0) ){
                if(monde.getComposantMondes()[robot.getX()+1][robot.getY()] instanceof PlanEau){
                    throw new PlanEauException();
                }
                else {
                    robot.setX(robot.getX()+1);
                }
            }
            else{
                throw new SortieMapException();
            }
        }
        catch (SortieMapException | PlanEauException e){
            e.printStackTrace();
        }
    }

    @Override
    public void bas(Robot robot, Monde monde) {
        try{
            if( !(robot.getX()-1 <= 9) ){
                if(monde.getComposantMondes()[robot.getX()-1][robot.getY()] instanceof PlanEau){
                    throw new PlanEauException();
                }
                else {
                    robot.setX(robot.getX()-1);
                }
            }
            else{
                throw new SortieMapException();
            }
        }
        catch (SortieMapException | PlanEauException e){
            e.printStackTrace();
        }
    }




}
