/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *The BMXKS class is a subclass that inheriting variables in the superclass(Auto-
 * mobilesKS and implementing method from implementing the AutoInt interface.
 * @author Kasman98
 */
public class BMXKS extends AutomobilesKS implements AutoInt {
    /**
     *SalesPurchase variable is declared and intialized. 
     *
     */  
      int salesPurchase=500;
/**
 * Built an constructor and super constructor for the superclass.
 * @param type
 * @param model
 * @param year
 * @param color
 * @param dealer
 * @param cost 
 */
    public BMXKS(String type, String model, int year, String color, String dealer, double cost) {
        super(type, model, year, color, dealer, cost);
    }
/**
 * Setters and getters are used to store and return values.
 * @return 
 */
    public int getSalesPurchase() {
        return salesPurchase;
    }

    public void setSalesPurchase(int salesPurchase) {
        this.salesPurchase = salesPurchase;
    }
    /**
     * calcCost() method is used to calcuate is  the total cost.
     * @return 
     */
    @Override
    public double calcCost() {
      return calcSalesFee()+calcTaxes();
    }
/**
 * calcSalesFee() method used to add the cost plus the sales purchase cost.
 * @return 
 */
    @Override
    public double calcSalesFee() {
    return getCost() + getSalesPurchase();
    }
/**
 * calcTaxes() method is used to calcuate the tax.
 * @return 
 */
    @Override
    public double calcTaxes() {
    return getCost() * 0.10;
    }
   /**
    * toString override is used to include calcTaxes() and calcCost().
    * @return 
    */
    @Override
    public String toString(){
        return String.format("%s%s%s%n%s%s%n",super.toString(),"The taxes is ",calcTaxes(),
                "The total cost is ",calcCost());
    }
    /**
     * display() method is used to display the toString().
     */
            public void display(){
                System.out.println("Car 3:");
                System.out.println(toString());
            }
            
}
    

