import java.util.ArrayList;
/**
 * Write a description of class PatientTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PatientTester
{
    public static void main (String[] args)
    {
        Patient p1 = new Patient("BELLA", 23, 125, 63, "MISSOURI");
        p1.setSymp("HEADACHE");
        p1.setSymp("CHEST PAIN");
        p1.setSymp("IRREGULAR HEARTBEAT");
        p1.setCond("HEART ATTACK");
        p1.setFHistory("DIABETES");
        p1.setMed("ASPIRIN");
        p1.setBMI(p1.getBMI());
        p1.printS();
        System.out.println();
        
        p1.setPName("STELLA");
        p1.setAge(47);
        p1.setFHistory("ASTHMA");
        p1.setBMI(19.67);
        p1.printS();
    }
}
