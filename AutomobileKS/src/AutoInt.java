/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * AutoInt is interface this interface will be implement in the subclass and 
 * overridden.
 * @author Kwentin
 */
public interface AutoInt {
    /**
     * Created abstract methods that will implemented in subclasses. 
     * @return 
     */
    abstract public double calcCost();
    abstract public double calcSalesFee();
    abstract public double calcTaxes();
}
