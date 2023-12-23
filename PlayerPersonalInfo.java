/*
Name: Dwayne Dsouza
Class: This is the true example of Encapsulation for OOP. We have made used of a parameterized constructor along with getter and 
setter for every 4 instance variables. A public variable is also used to keep a record of the number of Player records. 
 */

 //package Practice;

 //Create a Class 
public class PlayerPersonalInfo 
{
    //Declare the Instance Variables 
    private boolean playerNationalityCanadian; 
    private int playerAge;   
    private double playerSalary;
    private float playerContractLength;

    //Public class variable to keep track of the number of players and set it to 1  
    public int playerNumber = 1;

    //Create a Parameterized Constructor 
    public PlayerPersonalInfo(boolean playerNationalityCanadian, int playerAge, double playerSalary, float playerContractLength)
    {
        this.playerNationalityCanadian = playerNationalityCanadian; 
        this.playerAge = playerAge; 
        this.playerSalary = playerSalary;
        this.playerContractLength = playerContractLength;
        //Increase the Player Number for every record 
        playerNumber++; 
    }

    //Use the Getter for Instance Variable1
    public boolean getplayerNationalityCanadian()
    {
        return playerNationalityCanadian;
    }
    //Use the Setter for Instance Variable1
    public void setplayerNationalityCanadian(boolean pnc)
    {
        this.playerNationalityCanadian = pnc;
    }

    //Use the Getter for Instance Variable2
    public int getplayerAge()
    {
        return playerAge;
    }
    //Use the Setter for Instance Variable2
    public void setplayerAge(int pa)
    {
        this.playerAge = pa;
    }

    //Use the Getter for Instance Variable3
    public double getplayerSalary()
    {
        return playerSalary;
    }
    //Use the Setter for Instance Variable3
    public void setplayerSalary(double ps)
    {
        this.playerSalary = ps; 
    }

    //Use the Getter for Instance Variable4
    public float getplayerContractLength()
    {
        return playerContractLength;
    }
    //Use the Setter for Instance Variable4
    public void setplayerContractLength(float pcl)
    {
        this.playerContractLength = pcl;
    }

    //Use the Getter for the Public Variable 
    public int getplayerNumber()
    {
        return playerNumber;
    }
    //No Setter used for this variable because we have already used "playerNumber++" which will automatically increase the Player Number 
}
