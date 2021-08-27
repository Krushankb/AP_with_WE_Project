
/**
 * Write a description of class State here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class State
{
    private double score;
    private String name;
    
    /**
     * Instantiates the state with its name
     * @precondition - the name must start with a capital letter
     * @author - Nick Xing
     * @version May 2019
     */
    public State(String n)
    {
        name = n;
    }

    /**
     * Each state has a total score for their doctors, given by wallethub.com
     * and this method returns that score
     * @return - the score of the state rounded to two decimal places
     * @author - Nick Xing
     * @version May 2019
     */
    public double getScore()
    {
        if (name.equals("Montana"))
        {
            return 69.15;
        }
        else if (name.equals("Wisconsin"))
        {
            return 69.13;
        }
        else if (name.equals("Idaho"))
        {
            return 68.55;
        }
        else if (name.equals("Minnesota"))
        {
            return 68.32;
        }
        else if (name.equals("Iowa"))
        {
            return 67.58;
        }
        else if (name.equals("South Dakota"))
        {
            return 67.03;
        }
        else if (name.equals("Kansas"))
        {
            return 66.65;
        }
        else if (name.equals("Nebraska"))
        {
            return 65.81;
        }
        else if (name.equals("Mississippi"))
        {
            return 64.70;
        }
        else if (name.equals("North Dakota"))
        {
            return 64.50;
        }
        else if (name.equals("Tennessee"))
        {
            return 63.78;
        }
        else if (name.equals("Alabama"))
        {
            return 62.78;
        }
        else if (name.equals("Colorado"))
        {
            return 60.03;
        }
        else if (name.equals("Nevada"))
        {
            return 59.51;
        }
        else if (name.equals("Oklahoma"))
        {
            return 59.38;
        }
        else if (name.equals("Utah"))
        {
            return 59.31;
        }
        else if (name.equals("Wyoming"))
        {
            return 58.50;
        }
        else if (name.equals("Georgia"))
        {
            return 58.10;
        }
        else if (name.equals("West Virginia"))
        {
            return 57.46;
        }
        else if (name.equals("Louisiana"))
        {
            return 57.38;
        }
        else if (name.equals("North Carolina"))
        {
            return 57.36;
        }
        else if (name.equals("Maine"))
        {
            return 57.34;
        }
        else if (name.equals("New Mexico"))
        {
            return 56.69;
        }
        else if (name.equals("Arizona"))
        {
            return 56.42;
        }
        else if (name.equals("South Carolina"))
        {
            return 56.02;
        }
        else if (name.equals("Kentucky"))
        {
            return 55.89;
        }
        else if (name.equals("Indiana"))
        {
            return 55.87;
        }
        else if (name.equals("Washington"))
        {
            return 55.76;
        }
        else if (name.equals("Missouri"))
        {
            return 55.06;
        }
        else if (name.equals("Texas"))
        {
            return 54.69;
        }
        else if (name.equals("Arkansas"))
        {
            return 54.19;
        }
        else if (name.equals("Florida"))
        {
            return 53.99;
        }
        else if (name.equals("Michigan"))
        {
            return 53.38;
        }
        else if (name.equals("Pennsylvania"))
        {
            return 53.10;
        }
        else if (name.equals("Oregon"))
        {
            return 52.83;
        }
        else if (name.equals("Ohio"))
        {
            return 52.19;
        }
        else if (name.equals("Virginia"))
        {
            return 52.12;
        }
        else if (name.equals("New Hampshire"))
        {
            return 52.12;
        }
        else if (name.equals("California"))
        {
            return 49.63;
        }
        else if (name.equals("Illinois"))
        {
            return 49.37;
        }
        else if (name.equals("Alaska"))
        {
            return 48.87;
        }
        else if (name.equals("Vermont"))
        {
            return 48.81;
        }
        else if (name.equals("Massachusetts"))
        {
            return 47.84;
        }
        else if (name.equals("Maryland"))
        {
            return 46.36;
        }
        else if (name.equals("Delaware"))
        {
            return 46.17;
        }
        else if (name.equals("Hawaii"))
        {
            return 44.72;
        }
        else if (name.equals("Connecticut"))
        {
            return 44.45;
        }
        else if (name.equals("New Jersey"))
        {
            return 43.29;
        }
        else if (name.equals("Rhode Island"))
        {
            return 42.83;
        }
        else if (name.equals("District of Columbia"))
        {
            return 41.55;
        }
        else if (name.equals("New York"))
        {
            return 34.01;
        }
        return -1;
    }

    /**
     * Getter for the name of the state
     * @return - the name of the state
     * @author - Nick Xing
     * @version May 2019
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * toString method that prints out the name and score for the state
     * @return - String to be printed out that has the name and score in it
     * @author - Nick Xing
     * @version May 2019
     */
    public String toString()
    {
        return "Name: " + name + "\nScore: " + getScore();
    }
}
