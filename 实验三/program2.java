public class program2 {
	public static void main(String[] args) {					
		//创建第一个Fan对象
		Fan fan1 = new Fan();
                fan1.setSpeed(3);
                fan1.setRadius(10);
                fan1.setColor("yellow");
                fan1.isOn(true);
		System.out.println(fan1.toString());	
						
		//创建第二个Fan对象
		Fan fan2 = new Fan();
                fan2.setSpeed(2);
                fan2.setRadius(5);
                fan2.setColor("blue");
                fan2.isOn(false);
		System.out.println(fan2.toString());
	        }//main结束
}	

        //创建Fan类
	class Fan {				
        final int SLOW = 1;
        final int MEDIUM = 2;
	final int FAST = 3;
		    	 
	private int speed;
	private boolean on;
	private double radius;
	String color;
	
        //创建无参构造函数	    	
	Fan(){         
	     speed = SLOW;
	     on = false;
	     radius = 5;
	     color = "blue";
	}
		    	
        int getSpeend() {
		return speed;
	}
		    	
        public void setSpeed(int speed) {
	        this.speed = speed;
        }
		    	
        boolean getOn(){
                return on;
        }
        
        public void isOn(boolean on){
                this.on = on;
        }

        double getRadius(){
               return radius;
         }
    
        public void setRadius(double radius){
              this.radius = radius;
        }
        
        String getColor(){
              return color;
        }

        public void setColor(String color){
              this.color = color;
        }
  
        public String toString(){
	      if(on){
	            return "speed  " + speed + "\tcolor  " + color + "\tradius " + radius;
	      }
	      else{
		    return "fan is off " + "\tcolor  " + color + " " + "\tradius " + radius;
	      }	
        }//String结束
}//class结束


