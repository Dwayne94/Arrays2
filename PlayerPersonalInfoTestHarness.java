/*
Name: Dwayne Dsouza
Class: This is the main class. The 500 player records will be stored in a 1-D Array. 500 Random player records will be created and 
printed and every player record will be displayed with a serial number. Once the 500 records are printed then, the User is required to 
enter Yes/No. If the User enters Yes then all the records will be re printed with the values defaulted to the set values and if User 
enters No then, the Program is completed.
 */

 //Import the required libraries 
 import java.util.Scanner;
 import java.util.Random;

 //package Practice;
 
 //Create the Main Class 
 public class PlayerPersonalInfoTestHarness 
{
    public static void main(String args[])
    {
        //Create a 1-D Array that can hold 500 records
        PlayerPersonalInfo playerInfo[] = new PlayerPersonalInfo[500];

        //Create an Object for Random Data generation 
        Random randomPlayerInfo = new Random();

        //We need to create a scanner to ask the User to enter Yes/No later on in the program to proceed to next phase
        Scanner sc = new Scanner(System.in);

        /*Now we need to generate the 500 random player records. Rather than typing every record, lets use the For loop. In this loop 
        we need to create random data for each instance variable*/
        for(int i=0; i<playerInfo.length; i++)
        {
            //Generate a random boolean value i.e. either True or False 
            boolean playerNationalityCanadian = randomPlayerInfo.nextBoolean();
            //Generate a random Player Age with minimum age 15 years and max age 42 years 
            int playerAge = randomPlayerInfo.nextInt(15,42);
            //Generate a random Player Salary from min 1000 Euros to max 400,000 Euros 
            double playerSalary = randomPlayerInfo.nextDouble(1000.00,400000.00);
            //Generate a random Player Contract Length from min 1 yr to max 6 yr
            float playerContractLength = randomPlayerInfo.nextFloat()*(6);
            //The above 4 generated details need to be stored for every index position of the Array 
            playerInfo[i] = new PlayerPersonalInfo(playerNationalityCanadian, playerAge, playerSalary, playerContractLength);
        }

        //Now we need to print these 500 random Player Information records 
        for(int k=0; k<playerInfo.length; k++)
        {
            System.out.println("Player Number: " + (k+1));
            System.out.println("Canadian National?" + ":" + playerInfo[k].getplayerNationalityCanadian());
            System.out.println("Player Age: " + playerInfo[k].getplayerAge());
            System.out.println("Player Salary: " + playerInfo[k].getplayerSalary());
            System.out.println("Player Contract Length: " + playerInfo[k].getplayerContractLength());
            System.out.println("------------------------------------------------------------------------------------------------");
        }

        //Add a line of space
        System.out.println();

        //Once 500 random records are printed we need to print a question if User wants to proceed
        System.out.println("Do you want to proceed to the next phase? Reply in Yes/No: ");
        //System to read and store the value in the variable 
        String userInput = sc.nextLine();

        //When the User enters Yes then, we need to set all the 500 records to default values 
        if(userInput.equals("Yes")||userInput.equals("yes"))
        {
            //500 random player records need to be created and defaulted to the set values
            for(int j=0; j<playerInfo.length; j++)
            {
                playerInfo[j].setplayerNationalityCanadian(false);
                playerInfo[j].setplayerAge(0);
                playerInfo[j].setplayerSalary(0.00);
                playerInfo[j].setplayerContractLength(0.0F);
            }

            //The created 500 default player records now need to be printed
            for(int m=0; m<playerInfo.length; m++)
            {
                System.out.println("Player Number: " + (m+1));
                System.out.println("Canadian National?" + ":" + playerInfo[m].getplayerNationalityCanadian());
                System.out.println("Player Age: " + playerInfo[m].getplayerAge());
                System.out.println("Player Salary: " + playerInfo[m].getplayerSalary());
                System.out.println("Player Contract Length: " + playerInfo[m].getplayerContractLength());
                System.out.println("------------------------------------------------------------------------------------------------");
            }
        }
        //When the User enters No then, Program should be completed 
        else if(userInput.equals("No")||userInput.equals("no"))
        {
            System.out.println("The Program is terminated");
        }
        //When the User enters an invalid input then statement should be displayed 
        else
        {
            System.out.println("Invalid Input entered. Please enter a valid User Input.");
        }

        //Close the scanner 
        sc.close();
    }
}
