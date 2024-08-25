
public class StaticVariables {
  public static void main(String args[]) {
    
    
    System.out.println("Intial Staff Count = " + Employee.staffCount);
    Employee emp1 = new Employee("Nick","HR");
    Employee emp2 = new Employee("Robert","IT");
    
    System.out.println("Staff Count = " + Employee.staffCount);
    Employee emp3 = new Employee("Harry","IT");
    Employee emp4 = new Employee("Sajel","Admin");
    
    System.out.println("Updated Staff Count = " + Employee.staffCount);
  }
  
}
class Employee {
    
    private String name;
    private String dept;
    public static int staffCount;
    
    public Employee(){ 
    }
    public Employee(String name, String dept){
       this.name = name; 
       this.dept = dept;
       staffCount++;
    }
}
