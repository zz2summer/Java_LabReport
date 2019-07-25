public class Employee extends Person {
    private String salary;
    private MyDate dateOfEmployment=new MyDate();

    public Employee(){
    	
    }

    public Employee(String salary,MyDate dateOfEmployment,String name,String numbers){
    	super(name,numbers);
    	this.salary = salary;
    	this.dateOfEmployment = dateOfEmployment;
    }

    public String getSalary(){
    	return salary;
    }

    public void setSalary(String salary){
        this.salary = salary;
    }

    public MyDate getDateOfEmployment(){
    	return dateOfEmployment;
    }

    public void setDateOfEmployment(MyDate dateOfEmployment){
        this.dateOfEmployment = dateOfEmployment;
     }

    public void displayObject(){
    	System.out.println("to "+ super.getName() + ": �밴ʱ�ϰ�");
    }

    public String toString(){
         return "Employee�ࣺ����Ϊ" + super.getName() + "  �绰Ϊ" + 
                 super.getNumbers() + "  ����Ϊ" + salary;
   }
}
