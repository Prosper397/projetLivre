/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prosper
 */

// Classe Livre
public class Livre extends Oeuvre{
//
// les attributs
//
protected String proprietaire;
protected int nb_page ;

//
// les méthodes
//
public Livre(String t, String a, double p, int nb){
super(t, a, p);    
proprietaire = "" ;
nb_page = nb ;
}

@Override
public void Afficher() {
super.Afficher();
System.out.println("Nombre de pages : " + nb_page);
if ( this.Est_neuf() ) {
System.out.println("Aucune proprietaire" ) ;
} else {
System.out.println("Proprietaire: "+proprietaire);
}
System.out.println() ;
}
public boolean Est_neuf() {
if ( proprietaire.equals("")) return true ;
else return false ;
}
public void Acheter(String nom) {
proprietaire = nom ;
}
}