/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author santiago
 */
public class Materia {
    private int id;
    private String name;
    
    public Materia() {
        
    }
    
    public Materia(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getID(){
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public void setID(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
