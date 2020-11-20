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
public class Computador {
    
    private String type;
    private String so;
    private String memory;
    private String disk;
    private boolean batery;

    public Computador() {
    }

    public Computador(String type, String so, String memory, String disk, boolean batery) {
        this.type = type;
        this.so = so;
        this.memory = memory;
        this.disk = disk;
        this.batery = batery;
    }

    public Computador(String type) {
        this.type = type;
    }
    
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public boolean isBatery() {
        return batery;
    }

    public void setBatery(boolean batery) {
        this.batery = batery;
    }

    @Override
    public String toString() {
        return "Computador{" + "Type=" + type + ", \nSO=" + so + ", \nMemory=" + memory + ", \nDisk=" + disk + ", \nBatery=" + batery + '}';
    }
    
    

}
