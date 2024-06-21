package p1;

import java.util.Random;

public class Emp_wage
{
    //UC9
    final  int FULL_TIME=1;
    final  int PART_TIME=2;

    private String cName;
    private int ratePerHr;
    private int MaxHr;
    private int MaxDay;
    private int totalEmpWage;

    public Emp_wage(String cName, int maxDay, int maxHr, int ratePerHr) {
        this.cName = cName;
        MaxDay = maxDay;
        MaxHr = maxHr;
        this.ratePerHr = ratePerHr;
    }
    public int calculate_wage()
    {
        int emphr=0,hrWorked=0,dayWorked=0;
        while (hrWorked<MaxHr && dayWorked<MaxDay)
        {
            dayWorked++;
            Random r=new Random();
            int check = r.nextInt(0, 3);
            switch (check)
            {
                case FULL_TIME->emphr=8;
                case PART_TIME->emphr=4;
                default -> emphr=0;
            }
            hrWorked+=emphr;
            System.out.println("Day "+dayWorked+" hours "+emphr);
        }
        totalEmpWage=hrWorked*ratePerHr;
        System.out.println("Total employee wage for comppany :"+cName+" is "+totalEmpWage);
        return totalEmpWage;
    }
    public String display()
    {
        return "Total employee wage for comppany :"+cName+" is "+totalEmpWage;
    }
    public static void main(String[] args)
    {
        Emp_wage samsung=new Emp_wage("samsung",25,100,200);
        samsung.calculate_wage();
        System.out.println(samsung.display());

    }
}
