public class Main {
    static void main() {

        Voiture v1 = new Voiture("Peugeot", "208", 2021, 14500);

        System.out.println("Marque : " + v1.marque);
        System.out.println("Modèle : " + v1.modele);
        System.out.println("Année : " + v1.annee);
        System.out.println("Prix : " + v1.prix + "€");

        v1.afficherDescription();

        v1.appliquerReduction(30);
        v1.afficherDescription();
        .



    }
}