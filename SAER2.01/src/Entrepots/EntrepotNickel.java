package Entrepots;

public class EntrepotNickel extends Entrepot {
    private int stockage ;

    public EntrepotNickel(int indice){
        super(indice);
        this.stockage = 0 ;
    }

    public void setStockage(int stockage) {
        this.stockage = stockage;
    }

    public int getStockage() {
        return stockage;
    }


}

