//********************************************
// Name:                   Mustafa Mohammednafia
// Date:                   8/26/2018
// Instructor:              Cindy Tucker
// Class:                  CIT-149
// Purpose:                kWH  usage of appliances
//********************************************


import java.util.Scanner;

public class Applianceusage {                         
   public static void main (String [] args) { 
       
       
    // declaration of variables and assign the constants. 
    
    
    final float REFRIGERATOR = 57;
    final float DISHWASHER = 13;
    final float OVEN_RANGE = 24;
    final float MICROWAVE = 11;
    final float COFFEE_MACHINE = 10;
    final float COMPUTER = 21;
    final float TV = 23;
    final float WASHER_AND_DRYER = 63;
    final float NIGHT_LIGHT = 1.44F;
    final float DVR = 28.8F;
    final float CHARGE_PER_KWH = 0.09047F;
    final int hoursPerMonth = 720;
    final int daysPerMonth = 30;
    final int hoursPerDay = 24;
    int monthlyCost;
    float totalUsageKhw;
    int numRefrigerator,numDishwasher,numOvenRange,numMicrowave,numCoffeeMachine,numComputer,numTv,numWasherAndDryer,numNightLight,
    numDvr;

    
    Scanner scnr = new Scanner(System.in);
    
    // Getting the number of each device to calculate the KWh per hour.
    
    System.out.println("Enter the number of Refrigerators");
    numRefrigerator = scnr.nextInt();
    System.out.println("You spent " + (REFRIGERATOR * numRefrigerator) / hoursPerMonth + " kWh per hour!");
    System.out.print("\n");
    
    System.out.println("Enter the number of Dishwashers");
    numDishwasher = scnr.nextInt();
    System.out.println("You spent " + (DISHWASHER * numDishwasher) / hoursPerMonth + " kWh per hour!");
    System.out.print("\n");
    
    System.out.println("Enter the number of Ovens or Ranges");
    numOvenRange = scnr.nextInt();
    System.out.println("You spent " + (OVEN_RANGE * numOvenRange) / hoursPerMonth + " kWh per hour!");
    System.out.print("\n");
    
    System.out.println("Enter the number of Microwaves");
    numMicrowave = scnr.nextInt();
    System.out.println("You spent " + (MICROWAVE * numMicrowave) / hoursPerMonth + " kWh per hour!");
    System.out.print("\n");
    
    System.out.println("Enter the number of coffee machines");
    numCoffeeMachine = scnr.nextInt();
    System.out.println("You spent " + (COFFEE_MACHINE * numCoffeeMachine) / hoursPerMonth + " kWh per hour!");
    System.out.print("\n");
    
    System.out.println("Enter the number of computers");
    numComputer = scnr.nextInt();
    System.out.println("You spent " + (COMPUTER * numComputer) / hoursPerMonth + " kWh per hour!");
    System.out.print("\n");
    
    System.out.println("Enter the number of TVs");
    numTv = scnr.nextInt();
    System.out.println("You spent " + (TV * numTv) / hoursPerMonth + " kWh per hour!");
    System.out.print("\n");
    
    System.out.println("Enter the number of washer Dryers");
    numWasherAndDryer = scnr.nextInt();
    System.out.println("You spent " + (WASHER_AND_DRYER * numWasherAndDryer) / hoursPerMonth + " kWh per hour!");
    System.out.print("\n");
    
    System.out.println("Enter the number of night lights you use daily");
    numNightLight = scnr.nextInt();
    System.out.println("You spent " + (NIGHT_LIGHT * numNightLight) / hoursPerMonth + " kWh per hour!");
    System.out.print("\n");
    
    System.out.println("Enter the number of digital video recorder you use daily");
    numDvr = scnr.nextInt();
    System.out.println("You spent " + (DVR * numDvr) / hoursPerDay + " kWh per hour!");
    System.out.print("\n");
    
    /* Calculations to get to the total of KWh.
     * The constants of kWh multiplied by the number of devices will result in the total KWh.
     */ 
    
    
    
    totalUsageKhw = (REFRIGERATOR * numRefrigerator) + (DISHWASHER * numDishwasher) + (OVEN_RANGE * numOvenRange) +
    (MICROWAVE * numMicrowave) + (COFFEE_MACHINE * numCoffeeMachine) + (COMPUTER * numComputer) + (TV * numTv) +
    (WASHER_AND_DRYER * numWasherAndDryer) + (NIGHT_LIGHT * numNightLight) + (DVR * numDvr);
    
    
    System.out.println("The total of the KWh used for all appliances is: " + totalUsageKhw);
    
    // casting the variable to have an integer result.
    
    monthlyCost = (int)(totalUsageKhw * CHARGE_PER_KWH);
    
    System.out.println("The monthly cost for using the devices  is $" + monthlyCost);
    
    
    
    
    
}
}

    

    
    
    

    
    


    



    
    
    
    
    
  





    

    
    
    
    
    
    
    
    

    
    
    
    
    

