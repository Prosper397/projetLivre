/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prosper
 */

// classe Album
public class Album extends Livre {
//
// les attributs
//
boolean page_coloriee[];    // Par défaut, c'est 1 tableau qui ne contient que des "false"
//
// les méthodes
//
public Album(String t, String a, double p, int n){
super(t,a,p,n) ;
page_coloriee = new boolean[n];
int i ;
for (i=0 ; i<100 ; i++)
page_coloriee[i] = false ;
}
public void Colorie(int num_page){
if((page_coloriee[num_page] == false) && !Est_neuf()){
page_coloriee[num_page] = true ;
} else {
System.out.println("page deja coloriee" ) ;
}
}
}