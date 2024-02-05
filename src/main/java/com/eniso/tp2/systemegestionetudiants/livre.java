/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.systemegestionetudiants;

/**
 *
 * @author rouas
 */
public class livre {
    
    private String title;
    private String auteur;
    public String annee;
    public int ISBN ;
    
    public String getTitle (){
      return this.title ;
      
    }
    public void setTitle (String title){
        this.title= title;
    }
    public String getAuteur (){
      return this.auteur ;
      
    }
    public void setAuteur (String auteur){
        this.auteur= auteur ;
    }
    public String getAnnee (){
      return this.annee ;
      
    }
    public void setAnnee (String annee){
        this.annee= annee;
    }
    public int getISBN (){
      return this.ISBN ;
      
    }
    public void setISBN (int ISBN){
        this.ISBN= ISBN;
    }
    public livre(){
        this.title = "princesse"; 
        this.auteur = "azeerty";
        this.annee = "juin2010";
        this.ISBN = 147258;
    }
    public livre (String title, String auteur, String annee, int ISBN){
        this.title = title; 
        this.auteur = auteur;
        this.annee = annee;
        this.ISBN = ISBN;
    }
  
    public livre (String title, String auteur){
        this.title = title; 
        this.auteur = auteur;
        this.annee = "janv1991";
        this.ISBN = 987654;
    }
   public livre (String title, String auteur, String annee){
        this.title = title; 
        this.auteur = auteur;
        this.annee = annee;
        this.ISBN = 14788;
    } 

}
