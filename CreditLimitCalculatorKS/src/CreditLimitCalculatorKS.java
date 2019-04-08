/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The purpose this applied is to calculate the the amount of remaining credits
 * left based on chagres, applied credits, and credit limit.
 * @author Kwentin
 */
public class CreditLimitCalculatorKS {
    private int accountNumber;
    private int beginBalance;
    private int charges;
    private int appliedCredits;
    private int creditLimit;

    /**
     * initializes values.
     * @param accountNumber
     * @param beginBalance
     * @param charges
     * @param appliedCredits
     * @param creditLimit 
     */
public CreditLimitCalculatorKS(int accountNumber,int beginBalance,
    int charges,int appliedCredits,int creditLimit){
this.accountNumber = accountNumber;
this.appliedCredits = appliedCredits;
this.beginBalance = beginBalance;
this.creditLimit= creditLimit;
this.charges=charges;

}

/**
 * Using the set method to set the accountNumber values.
 * @param accountNumber 
 */
public void setAccountNumber(int accountNumber) {
    this.accountNumber= accountNumber;
}
/**
 * Using the set method to set the beginBalance values.
 * @param beginBalance 
 */
public void setBeginBalance(int beginBalance) {
    this.beginBalance= beginBalance;
}
/**
 * Using the set method to set the charges values.
 * @param charges 
 */
public void setCharges(int charges) {
this.charges= charges;
 }
/**
 * Using the set method to set the charges values.
 * @param appliedCredits 
 */
public void setAppliedCredits(int appliedCredits) {
this.appliedCredits=appliedCredits;
 }
/**
 * Using the set method to set the creditLimit values.
 * @param creditLimit 
 */
public void setCreditLimit(int creditLimit) {
this.creditLimit=creditLimit;
 }
/**
 * Using the get method to return accountNumber values.
 * @return 
 */
public int getAccountNumber(){
    return accountNumber;
}
/**
 * Using the get method to return beginBalance values.
 * @return 
 */
public int getBeginBalance(){
return beginBalance;
}
/**
 * Using the get method to return charger values.
 * @return 
 */
public int getChargers(){
return charges;
}
/**
 * Using the get method to return creditLimit values.
 * @return 
 */
public int getCreditLimt(){ 
return creditLimit;
}
/**
 * Using the get method to return appliedCredits values.
 * @return 
 */
public int appliedCredits() {
return appliedCredits;
}
/**
 * The calucateBalance() is used to calculate the new amount of avaliable credits
 * if the used has no more credits or own credits then the user will get a 
 * message saying they exceed their credit. Otherwise the program will display
 * the user avaliable credits. The integer total values will return
 * @return 
 */
public int calucateBalance() {
int total = beginBalance+charges-appliedCredits;
if(total < 0){
 System.out.println("Credit limit exceeded");
 }
else{
System.out.printf("Your credit balance is %s%n",total);


}
return total;

}

}
