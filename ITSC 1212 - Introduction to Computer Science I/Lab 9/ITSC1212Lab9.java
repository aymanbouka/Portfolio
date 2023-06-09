import javax.lang.model.util.ElementScanner6;

/**
ITSC 1212 - 005 - von Briesen
@Author Ayman Boukharraz
@Since 8/23/2021 6:39

My code template (assignment name) Version 1.0
This is the sample code I will use now on. (Description)
*/

public class ITSC1212Lab9
{
    public static void main(String[] args)
     {

       String startMessage = "**************** Start ******************\n";
       System.out.println(startMessage);
       //
        char symbole = '%';
        //char symbole2 = '#';

        for(int i = 0; i < 4; i++)
        {
         for(int j = 0; j < 4; j++)  
         {
             if(i % 2 == 0)
             {
                 if(j % 2 == 0)
                 {//
                     for(int k = 0; k < 4; k++)
                     {
                         System.out.print("%");
                     }

                 }
                 else
                 {
                     for(int l = 0; l < 4; l++)
                     {
                         System.out.print("#");
                     }
                 }
                 System.out.print(" ");
             }
             else
             {
                 if(j % 2 == 0)
                 {
                     for(int k = 0; k < 4; k++)
                     {
                         System.out.print("#");
                     }
                }
                     else
                     {
                        for(int m = 0; m < 4; m++)
                        {
                            System.out.print("%");
                        }
                     }
                     System.out.print(" ");
                 }

             }//
             System.out.println(" ");

       }

            

         
     }
    
}//end class





