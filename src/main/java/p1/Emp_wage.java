package p1;

import java.util.Random;

public class Emp_wage
{
    public static void main(String[] args)
    {
        final  int FULL_TIME=1;
        final  int PART_TIME=2;
        final int EMP_RATE_PER_HR=250;
        final int TOTAL_NO_OF_WORKING_DAYS=20;

        int empHrs=0,empWage=0,totalEmpWage=0;
        for(int day=0;day<TOTAL_NO_OF_WORKING_DAYS;day++)
        {
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
            totalEmpWage+=empWage;
            System.out.println("Employee wage for day "+(day+1)+" is "+empWage);
        }
        System.out.println("Total Employee wage in a month="+totalEmpWage);
    }
}

