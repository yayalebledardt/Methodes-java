public class Voiture {
    String marque;
    String modele;
    int annee;
    double prix;

    public Voiture(String marque, String modele, int annee, double prix){
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prix = prix;
    }

    public void afficherDescription() {
            System.out.println("Marque : " + marque);
            System.out.println("Modèle : " + modele);
            System.out.println("Année : " + annee);
            System.out.println("Prix : " + prix + " €");
        }
    public void appliquerReduction10(){
        this.prix = this.prix - this.prix * 0.1;


    }
}