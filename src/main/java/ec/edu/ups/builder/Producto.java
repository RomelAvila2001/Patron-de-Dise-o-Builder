/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.builder;

/**
 *
 * @author NANCY
 */
public class Producto {
    public static void main(String [] args){
        
        BuilderInterface laptop = new ConcreteBuilderLaptop();
        Director director = new Director(laptop);
        Computador computador = director.builder();
        System.out.println(computador.toString());
        
        System.out.println("-----------------------------------------");
        
        BuilderInterface Escritorio = new ConcretBuilderEscritorio();
        Director directorE = new Director(Escritorio);
        Computador escritorio = directorE.builder();
        System.out.println(escritorio.toString());
    }
}
