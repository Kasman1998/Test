/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 * The BulidingCarbonKS class will be implement the CarbonFootPrintIN
 * @author Kwentin
 */
public class BuildingCarbonKS implements CarbonFootPrintIN {
    /**
     * Initialized the variables.
     */
    private double kwhPrice =0.12;
    private double electrictyEmission=1.37;
    private double electrictyBill = 90.16;
    /**
     * Default Constructor
     */
    public BuildingCarbonKS() {
    }
    /**
     * Setter and Getters are used to store and return values.
     * @return
     */
    public double getKwhPrice() {
        return kwhPrice;
    }
    
    public void setKwhPrice(double kwhPrice) {
        this.kwhPrice = kwhPrice;
    }
    
    public double getElectrictyEmission() {
        return electrictyEmission;
    }
    
    public void setElectrictyEmission(double electrictyEmission) {
        this.electrictyEmission = electrictyEmission;
    }
    
    public double getElectrictyBill() {
        return electrictyBill;
    }
    
    public void setElectrictyBill(double electrictyBill) {
        this.electrictyBill = electrictyBill;
    }
    
    /**
     * carbonFootPrint() method is used to calucate  the footprint.
     * @return
     */
    @Override
    public double carbonFootPrint() {
        return (getElectrictyBill()/getKwhPrice())*getElectrictyEmission()*electrictyEmission*12;
    }
    
    /**
     * ToString is used to represent strings and objects
     * @return
     */
    @Override
    public String toString(){
        return String.format("%s%n%s%n%s%n%s%n%s%n%s%n%s","\nBuilding Carbon","The Price Per Kwh ",getKwhPrice(),
                "Electricty Emission ",getElectrictyEmission(),"Electricty Bill ",getElectrictyBill());
    }
    /**
     * display() is used to display toString() method.
     */
    public void display(){
        System.out.println(toString());
    }
    
    
}
