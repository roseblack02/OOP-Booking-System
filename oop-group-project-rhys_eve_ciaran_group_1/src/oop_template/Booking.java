package oop_template;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eve Price
 */
public class Booking {
    
    private String BookingID, CustomerID, StaffID;
    private String Date, Time;
    private String LengthEstimate;
    private String Price;
// ---------------------Constructor----------------------------
    public Booking(){

    }
// ---------------------end of constructor---------------------
        
// ---------------------setters--------------------------------    
    
    public void setBookingID(String value){
        this.BookingID = value;
    }
        
    public void setCustomerID(String value){
        this.CustomerID = value;
    }

    public void setStaffID(String value){
        this.StaffID = value;
    }
        
    public void setDate(String value){
        this.Date = value;
    }
    
    public void setTime(String value){
        this.Time = value;
    }
        
    public void setLengthEstimate(String value){
        this.LengthEstimate = value;
    }
        
    public void setPrice(String value){
        this.Price = value;
    }
// ---------------------end of setters-------------------------
// ---------------------getters--------------------------------    
    
    public String getBookingID(){
        return this.BookingID;
    }
        
    public String getCustomerID(){
        return this.CustomerID;
    }

    public String getStaffID(){
        return this.StaffID;
    }
        
    public String getDate(){
        return this.Date;
    }
    
    public String getTime(){
        return this.Time;
    }
        
    public String getLengthEstimate(){
        return this.LengthEstimate;
    }
        
    public String getPrice(){
        return this.Price;
    }
// ---------------------end of getters------------------   
// -----------------------------------------------------
  
}
