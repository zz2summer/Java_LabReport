public class Person {
    private String name;
    private String numbers;

    public Person(){

    }
   
    public Person(String name, String numbers){
         this.name = name;
         this.numbers = numbers;
    }

    public String getName(){
         return name;
    }

    public String getNumbers(){
           return numbers;
    }

    public void setName(String name){
          this.name = name;
    }

    public void setNumbers(String numbers){
            this.numbers = numbers;
    }
    
    public String toString(){
          return "Person类：姓名为" + name + "  电话为" + numbers;
    }
}
