import java.util.ArrayList;
/**
 * Write a description of class Risk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Patient
{
    private String pName;
    private int age;
    private double weight;
    private int height;
    private ArrayList<String> condition = new ArrayList<String>();
    private ArrayList<String> symptoms = new ArrayList<String>();
    private ArrayList<String> medication = new ArrayList<String>();;
    private ArrayList<String> fHistory = new ArrayList<String>();
    private double BMI;
    private String loc;
    
    /**
     * the constructor
     * @precondition: all of the instance variables except for the counters were filled and declared in the Interaction class
     * @parameters: the patient's name, the age of the patient, the weight of the patient, and the height of the patient
     */
    public Patient(String pN, int a, double w, int h, String l)
    {
        pName = pN;
        age = a;
        weight = w;
        height = h;
        condition = new ArrayList<String>();
        symptoms = new ArrayList<String>();
        medication = new ArrayList<String>();
        fHistory = new ArrayList<String>();
        BMI = 0.0;
        loc = l;
    }
    
    /**
     * sets the name of the Patient object from a String storedName (which comes from the Interaction class)
     * @parameter: String storedName
     */
    public void setPName(String storedName)
    {
        pName = storedName.toUpperCase();
    }
    
    /**
     * sets the age of the Patient object from an int storedAge (which comes from the Interaction class)
     * @parameter: String storedName
     */
    public void setAge(int storedAge)
    {
        age = storedAge;
    }
    
    /**
     * sets the conditions of the Patient object from a String storedCond (which comes from the Interaction class)
     * @parameter: String storedCond
     */
    public void setCond(String storedCond)
    {
        condition.add(storedCond.toUpperCase());
    }
    
    /**
     * sets the symptoms of the Patient object from a String storedSymp (which comes from the Interaction class)
     * @parameter: String storedSymp
     */
    public void setSymp(String storedSymp)
    {
        symptoms.add(storedSymp.toUpperCase());
    }
    
    /**
     * sets the medications of the Patient object from a String storedMed (which comes from the Interaction class)
     * @parameter: String storedMed
     */
    public void setMed(String storedMed)
    {
        medication.add(storedMed.toUpperCase());
    }
    
    /**
     * sets the famiy history of the Patient object from a String f (which comes from the Interaction class)
     * @parameter: String f
     */
    public void setFHistory(String f)
    {
        fHistory.add(f.toUpperCase());
    }
    
    /**
     * sets the BMI of the Patient object from a double bodyMI (which comes from the Interaction class)
     * @parameter: double bodyMI
     */
    public void setBMI(double bodyMI)
    {
        BMI = bodyMI;
    }
    
    /**
     * gets the patient's name
     * @return: String pName
     */
    public String getPName()
    {
        return pName;
    }
    
    /**
     * gets the patient's age
     * @return: int age
     */
    public int getAge()
    {
        return age;
    }
    
    /**
     * gets the patient's conditions and turns it into one string
     * @return: String pCond
     */
    public String getCond()
    {
        String pCond = "";
        for(int x = 0; x < condition.size(); x++)
        {
            pCond += condition.get(x) + " ";
        }
        return pCond;
    }
    
    /**
     * gets the patient's symptoms and turns it into one string
     * @return: String pSymp
     */
    public String getSymp()
    {
        String pSymp = "";
        for(int x = 0; x < symptoms.size(); x++)
        {
            pSymp += symptoms.get(x) + " ";
        }
        return pSymp;
    }
    
    /**
     * gets the patient's medications and turns it into one string
     * @return: String pMed
     */
    public String getMed()
    {
        String pMed = "";
        for(int x = 0; x < medication.size(); x++)
        {
            pMed += medication.get(x) + " ";
        }
        return pMed;
    }
    
    /**
     * gets the patient's famiy history and turns it into one string
     * @return: String pFHis
     */
    public String getFHistory()
    {
        String pFHis = "";
        for(int x = 0; x < fHistory.size(); x++)
        {
            pFHis += fHistory.get(x) + " ";
        }
        return pFHis;
    }
    
    /**
     * calculates the BMI of the patient using the weight and height
     * @return: double BMI
     */
    public double getBMI()
    {
        double b = (weight * 703)/(Math.pow(height, 2));
        return (double) Math.round(b*100)/100;
    }
    
    
    public void printS()
    {
        System.out.println("SUMMARY\nNAME: " + pName + "\nAGE: " +
        age + "\nCONDITIONS: " + getCond() +
        "\nSYMPTOMS: " + getSymp() + "\nMEDICATIONS: "
        + getMed() + "\nPATIENT HISTORY: " + getFHistory() + "\nBMI: " +
        BMI + "\n");
    }
}
