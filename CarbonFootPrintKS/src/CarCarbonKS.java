

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 * The CarCarbonKS class will be implement the CarbonFootPrintIN
 * @author Kwentin
 */
public class CarCarbonKS implements CarbonFootPrintIN {
    private double gallonPrice=2.88;
    private double emissionOil=22.37;
    private double propaneBill=60.96;
    /**
     * Default Constructor
     */
    public CarCarbonKS() {
    }
    /**
     * Setter and Getters are used to store and return values.
     * @return
     */
    public double getGallonPrice() {
        return gallonPrice;
    }
    
    public void setGallonPrice(double gallonPrice) {
        this.gallonPrice = gallonPrice;
    }
    
    public double getEmissionOil() {
        return emissionOil;
    }
    
    public void setEmissionOil(double emissionOil) {
        this.emissionOil = emissionOil;
    }
    
    public double getPropaneBill() {
        return propaneBill;
    }
    
    public void setPropaneBill(double propaneBill) {
        this.propaneBill = propaneBill;
    }
    /**
     * carbonFootPrint() method is used to calucate  the footprint.
     * @return
     */
    @Override
    public double carbonFootPrint() {
        return (getPropaneBill()/getGallonPrice())*getEmissionOil()*12;
    }
    /**
     * ToString is used to represent strings and objects
     * @return
     */
    @Override
    public String toString(){
        return String.format("%s%n%s%n%s%n%s%n%s%n%s%n%s","\nCar Carbon","Propane:",getPropaneBill(),
                "Gallon Price: ",getGallonPrice(),"Emission Oil Factor;",getEmissionOil());
    }
    /**
     * display() is used to display toString() method.
     */
    public void display(){
        System.out.println(toString());
    }
}
