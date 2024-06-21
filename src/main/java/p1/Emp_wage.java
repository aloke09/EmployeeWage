package p1;

import java.util.Random;

public class Emp_wage
{
    public static void main(String[] args) {

        int FULL_TIME=1;

        Random r=new Random();

        int Check=r.nextInt(0,2);

        if(Check==FULL_TIME)
        {
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}
