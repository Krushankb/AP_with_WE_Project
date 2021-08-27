
/**
 * Write a description of class Map here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class City
{
    private LatLong latLong;
    private String name;
    
    /**
     * Constructor to instantiate the city, and gets the latitude/longitude
     * @precondition - the name must be in the format with the name of the city,
     * followed by a comma and a space, then the state, the city and state must also 
     * start with capital letters
     * @param - name of the city
     * @author - Nick Xing
     * @version May 2019
     */
    public City(String n)
    {
        name = n;
        latLong = getLatLong();
    }
    
    /**
     * Gets the latitude and longitude based on the name of the city and state
     * @return - the latitude and longitude of the city
     * @author - Nick Xing
     * @version May 2019
     */
    public LatLong getLatLong()
    {
        if (name.equals("Montgomery, Alabama"))
        {
            return new LatLong(32.36,-86.28);
        }
        else if (name.equals("Juneau, Alaska"))
        {
            return new LatLong(58.30, -134.42);
        }
        else if (name.equals("Phoenix, Arizona"))
        {
            return new LatLong(33.45, -112.07);
        }
        else if (name.equals("Little Rock, Arkansas"))
        {
            return new LatLong(34.74, -92.33);
        }
        else if (name.equals("Sacramento, California"))
        {
            return new LatLong(38.56, -121.47);
        }
        else if (name.equals("Denver, Colorado"))
        {
            return new LatLong(39.74, -104.98);
        }
        else if (name.equals("Hartford, Connecticut"))
        {
            return new LatLong(41.77, -72.68);
        }
        else if (name.equals("Dover, Delaware"))
        {
            return new LatLong(39.16, -75.53);
        }
        else if (name.equals("Tallahassee, Florida"))
        {
            return new LatLong(30.45, -84.27);
        }
        else if (name.equals("Atlanta, Georgia"))
        {
            return new LatLong(33.76, -84.39);
        }
        else if (name.equals("Honolulu, Hawaii"))
        {
            return new LatLong(21.31, -157.83);
        }
        else if (name.equals("Boise, Idaho"))
        {
            return new LatLong(43.61, -116.24);
        }
        else if (name.equals("Springfield, Illinois"))
        {
            return new LatLong(39.78, -89.65);
        }
        else if (name.equals("Indianapolis, Indiana"))
        {
            return new LatLong(39.79, -86.15);
        }
        else if (name.equals("Des Moines, Iowa"))
        {
            return new LatLong(41.59, -93.62);
        }
        else if (name.equals("Topeka, Kansas"))
        {
            return new LatLong(39.04, -95.69);
        }
        else if (name.equals("Frankfort, Kentucky"))
        {
            return new LatLong(38.20, -84.86);
        }
        else if (name.equals("Baton Rouge, Louisiana"))
        {
            return new LatLong(30.46, -91.14);
        }
        else if (name.equals("Augusta, Maine"))
        {
            return new LatLong(44.32, -69.77);
        }
        else if (name.equals("Annapolis, Maryland"))
        {
            return new LatLong(38.97, -76.50);
        }
        else if (name.equals("Boston, Massachusetts"))
        {
            return new LatLong(42.24, -71.03);
        }
        else if (name.equals("Lansing, Michigan"))
        {
            return new LatLong(42.73, -84.55);
        }
        else if (name.equals("St. Paul, Minnesota"))
        {
            return new LatLong(44.95, -93.09);
        }
        else if (name.equals("Jackson, Mississippi"))
        {
            return new LatLong(32.32, -90.21);
        }
        else if (name.equals("Jefferson City, Missouri"))
        {
            return new LatLong(38.57, -92.19);
        }
        else if (name.equals("Helena, Montana"))
        {
            return new LatLong(46.60, -112.03);
        }
        else if (name.equals("Lincoln, Nebraska"))
        {
            return new LatLong(40.81, -96.68);
        }
        else if (name.equals("Carson City, Nevada"))
        {
            return new LatLong(39.16, -119.75);
        }
        else if (name.equals("Concord, New Hampshire"))
        {
            return new LatLong(43.22, -71.55);
        }
        else if (name.equals("Trenton, New Jersey"))
        {
            return new LatLong(40.22, -74.55);
        }
        else if (name.equals("Santa Fe, New Mexico"))
        {
            return new LatLong(35.67, -105.96);
        }
        else if (name.equals("Albany, New York"))
        {
            return new LatLong(42.66, -73.78);
        }
        else if (name.equals("Raleigh, North Carolina"))
        {
            return new LatLong(35.77, -78.64);
        }
        else if (name.equals("Bismarck, North Dakota"))
        {
            return new LatLong(48.81, -100.78);
        }
        else if (name.equals("Columbus, Ohio"))
        {
            return new LatLong(39.96, -83.00);
        }
        else if (name.equals("Oklahoma City, Oklahoma"))
        {
            return new LatLong(35.48, -97.53);
        }
        else if (name.equals("Salem, Oregon"))
        {
            return new LatLong(44.93, -123.03);
        }
        else if (name.equals("Harrisburg, Pennsylvania"))
        {
            return new LatLong(40.27, -76.88);
        }
        else if (name.equals("Providence, Rhode Island"))
        {
            return new LatLong(41.82, -71.42);
        }
        else if (name.equals("Columbia, South Carolina"))
        {
            return new LatLong(34.00, -81.04);
        }
        else if (name.equals("Pierre, South Dakota"))
        {
            return new LatLong(44.37, -100.37);
        }
        else if (name.equals("Nashville, Tennessee"))
        {
            return new LatLong(36.17, -86.78);
        }
        else if (name.equals("Austin, Texas"))
        {
            return new LatLong(30.27, -97.75);
        }
        else if (name.equals("Salt Lake City, Utah"))
        {
            return new LatLong(40.75, -111.89);
        }
        else if (name.equals("Monteplier, Vermont"))
        {
            return new LatLong(44.27, -72.57);
        }
        else if (name.equals("Richmond, Virginia"))
        {
            return new LatLong(37.54, -77.46);
        }
        else if (name.equals("Olympia, Washington"))
        {
            return new LatLong(47.04, -122.89);
        }
        else if (name.equals("Charleston, West Virginia"))
        {
            return new LatLong(38.35, -81.63);
        }
        else if (name.equals("Madison, Wisconsin"))
        {
            return new LatLong(33.45, -112.07);
        }
        else if (name.equals("Cheyenne, Wyoming"))
        {
            return new LatLong(41.14, -104.82);
        }
        return new LatLong(0.0,0.0);
    }
    
    /**
     * Getter to get the name of the city
     * @return - the name of the city
     * @author - Nick Xing
     * @version May 2019
     */
    public String getName() 
    {
        return name;
    }
    
    /**
     * Returns the score of the distance between two cities
     * @param - the city to compare with the other city
     * @return - 100 minus the latitude/longitude distance, which is the score
     * @author - Nick Xing
     * @version May 2019
     */
    public int getScore(City c)
    {
       return 100 - getLatLong().getDistance(c);
    }
    
    /**
     * Prints out the name of the city and its latitude and longitude
     * @return - the string of the name and lat/long
     * @author - Nick Xing
     * @version May 2019
     */
    public String toString()
    {
        return name + "\n" + latLong;
    }
}
