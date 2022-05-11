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

    // méthode pour récupérer des minerais
    public void recupMineraisNickel(){
        //todo
    }
    // methode to string pour le récap
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

