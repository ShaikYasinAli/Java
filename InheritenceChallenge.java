SUPER CLASS:
  
public class Worker {
        private String name;
        private String birthDate;
        protected String endDate;

    public Worker() {
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        int currentYear=2023;
        int birthYear=Integer.parseInt(birthDate.substring(6));
            return  currentYear-birthYear;
        }
        public double collectPay(){
            return 0.00;
        }
        public void terminate(String endDate){
        this.endDate=endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

SUB CLASS-1(EMPLOYEE):
            
public class Employee extends Worker{
        private long employeeId;
        private String hireDate;
        public static int employeeNo=1;
        public Employee(){

        }
    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
SUBCLASS OF EMPLOYEE:(SalariedEmployee):
                      
public class SalariedEmployee extends Employee{
    private double annualSalaray;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalaray) {
        super(name, birthDate, hireDate);
        this.annualSalaray = annualSalaray;
    }

    @Override
    public double collectPay() {
        int payCheck= (int) annualSalaray/26;
        double adjustSalary= isRetired?0.9*payCheck:payCheck;
        return (int)adjustSalary;
    }
    public void retire(){
//        terminate("12/12/2023");
        isRetired=true;
    }
}
SUBCLASS OF EMPLOYYE(HourlyEmployee):
  
public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }
    @Override
    public double collectPay() {
        return 40*hourlyPayRate;
    }
    public double getDoublePay(){
        return 2*collectPay();
    }
}
MAIN CLASS:
  
public class Main extends Object{
    public static void main(String[] args) {
        Worker w =new Worker("Nova","02/09/2002");
        System.out.println(w);
        Employee e= new Employee("Nova","04/09/2000","09/30/2020");
        System.out.println(e);
        System.out.println(e.collectPay());
        System.out.println("age "+ e.getAge());
        SalariedEmployee f= new SalariedEmployee("Nova","04/09/2009","09/30/2020",2600);
        System.out.println(f);
        System.out.println("f pay check is " +f.collectPay());
        System.out.println("age "+ f.getAge());
        f.retire();
        System.out.println("f pay check after retirement is " +f.collectPay());
        HourlyEmployee h=new HourlyEmployee("Snow","09/23/2007","12/12/2017",50);
        System.out.println(h);
        System.out.println("h pay check is " +h.collectPay());
        h.getDoublePay();
        System.out.println("h gets  " +h.getDoublePay());
        System.out.println("age "+ h.getAge());

    }
}
OUTPUT:

Worker{name='Nova', birthDate='02/09/2002', endDate='null'}
Employee{employeeId=1, hireDate='09/30/2020'} Worker{name='Nova', birthDate='04/09/2000', endDate='null'}
0.0
age 23
Employee{employeeId=2, hireDate='09/30/2020'} Worker{name='Nova', birthDate='04/09/2009', endDate='null'}
f pay check is 100.0
age 14
f pay check after retirement is 90.0
Employee{employeeId=3, hireDate='12/12/2017'} Worker{name='Snow', birthDate='09/23/2007', endDate='null'}
h pay check is 2000.0
h gets  4000.0
age 16

