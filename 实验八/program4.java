import java.util.Date;  
import java.text.SimpleDateFormat;
import java.lang.Comparable;

public class program4{
     public static void main(String[] args){
        String[] a = {"apple","pear","banana","orange","anna",
                      "spring","summer","autumn", "winter","date"};
        Integer[] b = {1, 8, 5, 4, 2, 3, 9, 7, 6, 2};
        //Date�������ձ�ʾΪ �꣺������-1900 �£�������-1 �գ�������
        Date date1 = new Date(2018-1900, 6-1, 16);
        Date date2 = new Date(2019-1900, 5-1, 26);
        Date date3 = new Date(2008-1900, 8-1, 8);
        Date date4 = new Date(2009-1900, 7-1, 9);
        Date date5 = new Date(2001-1900, 4-1, 3);
        Date date6 = new Date(2015-1900, 9-1, 17);
        Date date7 = new Date(2020-1900, 12-1, 21);
        Date date8 = new Date(2013-1900, 11-1, 11);
        Date date9 = new Date(2002-1900, 2-1, 2);
        Date date10 = new Date(2014-1900, 1-1, 28);
        Date[] c = {date1, date2, date3, date4, date5,
                    date6, date7, date8, date9, date10}; 
        //�淶���������ʽΪ����-��-��
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");

        //�����������
        System.out.print("String: ");
        for(String e: a)
            System.out.print(e + " ");
        System.out.print("\nInteger: ");
        for(Integer e: b)
            System.out.print(e + " ");
        System.out.print("\nDate: ");
        //ÿ��5������
        for(int i=0; i<c.length; i++){
            if( (i+1) % 5 == 0){
               System.out.println( ft.format(c[i]) + " ");
               System.out.print("      ");
            }               
            else
               System.out.print( ft.format(c[i]) + " ");
        }
        //����max���������ÿ����������ֵ
        System.out.println("\nMax of String  : " + max(a));
        System.out.println("Max of Integer : " + max(b));
        System.out.println("Max of Date    : " + ft.format(max(c)) );
     }//main��������

     public static Object max(Comparable[] a){
          Comparable max = null;
          //���ж�ÿ���������ͣ�����comparaTo���αȽ�ѡ������ֵ
          if(a[0] instanceof String){
              max = (String)a[0];
              for(int i=1; i<a.length; i++){
                 if(max.compareTo((String) a[i]) < 0)
                     max = (String)a[i];
              }
          }
          else if(a[0] instanceof Integer){
              max = (Integer)a[0];
              for(int i=1; i<a.length; i++){
                 if(max.compareTo((Integer) a[i]) < 0)
                     max = (Integer)a[i];
              }
          }
          else if(a[0] instanceof Date){
              max = (Date)a[0];
              for(int i=1; i<a.length; i++){
                 if(max.compareTo((Date) a[i]) < 0)
                     max = (Date)a[i];
              }
         }
         return max;
     }//max��������

}//class����