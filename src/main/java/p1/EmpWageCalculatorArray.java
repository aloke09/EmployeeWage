package p1;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class EmpWageCalculatorArray implements Method_Interface
{
    final int FULL_TIME=1;
    final int PART_TIME=1;

        LinkedList<Company> companyEmpWageList;
        HashMap<String,Company> companyToEmpWage;
//    private int no_of_company=0;
//    private Company []companyarr;

    public EmpWageCalculatorArray()
    {
        this.companyEmpWageList = new LinkedList<Company>();
        this.companyToEmpWage = new HashMap<String,Company>();
    }
    public void addCompanyEmpWage(String cname,int ratePerHr,int maxWorkingDay,int maxWorkingHr)
    {
        Company obj=new Company(cname,ratePerHr,maxWorkingDay,maxWorkingHr);
        companyEmpWageList.addLast(obj);
        companyToEmpWage.put(cname,obj);
    }
    public void CalculateEmpWage()
    {
        for(Company ob:companyEmpWageList)
        {
            ob.setTotalEmpWage(CalculateEmpWage(ob));
            System.out.println(ob.toString());
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
    @Override
    public int getTotalWage(String cName) {

        return companyToEmpWage.get(cName).totalEmpWage;

    }
}