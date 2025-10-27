public class Main {

   public static void main(String []args) {


      String highSchoolName = new String("Dtm Highschool");
      double drink = 1.50;
      double candy = 1.25;
      double hotDog = 2.75;
      double hamburger = 3.50;



      // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     High School Snack Bar          *");
     System.out.println("*                                    *");
     System.out.println("*     Drink .........." + drink + "            *");                      
     System.out.println("*     Candy .........." + candy + "           *");     
     System.out.println("*     Hot Dog ........" + hotDog + "           *");     
     System.out.println("*     Hamburger ......" + hamburger + "            *");     
     System.out.println("*                                    *");    
     System.out.println("**************************************");


     int orderNumber = (int)(Math.random()*100 + 1);
     int nDrinksOrdered = (int)(Math.random()*3 + 1);
      int nCandiesOrdered = (int)(Math.random()*3 + 1);
      int nDawgsOrdered = (int)(Math.random()*3 + 1);
      int nBurgsOrdered = (int)(Math.random()*3 + 1);
   }
}