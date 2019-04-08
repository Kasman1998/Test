/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/



/**
 * The PlaneCarbonKS class will be implement the CarbonFootPrintIN
 * @author Kwentin
 */
public class PlaneCarbonKS implements CarbonFootPrintIN{
    private double emissionAverage =223;
    private double pumpFactor=1.2;
    private double forcingFactoring=1.9;
    private double poundCoversion =0.222;
    private double airMiles=10000;
    /**
     * Default Constructor
     */
    public PlaneCarbonKS() {
    }
    /**
     * Setter and Getters are used to store and return values.
     * @return
     */
    public double getEmissionAverage() {
        return emissionAverage;
    }
    
    public void setEmissionAverage(double emissionAverage) {
        this.emissionAverage = emissionAverage;
    }
    
    public double getPumpFactor() {
        return pumpFactor;
    }
    
    public void setPumpFactor(double pumpFactor) {
        this.pumpFactor = pumpFactor;
    }
    
    public double getForcingFactoring() {
        return forcingFactoring;
    }
    
    public void setForcingFactoring(double forcingFactoring) {
        this.forcingFactoring = forcingFactoring;
    }
    
    public double getPoundCoversion() {
        return poundCoversion;
    }
    
    public void setPoundCoversion(double poundCoversion) {
        this.poundCoversion = poundCoversion;
    }
    
    public double getAirMiles() {
        return airMiles;
    }
    
    public void setAirMiles(double airMiles) {
        this.airMiles = airMiles;
    }
    /**
     * carbonFootPrint() method is used to calucate  the footprint.
     * @return
     */
    @Override
    public double carbonFootPrint() {
        return getAirMiles()*(getEmissionAverage()*getPumpFactor()
                *getForcingFactoring())* getPoundCoversion();
    }
    /**
     * ToString is used to represent strings and objects
     * @return
     */
    @Override
    public String toString(){
        return String.format("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s","\nPlane Carbon","Average Emission",getEmissionAverage(),"Pump Factor",
                getPumpFactor(),"Forcing Factoring",getForcingFactoring(),"Pound Conversion",getPoundCoversion());
    }
    /**
     * display() is used to display toString() method.
     */
    public void display(){
        System.out.println(toString());
        /**
         * Created Array to display Polymorphically.
         */
        CarbonFootPrintIN carbon[]={
            new BuildingCarbonKS(),new CarCarbonKS(), new PlaneCarbonKS()};
        /**
         * For enhanced loop is used to add the carbonFootPrint() method
         */
        for(CarbonFootPrintIN foot:carbon){
            System.out.println("\nDisplay Polymorphically: ");
            System.out.println(foot.toString());
            System.out.println("The Carbon Footprint is");
            System.out.println(foot.carbonFootPrint());
            
            
        }
    }
}