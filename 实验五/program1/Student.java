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
         System.out.println("to " + super.getName() + "���밴ʱ��ʵ�鱨��");
     }
     
    public String toString(){
        return "Student�ࣺ����Ϊ" + super.getName() + "  �绰Ϊ" 
                + super.getNumbers() + "  �꼶Ϊ" + status;
    }

}
