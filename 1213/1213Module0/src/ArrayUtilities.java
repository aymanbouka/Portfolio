/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aymanboukharraz
 */
public class ArrayUtilities 
{
    public static void main(String[] args)
    {
        String message = "Welcome to ITSC1213 ArrayUtilities Program!";
        
        int n = 5;
        
        for(int i = 0; i < n; i++)
        {
            System.out.println(message);
        }
         int[] numArray = {1, 3, 1, 2, 5, 1, 2};
        System.out.println("the sum of this array is: " + sum(numArray));
        System.out.println("the largest number of this array is " + findMax(numArray));
        System.out.println("the first odd number in this array is: " + findFirstOdd(numArray));
    }//end main
    
   public static int sum(int[] numbers)
   {
       int total = 0;
       
       for(int num : numbers)
       {
           total += num;
       }// end for loop
       return total;
   }//end main
   
   public static int findMax(int[] numbers)
   {
     
       int max = 0;
       
       for(int i = 0; i < numbers.length; i++)
       {
           if(numbers[i] > max)
           {
               max = numbers[i];
           }
           
           
       }
       return max;
   }
   
   public static int findFirstOdd(int[] numbers)
   {
       int i = 0;
       while(i < numbers.length)
       {
           if(numbers[i] % 2 == 1)
           {
               return numbers[i];
               
           }
           i++;
       }
       return 0;
   }
    
}//end class
