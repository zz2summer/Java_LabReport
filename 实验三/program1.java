public class program1 {
	public static void main(String[] args) {
		Rectangle rectangle0 = new Rectangle();
		System.out.println("rectangle 0 width: " + rectangle0.width 
				+ " height: " + rectangle0.height + " area: " + rectangle0.getArea()
				+ " perimeter: " + rectangle0.getPerimeter());
					
		//������Ϊ4����Ϊ40�ľ���
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("rectangle 1 width: " + rectangle1.width 
				+ " height: " + rectangle1.height + " area: " + rectangle1.getArea()
				+ " perimeter: " + rectangle1.getPerimeter());	
				
		//������Ϊ3.5����Ϊ35.9�ľ���
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("rectangle 2 width: " + rectangle2.width 
				+ " height: " + rectangle2.height + " area: " + rectangle2.getArea()
				+ " perimeter: " + rectangle2.getPerimeter());	
	}//main����
}	

     //����Rectangle��
     class Rectangle {				
		double width;
		double height;
		//�޲ι��캯��
		Rectangle(){
			width = 1;
	    	        height = 1;
	   }
		//�вι��캯��
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
		}//class����


