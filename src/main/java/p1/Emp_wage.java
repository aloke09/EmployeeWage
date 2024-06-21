package p1;

import java.util.Random;

public class Emp_wage
{
    public static void main(String[] args)
    {
        final int FULL_TIME=1;
        final int PART_TIME=2;
        final int EMP_RATE_PER_HR=250;

        int empHrs=0;
        int empWage=0;

        Random r=new Random();

        int check=r.nextInt(0,3);
        switch (check)
        {
            case FULL_TIME :
                empHrs=8;
                break;
            case PART_TIME:
                empHrs=4;
                break;
            default://0 for absent
                empHrs=0;
                break;
        }
        empWage=empHrs*EMP_RATE_PER_HR;
        System.out.println("Employee wage="+empWage);
    }
}
