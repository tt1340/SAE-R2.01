import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();

        MineNickel mineNickel1 = new MineNickel(1);
        MineOr mineOr1 = new MineOr(2);
        MineNickel mineNickel2 = new MineNickel(3);

        System.out.println(mineOr1.toStringGeneral());
        System.out.println(mineOr1.toStringMap());

        System.out.println(mineNickel1.toStringGeneral());
        System.out.println(mineNickel1.toStringMap());








    }
}