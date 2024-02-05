/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.systemegestionetudiants;

/**
 *
 * @author rouas
 */
public class Etudiant {
    private String Nom;
    private String Prenom;
    private int NumIns; 
    private String Email;
    
    public Etudiant ( String Nom, String Prenom , int NumIns, String Email){
        this.Nom= Nom;
        this.Prenom= Prenom;
        this.NumIns= NumIns;
        this.Email= Email;
    } 
    public String getName (){
      return this.Nom ;
      
    }
    public void setName (String nom){
        this.Nom= nom;
    }
    public String getPrenom (){
      return(this.Prenom) ;
      
    }
    public void setPrenom (String Prenom){
        this.Prenom= Prenom;
    }
    public String getEmail (){
      return(this.Email) ;
      
    }
    public void setEmail (String Email){
        this.Email= Email;
    }
    public int getNumIns (){
      return(this.NumIns) ;
      
    }
    public void setNumIns (int NumIns){
        this.NumIns= NumIns;
    }
    public String toString (){
        return "Etudiant: nom="+Nom+",prenom="+Prenom+",Numero D'inscription="+NumIns+",Email="+Email;
    }
}
