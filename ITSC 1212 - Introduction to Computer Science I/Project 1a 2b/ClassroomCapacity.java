import java.util.Scanner;

public class ClassroomCapacity
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.print("Total % allowed? ");
        double stateCapacity = Integer.parseInt(console.nextLine());
        stateCapacity /= 100;

        System.out.print("How many floors? ");
        int floors = Integer.parseInt(console.nextLine());

        System.out.print("How many rooms? ");
        int rooms = Integer.parseInt(console.nextLine());

        
        // System.out.print("Total % of floors allowed? ");
        int totalFloorAllowed = 0; //Integer.parseInt(console.nextLine());

        // System.out.print("Total % of Rooms allowed? ");
        
        int totalRoomAllowed = 0;
       // int stateCapacity = 40;

        for(int i = 1; i <= floors; i++)
        {
            System.out.println("Cycling thru floor: " + i);

            for(int j = 1; j <= rooms; j++)
            {
                System.out.print("How many people in room " + j + "? ");

                int roomCapacity = Integer.parseInt(console.nextLine());
                double allowedCapacity = stateCapacity * roomCapacity;

                System.out.print("Allowed capacity is " + allowedCapacity + " based on state capacity of " + stateCapacity + " of room capacity: " + roomCapacity + ".\n\n");

                stateCapacity += allowedCapacity;
                totalFloorAllowed += allowedCapacity;
            }

            System.out.println(totalFloorAllowed);

            totalFloorAllowed = 0;
        }

        System.out.println("Total allowed: " + stateCapacity);
    }//end main
    
}
