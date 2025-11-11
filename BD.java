/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prosper
 */

// classe BD
public class BD extends Livre {
//
// les attributs
//
private boolean encouleur ;
//
// les méthodes
//
public BD(String t,String a,double p,int nb, boolean c){
super(t,a,p,nb) ;
encouleur = c ;
}

/*Le site web veut donner la possibilité aux utilisateurs de s’échanger deux bandes dessinées
si elles ont un prix équivalent. Modifier le programme précédent pour prendre en compte ces
fonctions supplémentaires.*/
public void echanger(BD b){
    String pro = this.proprietaire; // On stocke this.proprietaire dans pro
    if(this.prix == b.prix){
        this.proprietaire = b.proprietaire;
        b.proprietaire = pro; 
    }
}

/*3) En plus des informations d’une bande dessinée, on souhaite savoir si elle est en couleur ou
pas. Redéfinissez la méthode Afficher dans la classe BD pour afficher cette information.*/
@Override
public void Afficher(){
    super.Afficher();   // On se sert de la méthode "afficher" de la classe mère.
    if(encouleur){
        System.out.println("La bande déssinée est pas en couleur.");
    }
    else {
        System.out.println("La bande déssinée n'est en couleur");
    }
    
    
}


}