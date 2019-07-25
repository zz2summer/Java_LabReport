public class MyDate{
	private String year;
	private String month;
	private String day;
        
        public MyDate(){
            
        }

        public MyDate(String year, String month, String day){
             this.year = year;
             this.month = month;
             this.day = day;
        } 

        public String getYear(){
             return year;
        }

        public String getMonth(){
             return month;
        }

        public String getDay(){
               return day;
         }

        public void setYear(){
              this.year = year;
        }

        public void setMonth(String month){
            this.month = month;
        }

        public void setDay(String day){
           this.day = day;       
        }
}