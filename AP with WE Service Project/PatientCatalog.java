import java.util.ArrayList;
/**
 * Write a description of class Catalog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PatientCatalog
{
    private static ArrayList<Patient> catalog;

    /**
     * instantiates catalog for Patient information
     */
    public PatientCatalog()
    {
        catalog = new ArrayList();
    }

    /**
     * @param - Patient object
     * takes a Patient object and adds it into the catalog
     */
    public void addDoctor(Patient p)
    {
        catalog.add(p);
    }

    /**
     * @return - ArrayList<Patient> (ArrayList of Patient objects)
     * returns the catalog and objects in it
     */
    public ArrayList<Patient> getCatalog()
    {
        return catalog;
    }
}