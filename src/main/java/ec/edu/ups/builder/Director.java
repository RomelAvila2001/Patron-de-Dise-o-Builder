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
public class Director {
    
   private BuilderInterface builderComputador;

    public Director(BuilderInterface bulderComputador){
        this.builderComputador = bulderComputador;
    }
    public Computador builder(){
        builderComputador.buildBatery();
        builderComputador.buildDisk();
        builderComputador.buildMemory();
        builderComputador.buildSO();
        return builderComputador.getObject();
    }
}
