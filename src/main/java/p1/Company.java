package p1;

public class Company
{
    public String cName;
    public int ratePerHr;
    public int MaxHr;
    public int MaxDay;
    public int totalEmpWage;

    public Company(String cName, int maxDay, int maxHr, int ratePerHr) {
        this.cName = cName;
        MaxDay = maxDay;
        MaxHr = maxHr;
        this.ratePerHr = ratePerHr;
    }
    public String display()
    {
        return "Total employee wage for comppany :"+cName+" is "+totalEmpWage;
    }
    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

}
