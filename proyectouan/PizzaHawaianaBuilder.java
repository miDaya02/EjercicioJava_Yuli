/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectouan;

/**
 *
 * @author camper
 */
public class PizzaHawaianaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public PizzaHawaianaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildMasa() {
        pizza.setMasa("Suave");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("Dulce");
    }

    @Override
    public void buildQueso() {
        pizza.setQueso("Mozzarella");
    }

    @Override
    public void buildIngredientes() {
        pizza.setIngredientes("Piña y jamón");
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}

