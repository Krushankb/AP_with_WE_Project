
/**
 * Write a description of class Risk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Risk
{
    private int[] riskArr = new int[]{0,0,0,0,0,0,0}; 
    private String[] riskName = new String[]{"HIGH BLOOD PRESSURE", "HEART DISEASE", "DEPRESSION", "ARTHRITIS", "COPD", "CANCER", "STROKE"};
    public Risk()
    {
        
    }
    /**
     * uses the patient's symptoms, condition, family history, age, and BMI to determine the risk of certain conditions
     * @parameter: Patient p1
     */
    public void calculateRisk(Patient p1)
    {    
        int age = p1.getAge();
        double BMI = p1.getBMI();
        if(p1.getSymp().indexOf("HEAD") != -1)
            {
                riskArr[0] += 15;
                riskArr[1] += 15;
            }
        if(p1.getSymp().indexOf("CHEST") != -1 || p1.getSymp().indexOf("BREATH") != -1 
            || p1.getSymp().indexOf("HEART") != -1)
            {
                riskArr[0] += 10;
                riskArr[1] += 10;
                riskArr[5] += 10;
            }
        if(p1.getSymp().indexOf("WEIGHT") != -1 || p1.getSymp().indexOf("APPETITE") != -1)
            {
                riskArr[2] += 10;
                riskArr[3] += 10;
                riskArr[4] += 10;
                riskArr[5] += 10;
            }
        if(p1.getSymp().indexOf("URINE") != -1)
            {
                riskArr[0] += 15;
                riskArr[4] += 15;
                riskArr[6] += 15;
            }
        if(p1.getSymp().indexOf("JOINT") != -1)
            {
                riskArr[3] += 20;
            }
        if(p1.getSymp().indexOf("ANXIETY") != -1 || p1.getSymp().indexOf("MOOD") != -1)
            {
                riskArr[2] += 15;
                riskArr[6] += 15;
            }
        if(p1.getSymp().indexOf("INSOMNIA") != -1 || p1.getSymp().indexOf("SLEEP") != -1)
            {
                riskArr[2] += 10;
            }
        
        for(int y = 0; y < riskName.length; y ++)
        {
            if(p1.getFHistory().indexOf(riskName[y]) != -1)
            {
                riskArr[y] += 25;
            }
            if(p1.getCond().indexOf(riskName[y]) != -1)
            {
                riskArr[y] = 100;
            }
        }
        int add;
        if(BMI <= 25.0)
            {
                add = 0;
            }
        else if(BMI <= 30.0)
            {
                add = 15;
            }
        else if(BMI <= 35.0)
            {
                add = 20;
            }
        else if(BMI <= 40.0)
            {
                add = 25;
            }
        else
            {
                add = 30;
            }
        riskArr[0] += add;
        riskArr[1] += add;
        riskArr[3] += add;
        riskArr[4] += add;
        riskArr[6] += add;
        if(age <= 35)
            {
                riskArr[2] += 5;
            }
        else if(age <= 50)
            {
                riskArr[2] += 10;
            }
        else if(age <= 65)
            {
                riskArr[2] += 10;
                riskArr[0] += 5;
                riskArr[3] += 5;
                riskArr[4] += 5;
                riskArr[5] += 5;
                riskArr[6] += 5;
            }
        else if(age <= 80)
            {
                riskArr[2] += 5;
                riskArr[0] += 10;
                riskArr[1] += 5;
                riskArr[3] += 10;
                riskArr[4] += 10;
                riskArr[5] += 10;
                riskArr[6] += 10;
            }
        else
            {
                riskArr[2] += 5;
                riskArr[0] += 10;
                riskArr[1] += 10;
                riskArr[3] += 15;
                riskArr[5] += 5;
                riskArr[6] += 10;
            }
        for(int x = 0; x < riskArr.length; x++)
        {
            if(riskArr[x] > 100)
            {
                 riskArr[x] = 100;
            }
        }
    }
    /**
     * prints the risk calculation in an analysis format to show the percentage risks for each condition
     * @parameter: Patient p1
     */
    public void print(Patient p1)
    {
        System.out.println("RISK ANALYSIS: " + p1.getPName() + "\n\n" +
        "HIGH BLOOD PRESSURE: " + riskArr[0] + "%\n"+
        "HEART DISEASE: " + riskArr[1] + "%\n"+
        "DEPRESSION: " + riskArr[2] + "%\n"+
        "ARTHRITIS: " + riskArr[3] + "%\n"+
        "COPD: " + riskArr[4] + "%\n"+
        "CANCER: " + riskArr[5] + "%\n"+
        "STROKE: " +  riskArr[6] + "%\n" +
        "----------------------------------------");
    }
}
