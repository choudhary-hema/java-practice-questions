
public class PassByReferenceObjectType {
  public static void main(String args[]) {
    
    Employee emp1 = new Employee(1);
    Employee emp2 = new Employee(2);
    System.out.println("emp1 = " + emp1.getEmpId());
    System.out.println("emp2 = " + emp2.getEmpId());
    modifyEmployee(emp1, emp2);
    System.out.println("emp1 = " + emp1.getEmpId());
    System.out.println("emp2 = " + emp2.getEmpId());
    
  }
  public static void modifyEmployee (Employee emp1, Employee emp2){
    emp1.setEmpId(3);
    emp2 = new Employee();
    emp2.setEmpId(4);
  }
}
class Employee {
    
    private int empId;
    public Employee(){ 
    }
    public Employee(int empId){
       this.empId = empId; 
    }
    public int getEmpId(){
        return this.empId;
    }
    public void setEmpId(int empId){
        this.empId = empId;
    }
}
