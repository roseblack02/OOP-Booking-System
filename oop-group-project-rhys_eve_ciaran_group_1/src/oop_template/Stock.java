/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_template;

/**
 *
 * @author R.BLack
 */
public class Stock {
    //states
    private int idNum, quantity;
    private String name;
    
    //constructor
    /**
     * Creates blank stock object
     */
    public Stock(){
        
    }
    
    //setters
    /**
     * Sets the id number
     * @param value - int
     */
    public void setIdNum(int value){
        idNum = value;
    }
    
    /**
     * Sets quantity
     * @param value - int 
     */
    public void setQuantity(int value){
        quantity = value;
    }
    
    /**
     * Sets name
     * @param value - String
     */
    public void setName(String value){
        name = value;
    }
    
    //getters
    /**
     * returns id number
     * @return idNum - int
     */
    public int getIdNum(){
        return idNum;
    }
    
    /**
     * returns quantity
     * @return quantity - int
     */
    public int getQuantity(){
        return quantity;
    }
    
    /**
     * returns name
     * @return name - String
     */
    public String getName(){
        return name;
    }
    
}
