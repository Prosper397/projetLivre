/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prosper
 */


// la classe principale d'appel



// Classe principale
public class Test {
    public static void main(String[] args) {
        Livre l1 = new Livre("Le petit prince", "St Exupéry", 10400, 50);
        Livre l2 = new Livre("Contes", "Grimm", 14400, 254);

        l1.Afficher();
        l1.Acheter("moi");
        l1.Afficher();
        l1.prix = 0.0;
        l2.Acheter("lui");
        l2.Afficher();
        
BD b1 = new BD("Lucky Luke", "Morris", 10400, 45, true);
        BD b2 = new BD("Tintin", "Hergé", 20040, 45, false);
        b1.Acheter("moi");
        b1.Afficher();
        b2.Afficher();

        Album a1 = new Album("Dora", "Dora", 3500.50, 300);
        a1.Afficher();
        a1.Colorie(23);
        a1.Acheter("moi");
        a1.Colorie(23);
        
        DVD d1 = new DVD("Inception", "Christopher Nolan", 19.9, 148);
        DVD d2 = new DVD("Le Roi Lion", "Disney", 14.0, 88);

System.out.println("=== Affichage des films ===");
        d1.Afficher();
        d2.Afficher();        
    }
}