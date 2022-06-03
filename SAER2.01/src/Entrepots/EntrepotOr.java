package Entrepots;

public class EntrepotOr extends Entrepot {
    private int stockageOr;

    public EntrepotOr(int indice){
        super(indice);
        this.stockageOr = 0 ;
    }

    public int getStockageOr() {
        return stockageOr;
    }

    public void setStockageOr(int stockageOr) {
        this.stockageOr = stockageOr;
    }


}
