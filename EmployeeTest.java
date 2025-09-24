public class EmployeeTest {
    public static void main(String[] args) {
     Employee [] emp = new Employee[3];
     emp[0] = new Employee("Bob Lewis", 111111111);
     emp[1] = new Employee("Sue Jones", 222222222);
     emp[2] = new Employee("David Wang", 333333333);
     for (int i=0;i<emp.length;i++) {
             System.out.printf("%s%n", emp[i]);
      }
    }
  }
  