import java.util.Scanner;

public class Main {

   public static void main(String []args) {
      Scanner input = new Scanner(System.in);

      String highSchoolName = new String("Dtm Highschool");
      double drink = 1.50;
      double candy = 1.25;
      double hotDog = 2.75;
      double hamburger = 3.50;

           int orderNumber = (int)(Math.random()*100 + 1);



      System.out.println("How many drinks do you want?");
     int nDrinksOrdered = input.nextInt();
     System.out.println("How many candy do you want?");
      int nCandiesOrdered = input.nextInt();
      System.out.println("How many DAWGS do you want?");
      int nDawgsOrdered = input.nextInt();
      System.out.println("How many BURGS do you want?");
      int nBurgsOrdered = input.nextInt();
      double tax = 0.08;
      double subTotal = (drink * nDrinksOrdered) + (candy * nCandiesOrdered) + (hotDog * nDawgsOrdered) + (hamburger * nBurgsOrdered);
      double totalTax = subTotal * tax;
      double total = totalTax + subTotal;



      // RECEIPT PRINTOUT SECTION
     System.out.println("********************************************");
     System.out.println("*          Order Number: " + orderNumber +  "                *");
     System.out.println("*          High School Snack Bar           *");
     System.out.println("*                                       6   *");
     System.out.println("*     Drink .........." + drink + "  Amount: " + nDrinksOrdered + "      *");                      
     System.out.println("*     Candy .........." + candy + " Amount: " + nCandiesOrdered + "      *");     
     System.out.println("*     Hot Dog ........" + hotDog + " Amount: " + nDawgsOrdered + "      *");     
     System.out.println("*     Hamburger ......" + hamburger + "  Amount: " +nBurgsOrdered + "      *");     
     System.out.println("*             Total:   " + total +   "              *");    
     System.out.println("*******************************************");



   }
}