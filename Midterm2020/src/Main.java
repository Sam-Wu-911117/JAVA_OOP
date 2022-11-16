class Time{
    private int hour,min,sec;
    public Time(int hour,int min,int sec){
        //(1)
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }
    //(2)
    public static int getTimeDiff(Time clock1, Time clock2){
        int h=0,m=0,s=0,total=0;
        h=clock1.hour-clock2.hour;
        m=clock1.min-clock2.min;
        s=clock1.sec- clock2.sec;
        total=s+60*m+60*60*h;
        if(total<0) return -total;
        else return total;
    }
    //(3)
    public void setHour(int hour){
        this.hour=hour;
    }
    public void setMin(int min){
        this.min = min;
    }
    public void setSec(int sec){
        this.sec = sec;
    }
    public int getHour(){
        return hour;
    }
    public int getMin(){
        return min;
    }
    public int getSec(){
        return sec;
    }
    //(4)
    public void setTime(int hour,int min,int sec){
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }
    //(5)
    public Time(){
        this(0,0,0);
    }
    public Time(Time t){
        this.hour=t.hour;
        this.min=t.min;
        this.sec=t.sec;
    }

    public String toString(){
        return "時間是"+hour+"點"+min+"分"+sec+"秒";
    }
}

class TimeManager{
    //(6)
    public void showTime(Time t){
        System.out.println("時間是"+t.getHour()+"點"+t.getMin()+"分"+t.getSec()+"秒");
    }
    public void reset(Time t){
         t.setHour(0);
         t.setMin(0);
         t.setSec(0);
    }
}

class SmartPhone{
    int year,month,day;
    private Time time;
    public SmartPhone(int year,int month,int day,int hour,int min,int sec){
        //(7)
        this.year=year;
        this.month=month;
        this.day=day;
        this.time=new Time(hour,min,sec);
    }
    //(8)
    public Time getSameTime(){
       return new Time(time);
    }
    //(9)
    public SmartPhone(){
        this(0,0,0,0,0,0);

    }
    public String toString(){
        return "日期是"+year+"年"+month+"月"+day+"日，時間是"+time.getHour()+"點"+time.getMin()+"分"+time.getSec()+"秒";
    }
}

public class Main {
    public static void main(String[] args){
        Time clock1=new Time(11,22,33);
        Time clock2=new Time(22,33,44);
        TimeManager tm=new TimeManager();
        tm.showTime(clock1);
        tm.showTime(clock2);
        System.out.println("時間相隔"+Time.getTimeDiff(clock1,clock2)+"秒");
        tm.reset(clock1);
        tm.showTime(clock1);
        SmartPhone sp=new SmartPhone(2020,11,17,14,50,40);
        System.out.println(sp);
        Time tt=sp.getSameTime();
        tt.setTime(15,16,17);
        System.out.println(tt);
        System.out.println(sp);
    }
}