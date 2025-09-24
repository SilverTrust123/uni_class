package B11221009;
abstract class Employee2 {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee2(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public String toString() {
        return String.format("%s %s\nsocial security number: %s",
            getFirstName(), getLastName(), getSocialSecurityNumber());
    }
    public abstract double earnings();
}
class CommissionEmployee extends Employee2 {
    private double grossSales;
    private double commissionRate;
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                              double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    public double getGrossSales() {
        return grossSales;
    }
    public double getCommissionRate() {
        return commissionRate;
    }
    public double earnings() {
        return getGrossSales() * getCommissionRate();
    }
    public String toString() {
        return String.format("commission employee: %s\ngross sales: $%,.2f; commission rate: %.2f",
            super.toString(), getGrossSales(), getCommissionRate());
    }
}
class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
    	double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }
    public String toString() {
        return String.format("base-salaried commission employee: %s\nbase salary: $%,.2f",
            super.toString(), getBaseSalary());
    }
}
class HourlyEmployee extends Employee2 {
    private double wage;
    private int hours;
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          double wage, int hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }
    public double getWage() {
        return wage;
    }
    public int getHours() {
        return hours;
    }
    public double earnings() {
        if (hours <= 40) {
            return getHours() * getWage();
        } else {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }
    public String toString() {
        return String.format("hourly employee: %s\nhourly wage: $%,.2f; hours worked: %d",
            super.toString(), getWage(), getHours());
    }
}
