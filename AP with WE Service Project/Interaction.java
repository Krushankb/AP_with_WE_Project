import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * Write a description of class Interaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Interaction extends JFrame 
{
    public static void main(String [] args)
    {
        DoctorCatalog docCatalog = new DoctorCatalog();
        PatientCatalog patCatalog = new PatientCatalog();
        String name = JOptionPane.showInputDialog("Please enter your full name: ");
        String age = JOptionPane.showInputDialog("Please enter your age: ");
        int age1 = Integer.parseInt(age);
        String weight = JOptionPane.showInputDialog("Please enter your weight in lbs: ");
        double weight1 = Double.parseDouble(weight);
        String height = JOptionPane.showInputDialog("Please enter your height to the nearest inch: ");
        int height1 = Integer.parseInt(height);
        String loc = JOptionPane.showInputDialog("Please enter your area of living (City, State): ");
        Patient p1 = new Patient(name, age1, weight1, height1, loc);
        String diag = JOptionPane.showInputDialog("Please state your condition(s): ");
        String diag2 = JOptionPane.showInputDialog("Do you have more conditions? (y/n): ");
        while(diag2.equals("y"))
        {
            diag = JOptionPane.showInputDialog("Please state one of your conditions: ");
            p1.setCond(diag);
            diag2 = JOptionPane.showInputDialog("Do you have more conditions? (y/n): ");
        }
        String ifsym = "";
        String sym2 = "y"; 
        while(sym2.equals("y"))
        {
            ifsym = JOptionPane.showInputDialog("Please state a symptom you currently have (if none, please type none): ");
            p1.setSymp(ifsym);
            sym2 = JOptionPane.showInputDialog("Do you have more symptoms? (y/n): ");
        }
        String ifmed = "";
        String med = "y";
        while(med.equals("y"))
        {
            ifmed = JOptionPane.showInputDialog("Please state a medication you are currently on (if none, please type none): ");
            p1.setMed(ifmed);
            med = JOptionPane.showInputDialog("Do you have more medications? (y/n): ");
        }
        String ifNo = JOptionPane.showInputDialog("Have you used this interface before? (y/n)");
        String fHistory = "";  
        if(ifNo.equals("n"))
        {
            fHistory = JOptionPane.showInputDialog("Please enter any/all previous family history: ");
        }
        else
        {
            fHistory = JOptionPane.showInputDialog("We will look at your previous inputted information, if there is anything new, please enter n");
        }
        JOptionPane.showMessageDialog(null, "Now we will ask questions about your recent doctor's visit.", "The KVN Project", JOptionPane.PLAIN_MESSAGE);
        String dName = JOptionPane.showInputDialog("Please enter the name of your doctor: ");
        String location = JOptionPane.showInputDialog("Please enter the location where you would meet your doctor (city, state): ");
        String type = JOptionPane.showInputDialog("Please enter the type of doctor that assisted you in your recent visit: ");
        String score = JOptionPane.showInputDialog("Please rate your doctor, out of 5 points: ");
        int dScore = Integer.parseInt(score);
        String comment = JOptionPane.showInputDialog("Please type in any comments you have about your doctor, if applicable: ");
        Doctor d1 = new Doctor(dName, location, type);
        d1.storeComments(comment);
        docCatalog.addDoctor(d1); 
        JOptionPane.showMessageDialog(null, "Here is your calculated BMI : " + p1.getBMI(), "The KVN Project", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Here are your doctor's overall details: " + d1.toString(), "The KVN Project", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Thank you for answering our questions. Your information will be securely stored into a catalog to ensure that it does not get lost. We hope you found this survey to be useful.", "The KVN Project", JOptionPane.PLAIN_MESSAGE);
    }
}