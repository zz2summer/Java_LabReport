import java.util.Scanner;
public class program4{
       public static void main(String[] args){
              System.out.print("�����ά�����������������");
              Scanner input = new Scanner(System.in);
              int row = input.nextInt();
              int column = input.nextInt();

              //�����ά����ľ�������
              System.out.println("�������飺");
              double[][] a = new double[row][column];
              for(int i=0; i<a.length; i++){
                  for(int j=0; j<a[i].length; j++){
                        a[i][j] = input.nextDouble();
                  }//columnOfa����
              }//rowOfa����
              Location location = locateLargetst(a);

              //������Ԫ�ؼ��±�
              System.out.println("���Ԫ�ؼ����±��ǣ�" + location.maxValue + " (" 
                               + location.row + " , " + location.column + ")"); 
       }//main��������

       public static Location locateLargetst(double[][] a){
             Location location = new Location();
             //�Ƚ���������ݼ��±� 
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
                  }//�н���
              }//�н���
             location.maxValue = maxValue;
             location.row = row;
             location.column = column; 
               
             return location;
            }//locateLargetst����
}//class program4����

       //����Location��
       class Location{
            double maxValue;
            int row, column;    
       }
