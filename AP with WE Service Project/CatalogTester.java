
/**
 * Write a description of class CatalogTester2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CatalogTester
{
    public static void main(String[] args)
    {
        Doctor d21 = new Doctor("Shreyas Khati","Atlanta, Georgia","Radiologist");
        Doctor d22 = new Doctor("Violet Park","Madison, Wisconsin","Neurologist");
        Doctor d23 = new Doctor("Nick Xing","Salt Lake City, Utah","Psychiatrist");
        Doctor d24 = new Doctor("Shaarav Rotiwar","Raleigh, North Carolina","Rheumatologist");
        Doctor d25 = new Doctor("Krushank Bayyapu","Chicago, Illinois","Plastic Surgeon");
        DoctorCatalog c1 = new DoctorCatalog();
        c1.addDoctor(d21);
        c1.addDoctor(d22);
        c1.addDoctor(d23);
        c1.addDoctor(d24);
        c1.addDoctor(d25);
        for (Doctor d: c1.getCatalog())
        {
            System.out.println(d);
        }
        c1.sortDoctors();
        System.out.println("\n\n\nSORTED\n\n\n");
        for (Doctor d: c1.getCatalog())
        {
            System.out.println(d);
        }
    }
}
