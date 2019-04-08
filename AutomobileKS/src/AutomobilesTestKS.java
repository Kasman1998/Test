/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * AutoMobileTEstKS will execute the program,The program will display the 
 * information from the subclasses.
 * @author Kwentin
 */
public class AutomobilesTestKS {
    public static void main(String [] args){
        /**
         * Made an object and intialized values. 
         */
        MustangKS car1 = new MustangKS("Ford","Sedan",2007,"Yellow","Bob",345,90);
        LexusKS car2 = new LexusKS("Lexus","SUV",2017,"Silver","Jack",5459.90);
        BMXKS car3= new BMXKS("BMX","Sedan",2018,"Black","James",9087.90);
        /**
         * Calling methods using objects to display the output for the subclasses. 
         */
        car1.display();
        car2.display();
        car3.display();
        
    }
    
}
