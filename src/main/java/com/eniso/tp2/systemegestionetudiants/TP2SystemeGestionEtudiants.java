/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp2.systemegestionetudiants;

/**
 *
 * @author rouas
 */
import java.util.ArrayList;
public class TP2SystemeGestionEtudiants {

    public static void main(String[] args) {
        Etudiant e1= new Etudiant ( "Roua","Sghaier",148652,"roua@gmail.com");
        ArrayList<Etudiant> listEtudiant = new ArrayList<>();
        listEtudiant.add(e1);
        SystemeGestionEtudiants s= new SystemeGestionEtudiants(listEtudiant);
        s.ajouterEtudiant ("mohamed","azert",147258,"mohamed@gmail.com");
        s.afficherEtudiant();
        s.modifierEmailEtudiant(148652, "ranim@gmail.com");
        s.afficherEtudiant();
        s.supprimerEtudiant(0);
        s.afficherEtudiant();
        
        
    }
}
