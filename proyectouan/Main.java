/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectouan;

/**
 *
 * @author camper
 */
public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();

        // Usar el Builder para hacer una pizza hawaiana
        PizzaBuilder hawaianaBuilder = new PizzaHawaianaBuilder();
        chef.setPizzaBuilder(hawaianaBuilder);
        chef.construirPizza();

        Pizza pizza = chef.getPizza();
        System.out.println(pizza);
    }
}
