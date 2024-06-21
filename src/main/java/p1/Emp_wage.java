package p1;

import java.util.Random;

public class Emp_wage
{
    //UC8
    final  int FULL_TIME=1;
    final  int PART_TIME=2;

    public int computeEmpWage(String cName,int ratePerHr,int max_no_of_working_day,int max_no_of_hrs)
    {
        int daysWorked=0;
        int hrWorked=0;
        int emphr=0;
        Random r=new Random();
        int check;

        while(hrWorked<max_no_of_hrs && daysWorked<max_no_of_working_day)
        {
            daysWorked++;
            check=r.nextInt(0,3);
            switch (check)
            {
                case FULL_TIME->emphr=8;
                case PART_TIME->emphr=4;
                default -> emphr=0;
            }
            hrWorked+=emphr;
            System.out.println("Day "+daysWorked+" hours "+emphr);

        }
        System.out.println("Total working hours ->"+hrWorked);
        int totalEmpWage=hrWorked*ratePerHr;
        System.out.println("Total employee wage for "+cName+" is "+totalEmpWage);
        return totalEmpWage;
    }
    public static void main(String[] args)
    {
        Emp_wage ob1=new Emp_wage();
        ob1.computeEmpWage("Bridgelabz", 200, 25, 120);
    }
}
