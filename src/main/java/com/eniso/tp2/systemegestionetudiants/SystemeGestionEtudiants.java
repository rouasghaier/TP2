/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.systemegestionetudiants;

/**
 *
 * @author rouas
 */
import java.util.ArrayList;
public class SystemeGestionEtudiants {
    public ArrayList <Etudiant> list;
    public SystemeGestionEtudiants(ArrayList <Etudiant> list){
        this.list = list;
    } 
    
    
    public void ajouterEtudiant (String Nom, String Prenom, int NumIns , String Email){
        Etudiant e = new Etudiant(Nom, Prenom, NumIns, Email); 
        list.add (e);
        
    }
    public void afficherEtudiant (){
        for ( Etudiant e:list){
         System.out.println(e.toString());
      }
    }
    public void modifierEmailEtudiant (int NumIns, String nouvelEmail) {
        for ( Etudiant e:list){
           if (e.getNumIns()== NumIns ){
               e.setEmail(nouvelEmail);
           }
            
        }
    }
    public void supprimerEtudiant ( int NumIns){
        for (Etudiant e:list){
            if (e.getNumIns()== NumIns ){
                list.remove(e);
            }
        }
    }
    
    
}
