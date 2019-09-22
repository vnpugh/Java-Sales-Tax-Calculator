import java.util.Scanner;

public class SalesTax {
      public static void main( String [] args){

          //Declare variables
          final double STATE_TAX_PERCENTAGE = 0.04;
          final double COUNTY_TAX_PERCENTAGE = 0.03;
          final double CITY_TAX_PERCENTAGE = 0.02;
          double purchaseAmount;
          double stateTax;
          double countyTax;
          double cityTax;
          double totalTax;
          double totalSale;

          //Create a scanner object
          Scanner scanner = new Scanner(System.in);

          System.out.println("Please enter the purchase amount");
          purchaseAmount = scanner.nextDouble();

          //Calculate the state tax
           stateTax = STATE_TAX_PERCENTAGE * purchaseAmount;

          //Calculate the county tax
           countyTax = COUNTY_TAX_PERCENTAGE * purchaseAmount;

          //Calculate the city tax
           cityTax = CITY_TAX_PERCENTAGE * purchaseAmount;

           //Calculate the total tax
           totalTax = stateTax + countyTax + cityTax;

          //Calculate the total sale
           totalSale = totalTax + purchaseAmount;

           //Display details
            System.out.println("Purchase amount: $" + purchaseAmount + "\nState sales tax: " + stateTax
                  + "\nCounty sales tax: " + countyTax + "\nCity sales tax: " + cityTax +
                    "\nTotal sales tax: " + totalTax + "\nTotal sale: " + totalSale);


      }

}
