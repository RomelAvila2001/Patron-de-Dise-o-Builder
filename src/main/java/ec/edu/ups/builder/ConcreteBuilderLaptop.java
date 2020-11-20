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
public class ConcreteBuilderLaptop implements BuilderInterface{

    private Computador compu= new Computador("Laptop");
    
    @Override
    public void buildBatery() {
        compu.setBatery(true);
    }

    @Override
    public void buildDisk() {
        compu.setDisk("Disco del ordenador 1 TB ");
    }

    @Override
    public void buildMemory() {
        compu.setMemory("Memoria del ordenador 8 GB");
    }

    @Override
    public void buildSO() {
        compu.setSo("Windous");
    }

    @Override
    public Computador getObject() {
        return compu;
    }
    
}
