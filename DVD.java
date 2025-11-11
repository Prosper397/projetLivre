/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prosper
 */
public class DVD extends Oeuvre{
    private int duree;
    public DVD(String t, String a, double p,int duree){
        super(t, a, p);
        this.duree = duree;
    }
    @Override
    public void Afficher(){
        super.Afficher();
        System.out.println("Durée du film est:"+duree+"minutes");
    }
}
