
package machinelearning2;

import java.util.Scanner;

public class MachineLearning2 {
    
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
      
       String YorN;
      
      do {
         
         System.out.println("Enter your Prelim Grade: ");
         int prelim = input.nextInt();
      
         System.out.println("Enter your Midterm Grade: ");
         int midterm = input.nextInt();
         
         System.out.println("Enter your Final Grade: ");
         int finals = input.nextInt();
         
         double prelimGrade = prelim * .3;
         double midtermGrade = midterm * .3;
         double finalGrade = finals * .4;
         
         double finalAverage = prelimGrade + midtermGrade + finalGrade;
         
         System.out.println("Your Final Average is: " + finalAverage);
         
         if( finalAverage >= 75 ) {
             System.out.println("Congratulations! You PASSED!");
         } else {
             System.out.println("You FAILED!, You need to repeat your subject.");  
         }
         
         System.out.print("Do you want to enter again? (Y/N): ");   
         YorN = input.next();
      }
      
         while (YorN.equalsIgnoreCase("Y"));
         
          System.out.println("Thank You, Come Again!");
          
   }
}
    


