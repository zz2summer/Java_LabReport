public class Exercise13_10 {
  public static void main(String[] args) { 
    try {
      int[] list = new int[20000000];
    }
    catch (OutOfMemoryError ex) {
      ex.printStackTrace();
      System.out.println("You are running out of memory.");
    }
    
    System.out.println("GO");
    

  }
}