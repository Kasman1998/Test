/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *AutomobileKS is a superclass in will share variables with the subclasses.
 * @author Kwentin
 */
public class AutomobilesKS {
    /**
     * Declaring variables
     */
    private String type ;
    private String model;
    private int year;
    private String color;
    private String dealer;
    private double cost;
    /**
     * Built an constructor
     * @param type
     * @param model
     * @param year
     * @param color
     * @param dealer
     * @param cost
     */
    public AutomobilesKS(String type, String model, int year, String color, String dealer,double cost) {
        this.type = type;
        this.model = model;
        this.year = year;
        this.color = color;
        this.dealer = dealer;
        this.cost=cost;
    }
    /**
     * Getters and Setters are used to store and return values
     * @return
     */
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public double getCost() {
        return cost;
    }
    
    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getDealer() {
        return dealer;
    }
    
    public void setDealer(String dealer) {
        this.dealer = dealer;
    }
    /**
     * toString method is used represent String and objects.
     * @return
     */
    @Override
    public String toString() {
        return String.format("%s%s%n%s%s%n%s%s%n%s%s%n%s%s%n%s%s%n","The type is ",getType(),"The model is ",getModel(),
                "The cost is ",getCost(),"The year is ",getYear(),"The color is ",getColor(),"The dealer is ",getDealer());
        
    }
    
    
}
