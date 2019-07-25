import java.util.Scanner;
public class program4{
       public static void main(String[] args){
              System.out.print("输入二维数组的行数和列数：");
              Scanner input = new Scanner(System.in);
              int row = input.nextInt();
              int column = input.nextInt();

              //输入二维数组的具体数据
              System.out.println("输入数组：");
              double[][] a = new double[row][column];
              for(int i=0; i<a.length; i++){
                  for(int j=0; j<a[i].length; j++){
                        a[i][j] = input.nextDouble();
                  }//columnOfa结束
              }//rowOfa结束
              Location location = locateLargetst(a);

              //输出最大元素及下标
              System.out.println("最大元素及其下标是：" + location.maxValue + " (" 
                               + location.row + " , " + location.column + ")"); 
       }//main函数结束

       public static Location locateLargetst(double[][] a){
             Location location = new Location();
             //比较求最大数据及下标 
             double maxValue = a[0][0];
             int row = 0;
             int column = 0;
             for(int m=0; m<a.length; m++){
                  for(int n=0; n<a[m].length; n++){
                      if(maxValue<a[m][n]){
                           maxValue = a[m][n];
                           row = m;
                           column = n;
                      }
                  }//列结束
              }//行结束
             location.maxValue = maxValue;
             location.row = row;
             location.column = column; 
               
             return location;
            }//locateLargetst结束
}//class program4结束

       //创建Location类
       class Location{
            double maxValue;
            int row, column;    
       }
