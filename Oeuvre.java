/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prosper
 */
public class Oeuvre {
    protected String titre;
    protected String auteur;
    protected double prix;
    
    public Oeuvre(String titre, String auteur, double prix){
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }
    
    public void Afficher(){
        System.out.println("Titre :"+ titre);
        System.out.println("Auteur :"+auteur);
        System.out.println("Prix: "+prix + "francs CFA");
    }
}


