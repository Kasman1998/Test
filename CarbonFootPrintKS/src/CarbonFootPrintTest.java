/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 * CarbonFootPrintTest class is used to execute the program.
 * @author Kwentin
 */
public class CarbonFootPrintTest {
    /**
     * main() method is used to execute the program
     * @param args
     */
    public static void main(String [] args){
        /**
         * Created objects.
         */
        CarCarbonKS carbon1 = new CarCarbonKS();
        BuildingCarbonKS building = new BuildingCarbonKS();
        PlaneCarbonKS plane= new PlaneCarbonKS();
        /**
         * Calling the display method to display the output thru the objects.
         */
        carbon1.display();
        building.display();
        plane.display();
        
        
    }
    
}
