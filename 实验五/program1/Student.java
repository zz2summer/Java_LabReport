public class Student extends Person{
     private String status;

     public Student(){

     }

     public Student(String status, String name, String numbers){
          super(name, numbers);
          this.status = status;
     }

     public String getStatus(){
          return status;
     }
 
     public void setStatus(String status){
          this.status = status;
     }

     public void displayObject(){
         System.out.println("to " + super.getName() + "：请按时交实验报告");
     }
     
    public String toString(){
        return "Student类：姓名为" + super.getName() + "  电话为" 
                + super.getNumbers() + "  年级为" + status;
    }

}
