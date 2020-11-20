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
public interface BuilderInterface {
    public void  buildBatery ();
    public void  buildDisk ();
    public void  buildMemory ();
    public void  buildSO ();
    Computador  getObject ();
}
