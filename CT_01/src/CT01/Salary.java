package CT01;

public abstract class Salary {
    abstract double getSalaryPercentage();
}

class EmployeeA extends Salary{
    double totalSalary;
    public EmployeeA(double s1, double s2, double s3){
        this.totalSalary = s1+s2+s3;
    }

    @Override
    double getSalaryPercentage() {
        double n = (this.totalSalary / (3 * 100)) * 100;
        return n;
    }
}

class EmployeeB extends Salary{
    double totalSalary;
    public EmployeeB(double s1, double s2, double s3, double s4){
        this.totalSalary = s1+s2+s3+s4;
    }
    @Override
    double getSalaryPercentage() {
        double n = (this.totalSalary / (4 * 100)) * 100;
        return n;
    }
}

class Main{
    public static void main(String[] args) {
        EmployeeA e1 = new EmployeeA(3000,3500,4000);
        EmployeeB e2 = new EmployeeB(4000,4200,4300,4100);
        System.out.println("Percentage of salary for EmployeeA: " + e1.getSalaryPercentage() + "%");
        System.out.println("Percentage of salary for EmployeeB: " + e2.getSalaryPercentage() + "%");

    }
}