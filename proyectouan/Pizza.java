/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectouan;

/**
 *
 * @author camper
 */
public class Pizza {
    private String masa;
    private String salsa;
    private String queso;
    private String ingredientes;

    // Setters para cada atributo
    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public void setQueso(String queso) {
        this.queso = queso;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Pizza [Masa: " + masa + ", Salsa: " + salsa + ", Queso: " + queso + ", Ingredientes: " + ingredientes + "]";
    }
}
