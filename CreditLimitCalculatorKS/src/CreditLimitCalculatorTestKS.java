/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The purpose this file is to display the user amount of credits.If user is 
 * out of credits they receive tell them credit limit exceeded. Otherwise they 
 * amount of remaining credits will be displayed.
 * @author Kwentin
 */
public class CreditLimitCalculatorTestKS {
    /**
     * The main method has are constructor from the "CreditLimitCalulatorKS" file
     * this constructor also has are  initializes values in there.
     * @param args 
     */
    public static void main(String[] args) {
 CreditLimitCalculatorKS check = new CreditLimitCalculatorKS(117298,100,500,59,500); 
 /**
  *  The check is the object and CalucateBalance() is the method.
  * This method allows for the program to execute the calculate and 
  * display the results.
  */
        check.calucateBalance();
    }
}
