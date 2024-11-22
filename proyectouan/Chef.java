/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectouan;

/**
 *
 * @author camper
 */
public class Chef {
    private PizzaBuilder builder;

    public void setPizzaBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza getPizza() {
        return builder.getPizza();
    }

    public void construirPizza() {
        builder.buildMasa();
        builder.buildSalsa();
        builder.buildQueso();
        builder.buildIngredientes();
    }
}
