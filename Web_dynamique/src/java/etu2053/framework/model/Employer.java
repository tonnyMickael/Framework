/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etu2053.framework.model;

import etu2053.framework.annotation.Url;

/**
 *
 * @author mickael
 */
public class Employer {
    int id;
    String nom;

    @Url(lien="emp_all")
    public String findAll(){
        return "Find All Employer";
    }
    
    @Url(lien="add_emp")
    public String addEmp(){
        return "Add Employer";
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
