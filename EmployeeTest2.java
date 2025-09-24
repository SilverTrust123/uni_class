package B11221009;
public class EmployeeTest2 {
    public static void main(String[] args) {
        CommissionEmployee[] commissionEmployees = {
            new CommissionEmployee("Sue", "Jones", "111-11-1111", 10000.0, 0.06),
            new CommissionEmployee("Betty", "Wang", "222-22-2222", 6000.0, 0.05),
            new CommissionEmployee("Max", "Kuo", "333-33-3333", 8000.0, 0.07)
        };
        BasePlusCommissionEmployee[] basePlusCommissionEmployees = {
            new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000.0, 0.04, 300),
            new BasePlusCommissionEmployee("Tom", "Bruce", "555-55-5555", 7500.0, 0.02, 100),
            new BasePlusCommissionEmployee("Mark", "White", "666-66-6666", 2500.0, 0.03, 500)
        };
        HourlyEmployee[] hourlyEmployees = {
            new HourlyEmployee("Karen", "Price", "777-77-7777", 95.0, 46),
            new HourlyEmployee("John", "Smith", "888-88-8888", 120.0, 38),
            new HourlyEmployee("David", "John", "999-99-9999", 200.0, 42)
        };
        Employee2[] employees = new Employee2[commissionEmployees.length + basePlusCommissionEmployees.length + hourlyEmployees.length];
        int index = 0;
        for (CommissionEmployee employee : commissionEmployees) {
            employees[index++] = employee;
        }
        for (BasePlusCommissionEmployee employee : basePlusCommissionEmployees) {
            employees[index++] = employee;
        }
        for (HourlyEmployee employee : hourlyEmployees) {
            employees[index++] = employee;
        }
        for (Employee2 employee : employees) {
            System.out.printf("%s\n%s: $%,.2f\n\n", employee, "earned", employee.earnings());
        }
    }
}
