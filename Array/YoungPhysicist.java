
import java.util.Scanner;

public class YoungPhysicist {
   /*
      4 1 7 
      -2 4 -1
      1 -5 -3
      <x1+y1+z3..xn+yn+zn>
      <3,0,4>
   */

   /*
      3 -1 7
      -5 2 -4
      2 -1 -3
      <0,0,0>
   */
   public static void vectorSum(){

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      
      int sumX = 0, sumY = 0, sumZ = 0;

      for (int i = 0; i < n; i++) { // input of numbers indiviual 
         sumX += sc.nextInt();
         sumY += sc.nextInt();
         sumZ += sc.nextInt();
      }
      // System.out.println(sumX);
      // System.out.println(sumY);
      // System.out.println(sumZ);
      if (sumX == 0 && sumY == 0 && sumZ == 0) {
         System.out.println("YES");
      }
      else{
         System.out.println("NO");
      }
      sc.close();

   }

   public static void main(String[] args) {
      vectorSum();
   }
}
