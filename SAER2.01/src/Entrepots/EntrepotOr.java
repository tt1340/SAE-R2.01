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

    // méthode pour récupérer de l'or
    public void recupMineraisOr(){
        //todo
    }
    // methode to strong pour le recap
    public String toStringRecap(){
        //todo
        return "";
    }

    // methode to string pour l'affichage des cases
    public String toStringCase(){
        //todo
        return "";
    }
}
