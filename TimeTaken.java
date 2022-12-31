import java.util.Scanner;

/**
This program computes the time it will take for sound to travel a specific distance through a selected medium.
*/
public class TimeTaken
{
  public static void main(String[] args)
  {
   String medium;               //To hold the name of medium
   double distance;           // Distance that a sound wave will travel.
   int speedAir = 1100;        // Speed in air( feet per second).
   int speedWater = 4900;      // Speed in water.(feet per second).
   int speedSteel = 16400;     //Speed in steel.(feet per second).
   double time;                //Time taken for soundwave to travel in a medium.
  
  // Create scanner class for the input.
  Scanner keyboard = new Scanner(System.in);
  
  //Prompt the user to enter the distance.
  System.out.print("Enter the distance the sound wave travel(in feet):");
  distance = keyboard.nextDouble();
  
  // Consume the remaining newline.
  keyboard.nextLine();
 
  // Get the medium.
  System.out.print("Enter the medium:air,water or steel:");
  medium = keyboard.nextLine();
  
  if (medium.equalsIgnoreCase("Air"))
  {
    time = distance/speedAir;
    System.out.printf("It will take %.2f seconds.",time);
  }
  
  else if(medium.equalsIgnoreCase("Water"))
  {
     time = distance/speedWater;
     System.out.printf("It will take %.2f seconds.",time);
  }
  
  else if (medium.equalsIgnoreCase("Steel"))
  {
       time = distance/speedSteel;
       System.out.printf("It will take %.2f seconds.",time);
  }
  
  else 
  {
      System.out.println("Valid entries are: air, water or steel.");
       medium = keyboard.nextLine();

  }
       }
 }
 

