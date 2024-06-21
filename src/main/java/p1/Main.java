package p1;


public class Main
{
    public static void main(String[] args) {
        EmpWageCalculatorArray ob1=new EmpWageCalculatorArray();
        ob1.addCompanyEmpWage("abcd",20,2,10);
        ob1.addCompanyEmpWage("efgh",10,4,20);
        ob1.CalculateEmpWage();
    }
}
