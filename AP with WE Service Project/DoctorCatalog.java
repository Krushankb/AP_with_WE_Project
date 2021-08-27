import java.util.ArrayList;
/**
 * Write a description of class Catalog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoctorCatalog
{
    private static ArrayList<Doctor> catalog;

    /**
     * constructor, instantiates catalog for doctors
     */
    public DoctorCatalog()
    {
        catalog = new ArrayList();
    }

    /**
     * @param - Doctor object
     * adds Doctor object into the Doctor Catalog
     */
    public void addDoctor(Doctor d)
    {
        catalog.add(d);
    }

    /**
     * @return ArrayList<Doctor>
     * returns the catalog and objects in it
     */
    public ArrayList<Doctor> getCatalog()
    {
        return catalog;
    }

    /**
     * sorts all Doctors in catalog based on score, worst on top and best 
     * at bottom
     */
    public void sortDoctors()
    {
        for (int j = 0; j < catalog.size(); j++)
        {
            Doctor min = catalog.get(j);
            int minPosition = j;
            for (int i = j + 1; i < catalog.size(); i++)
            {
                if (catalog.get(i).calculateScore() < min.calculateScore())
                {
                    min = catalog.get(i);
                    minPosition = i;
                }
            }
            swap (minPosition, j);
        }
    }
    
    /**
     * @param 2 integers
     * swithces the objects at positions of the integers
     */
    private static void swap(int d1, int d2)
    {
        Doctor d = catalog.get(d2);
        catalog.set(d2, catalog.get(d1));
        catalog.set(d1, d);
    }
}
