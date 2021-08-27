import java.util.ArrayList;
/**
 * Write a description of class CopyOfRiskTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RiskTest
{
    public static void main (String[] Args)
    {
        Patient patient = new Patient("THOMAS", 51, 260, 66, "KENTUCKY");
        ArrayList<String> cond1 = new ArrayList<String>();
        patient.setCond("HIGH BLOOD PRESSURE");
        patient.setCond("STROKE");
        ArrayList<String> symp1 = new ArrayList<String>();
        patient.setSymp("HEADACHE");
        patient.setSymp("JOINT PAIN");
        patient.setSymp("MOOD SWINGS");
        patient.setSymp("HEART PAIN");
        ArrayList<String> med1 = new ArrayList<String>();
        patient.setMed("BETA-BLOCKERS");
        ArrayList<String> fHis1 = new ArrayList<String>();
        patient.setFHistory("ASTHMA");
        Risk r1 = new Risk();
        
        r1.calculateRisk(patient);
        r1.print(patient);
        
        Patient patient2 = new Patient("TIFFANY", 26, 130, 62, "HAWAII");
        Risk r2 = new Risk();
        ArrayList<String> cond2 = new ArrayList<String>();
        patient2.setCond("ALZHEIMER'S");
        ArrayList<String> symp2 = new ArrayList<String>();
        patient2.setSymp("CHEST ACHE");
        patient2.setSymp("ANXIETY");
        patient2.setSymp("INSOMNIA");
        patient2.setSymp("INFECTION OF KNEE");
        ArrayList<String> med2 = new ArrayList<String>();
        patient2.setMed("ANTI-DEPRESSANTS");
        ArrayList<String> fHis2 = new ArrayList<String>();
        patient2.setFHistory("STROKE");
        patient2.setFHistory("DEPRESSION");
        patient2.setFHistory("COPD");
        
        r2.calculateRisk(patient2);
        r2.print(patient2);
        
        Patient patient3 = new Patient("CHLOE", 84, 210, 67, "ILLINOIS");
        ArrayList<String> cond3 = new ArrayList<String>();
        patient3.setCond("HEART DISEASE");
        ArrayList<String> symp3 = new ArrayList<String>();
        patient3.setSymp("LOSS OF APPETITE");
        patient3.setSymp("BLOOD IN URINE");
        patient3.setSymp("HEARTACHE");
        patient3.setSymp("HEADACHE");
        ArrayList<String> med3 = new ArrayList<String>();
        patient3.setMed("ASPIRIN");
        ArrayList<String> fHis3 = new ArrayList<String>();
        Risk r3 = new Risk();
        
        r3.calculateRisk(patient3);
        r3.print(patient3);
    }
}



