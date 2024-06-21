package p1;

import java.util.Random;

public class Emp_wage
{
    public static void main(String[] args) {

        final int FULL_TIME=1;
        final int EMP_RATE_PER_HR=250;

        int empHrs=0;
        int empWage=0;

        Random r=new Random();

        int Check=r.nextInt(0,2);
        if(Check==FULL_TIME)
        {
            empHrs=8;
        }
        else {
            empHrs=0;
        }
        empWage=empHrs*EMP_RATE_PER_HR;
        System.out.println("Employee wage="+empWage);
    }
}