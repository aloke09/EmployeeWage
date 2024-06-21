package p1;
import java.util.Random;

public class EmpWageCalculatorArray
{
    final int FULL_TIME=1;
    final int PART_TIME=1;

    private int no_of_company=0;

    private Company []companyarr;

    public EmpWageCalculatorArray() {
        this.companyarr = new Company[5];
    }
    public void addCompanyEmpWage(String cname,int ratePerHr,int maxWorkingDay,int maxWorkingHr)
    {
        companyarr[no_of_company]=new Company(cname,ratePerHr,maxWorkingDay,maxWorkingHr);
        no_of_company++;
    }
    public void CalculateEmpWage()
    {
        for(int i=0;i<no_of_company;i++) {
            companyarr[i].setTotalEmpWage(CalculateEmpWage(companyarr[i]));
        }
    }
    public int CalculateEmpWage(Company c)
    {
        int emphr=0,hrWorked=0,dayWorked=0;
        while (hrWorked<c.MaxHr && dayWorked<c.MaxDay)
        {
            dayWorked++;
            Random r=new Random();
            int check = r.nextInt(0, 3);
            switch (check)
            {
                case 1:
                    emphr=8;
                    break;
                case 2:
                    emphr=4;
                    break;
                default :
                    emphr=0;
                    break;
            }
            hrWorked+=emphr;
            System.out.println("Day "+dayWorked+" hours "+emphr);
        }
        c.totalEmpWage=hrWorked*c.ratePerHr;
        System.out.println("Total employee wage for comppany :"+c.cName+" is "+c.totalEmpWage);
        return c.totalEmpWage;

    }
}

