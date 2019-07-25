public class program1 {
	public static void main(String[] args) {
		Rectangle rectangle0 = new Rectangle();
		System.out.println("rectangle 0 width: " + rectangle0.width 
				+ " height: " + rectangle0.height + " area: " + rectangle0.getArea()
				+ " perimeter: " + rectangle0.getPerimeter());
					
		//创建宽为4，高为40的矩形
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("rectangle 1 width: " + rectangle1.width 
				+ " height: " + rectangle1.height + " area: " + rectangle1.getArea()
				+ " perimeter: " + rectangle1.getPerimeter());	
				
		//创建宽为3.5，高为35.9的矩形
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("rectangle 2 width: " + rectangle2.width 
				+ " height: " + rectangle2.height + " area: " + rectangle2.getArea()
				+ " perimeter: " + rectangle2.getPerimeter());	
	}//main结束
}	

     //创建Rectangle类
     class Rectangle {				
		double width;
		double height;
		//无参构造函数
		Rectangle(){
			width = 1;
	    	        height = 1;
	   }
		//有参构造函数
		Rectangle(double newWidth, double newHeight){
	     	        width = newWidth;
	    	        height = newHeight;
	    	}
					
		double getArea(){
	    	        return width*height;
	    	}
						
		double getPerimeter(){
			return (width+height)*2;
		}
							
		void setWidthHeight(double newWidth, double newHeight){
	        	width = newWidth;
	         	height = newHeight;
	    	}
		}//class结束


