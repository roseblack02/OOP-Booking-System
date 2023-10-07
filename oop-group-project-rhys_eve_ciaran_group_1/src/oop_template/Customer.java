/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_template;

/**
 * 
 * @author R.BLack
 */
public class Customer {
    //states
    private int idNum;
    private String firstName, lastName, phoneNum, email;
    
    /**
    * Constructs a blank customer object
    * 
    */
    public Customer(){
        
    }
    
    //setters
    /**
     * Sets the id number
     * @param value - int
     */
    public void setIDNum(int value){
        idNum = value;
    }
    
    /**
     * Sets the first name
     * @param value - string
     */
    public void setFirstName(String value){
        firstName = value;
    }
    
    /**
     * sets the last name
     * @param value - string
     */
    public void setLastName(String value){
        lastName = value;
    }
    
    /**
     * sets the phone number
     * @param value - string
     */
    public void setPhoneNum(String value){
        phoneNum = value;
    }
    
    /**
     * sets email
     * @param value - string
     */
    public void setEmail(String value){
        email = value;
    }
    
    //getters
    /**
     * returns id number
     * @return idNum - int
     */
    public int getIDNum(){
        return idNum;
    }
    
    /**
     * returns first name
     * @return firstName - string
     */
    public String getFirstName(){
        return firstName;
    }
    
    /**
     * returns last name
     * @return lastName - string
     */
    public String getLastName(){
        return lastName;
    }
    
    /**
     * returns phone number
     * @return phoneNum - string
     */
    public String getPhoneNum(){
        return phoneNum;
    }
    
    /**
     * returns email
     * @return email - string
     */
    public String getEmail(){
        return email;
    }
}
