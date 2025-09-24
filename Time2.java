package B11221009;
public class Time2{
    private int hour;
    private int minute;
    private int secound;
    public Time2(){
        this(0,0,0);
    }
    public Time2(int hour){
        this(hour,0,0);
    }
    public Time2(int hour, int minute){
        this(hour,minute,0);
    }
    public Time2(int hour,int minute,int secound){
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be  0-23 ");
        }
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be  0-59 ");
        }
        if (secound < 0 || secound >= 60) {
            throw new IllegalArgumentException("secound must be  0-59 ");
        }
        this.hour = hour;
        this.minute = minute;
        this.secound = secound;
    }
    public Time2(Time2 time){
        this(time.getHour(),time.getMinute(),time.getSecound());
    }

    public void setTime(int hour, int minute , int secound){
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be  0-23 ");
        }
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be  0-59 ");
        }
        if (secound < 0 || secound >= 60) {
            throw new IllegalArgumentException("secound must be  0-59 ");
        }
        this.hour = hour;
        this.minute = minute;
        this.secound = secound;
    }
    public void setHour(int hour){
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be  0-23 ");
        }
        this.hour = hour;
    }
    public void setMinute(int minute){
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be  0-59 ");
        }
        this.minute = minute;
    }
    public void setSecound(int secound){
        if (secound < 0 || secound >= 60) {
            throw new IllegalArgumentException("secound must be  0-59 ");
        }
        this.secound = secound;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecound(){
        return secound;
    }
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecound());
    }
    public String toString(){
        return String.format("%d:%02d:%02d %s",((getHour() == 0 || getHour() == 12) ? 12 : getHour()%12),getMinute(),getSecound(),(getHour() < 12 ? "AM" : "PM"));
    }
    public String totTotalSecond(){
        return String.format("%02d:",getHour()*60*60+getSecound());
    }
}