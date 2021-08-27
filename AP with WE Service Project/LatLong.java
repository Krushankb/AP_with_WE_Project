
/**
 * Write a description of class LatLong here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LatLong
{
    private double latitude;
    private double longitude;
    
    /**
     * Instantiates the latitude and longitude of the city
     * @param - latitude and longitude (rounded to two decimal places)
     * @author - Nick Xing
     * @version May 2019
     */
    public LatLong(double lat, double lon)
    {
        latitude = lat;
        longitude = lon;
    }
    
    /**
     * Getter for the latitude of the city
     * @return - latitude of the city (rounded to two decimal places)
     * @author - Nick Xing
     * @version May 2019
     */
    public double getLatitude()
    {
        return latitude;
    }
    
    /**
     * Getter for the longitude of the city
     * @return - longitude of the city (rounded to two decimal places)
     * @author - Nick Xing
     * @version May 2019
     */
    public double getLongitude()
    {
        return longitude;
    }
    
    /**
     * Returns the distance of the latitude and longitude of the two cities
     * using the distance formula
     * @param - the city to compare distance of the original city to
     * @return - the distance rounded down to the nearest integer
     * @author - Nick Xing
     * @version May 2019
     */
    public int getDistance(City c)
    {
        return (int)(Math.sqrt(((latitude - c.getLatLong().getLatitude()) * (latitude - c.getLatLong().getLatitude())) + (longitude - c.getLatLong().getLongitude()) * (longitude - c.getLatLong().getLongitude())));
    }
    
    /**
     * toString method to print out the latitude and longitude with parentheses 
     * around it and a comma in between
     * @return - string of the latitude and longitude
     * @author - Nick Xing
     * @version May 2019
     */
    public String toString()
    {
        return "(" + latitude + "," + longitude + ")";
    }
}
