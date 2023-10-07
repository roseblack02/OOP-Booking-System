package oop_template;

public class staff{
    //states
    private int idNum;
    private int hours;
    private float wage;
    private String firstName, lastName, phoneNum, email,startDate,Address;
    
    //constructor
    public staff(){
        
    }
    
    
    //setters
    public void setId(int value){
        idNum = value;
    }
    
    public void setHours(int value){
        hours = value;
    }
    
    public void setWage(int value){
        wage = value;
    }
    
    public void setFirstName(String value){
        firstName = value;
    }
    
    public void setLastName(String value){
        lastName = value;
    }
    
    public void setphoneNum(String value){
        phoneNum = value;
    }
    
    public void setemail(String value){
        email = value;
    }
    
    public void setStartDate(String value){
        startDate = value;
    }
    
    public void setAddress(String value){
        Address = value;
    }
    
    //getters
    public int getId(){
        return idNum;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getPhoneNum(){
        return phoneNum;
    }
    
    public String getEmail(){
        return email;
    
    }
    public int getHours(){
        return hours;
    }
    public float getWage(){
        return wage;
    }
    
    public String getStartDate(){
        return startDate;
    }
    public String getAddress(){
        return Address;
    }
}


