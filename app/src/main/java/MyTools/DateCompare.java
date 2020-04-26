package MyTools;

public class DateCompare {

    private static int _year, _month, _day;

    public DateCompare(int year, int month, int day) {

        setCurrentYear(year);
        setCurrentMonth(month);
        setCurrentDay(day);
    }

    public DateCompare() {

        _year = 0;
        _month = 0;
        _day = 0;
    }

    public static void setCurrentYear(int year) {

        _year = year;
    }

    public static int getCurrentYear() {

        return _year;
    }

    public static void setCurrentMonth(int month) {

        _month = month;
    }

    public static int getCurrentMonth() {

        return _month;
    }

    public static void setCurrentDay(int day) {

        _day = day;
    }

    public static int getCurrentDay() {

        return _day;
    }

    public int getMyAge(int year, int month, int day) {

        int age = (_year - year) - 1;

        if ((_month >= month) && (_day >= day))     
           return age++;

        return age;
    }
    
    public boolean isEqualDate(int year,int month,int day){
      
        if(isEqualYear(year))
          if(isEqualMonth(month))
            if(isEqualDay(day))
               return true;
               
       return false;         
      
    }
    
    public boolean isEqualYear(int year){
      
      return (_year == year);
    }
    
    public boolean isEqualMonth(int month){
      
      return (_month == month);
    }
    
    public boolean isEqualDay(int day){
      
      return (_day == day);
    }
}
