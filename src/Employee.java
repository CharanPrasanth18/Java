import java.util.Scanner;

class Employee
{
    public String Emp_name, Address, Mail_id,Mobile_no;
    public long Emp_id;

    Employee(String Emp_name,int Emp_id,String Address,String Mail_id,String Mobile_no)
    {
        this.Emp_name=Emp_name;
        this.Address=Address;
        this.Mail_id=Mail_id;
        this.Mobile_no=Mobile_no;
        this.Emp_id=Emp_id;
    }


    public void pay()
    {
        Scanner input = new Scanner(System.in);

        double BP,net_salary,gross_salary,DA,HRA,PF,fund;

        System.out.println("Enter Basic Pay:");
        BP = input.nextDouble();

        DA = (double)(BP*0.97);
        HRA = (double)(BP*0.1);
        PF = (double)(BP*0.12);
        fund = (double)(BP*0.01);

        gross_salary = BP+DA+HRA+PF+fund;

        net_salary = (BP+DA+HRA) - (PF+fund);

        System.out.println("Employee Details");
        System.out.println("Id: " + Emp_id);
        System.out.println("Name: " + Emp_name);
        System.out.println("Address: " + Address);
        System.out.println("Mail Id: " + Mail_id);
        System.out.println("Mobile Number: "+ Mobile_no);
        System.out.println("Gross Salary: "+gross_salary);
        System.out.println("Net Salary: "+net_salary);
    }
}

class Programmer extends Employee
{
    Programmer(String Emp_name,int Emp_id,String Address,String Mail_id,String Mobile_no)
    {
        super(Emp_name,Emp_id,Address,Mail_id,Mobile_no);
    }
}

class Assistant_Professor extends Employee
{
    Assistant_Professor(String Emp_name,int Emp_id,String Address,String Mail_id,String Mobile_no)
    {
        super(Emp_name,Emp_id,Address,Mail_id,Mobile_no);
    }
}

class Associate_Professor extends Employee
{
    Associate_Professor(String Emp_name,int Emp_id,String Address,String Mail_id,String Mobile_no)
    {
        super(Emp_name,Emp_id,Address,Mail_id,Mobile_no);
    }
}

class Professor extends Employee
{
    Professor(String Emp_name,int Emp_id,String Address,String Mail_id,String Mobile_no)
    {
        super(Emp_name,Emp_id,Address,Mail_id,Mobile_no);
    }

}

class PaySlip
{
    public static void main(String args[])
    {
        System.out.println("Programmer");
        System.out.println("---------");
        Programmer pro = new Programmer("Ibrahim",972002,"Thalaiyari Street","mohdibrahim972002@gmail.com","9080559762");
        pro.pay();
        System.out.println("---------");

        System.out.println("Assistant Professor");
        System.out.println("---------");
        Assistant_Professor ap= new Assistant_Professor("Shyam",2772001,"Theradi Street","shyampopz0@gmail.com","8531058391");
        ap.pay();
        System.out.println("---------");

        System.out.println("Associate Professor");
        System.out.println("---------");
        Associate_Professor apro= new Associate_Professor("Mohammed",12972002,"Ibrahim Street","ppit@gmail.com","9786422262");
        apro.pay();
        System.out.println("---------");

        System.out.println("Professor");
        System.out.println("---------");
        Professor p= new Professor("Popz",91272002,"Mohd Street","ppit123@gmail.com","7080559762");
        p.pay();
        System.out.println("---------");
    }
}
