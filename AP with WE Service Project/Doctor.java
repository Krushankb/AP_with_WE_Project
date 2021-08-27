
/**
 * Write a description of class Doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor
{
    private String doctorName;
    private String location;
    private String type;
    private String comments;
    
    /**
     * Instantiates the doctor with the name, location, and type of doctor
     * @precondition - location is written in the proper format "Chicago, Illinois"
     */
    public Doctor(String name, String loc, String typ)
    {
        doctorName = name;
        location = loc;
        type = typ;
    }
    
    /**
     * Extracts the state out of the location string
     * @precondition - location is written in the format "Chicago, Illinois"
     * @return the state object named the city in the location
     * @author Nick Xing
     * @version May 2019
     */
    private State extractState()
    {
        String state = location.substring(location.indexOf(",") + 2);
        return new State(state);
    }
    
    /**
     * Returns the score based on the distance between the location of the doctor
     * and Chicago and then the score of the state from the state class
     * return - the integer value of the score of the doctor to be put into the catalog
     * @author Nick Xing
     * @version May 2019
     */
    public int calculateScore()
    {
        int score = 0;
        score += (int)(extractState().getScore());
        City c = new City(location);
        City c2 = new City("Chicago, Illinois");
        score += c.getScore(c2);
        return score;
    }
    
    /**
     * Getter for the name of the doctor
     * return - the name of the doctor
     * @author Nick Xing
     * @version May 2019
     */
    public String getDoctorName()
    {
        return doctorName;
    }
    
    /**
     * Getter for the location of the doctor
     * return - the location of the doctor
     * @author Nick Xing
     * @version May 2019
     */
    public String getLocation()
    {
        return location;
    }
    
    /**
     * Takes comments from patient and stores it into the Doctor object for future
     * reference
     * @param - the string of the comments that the patient inputs
     * @author Nick Xing
     * @version May 2019
     */
    public void storeComments(String s)
    {
        comments = s;
    }
    
    /**
     * toString method that prints out all of the information of the doctor
     * @return the string to be printed with all of the information about the 
     * doctor
     * @author Nick Xing
     * @version May 2019
     */
    public String toString()
    {
        return "Name: " + doctorName + "\nLocation: " + location + "\nType: " + type + "\nScore: " + calculateScore();
    }
}
