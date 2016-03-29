/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

import java.util.Calendar;

/**
 *
 * @author Lucas
 */
public class Time {

    private int hours;
    private int minutes;
    private int seconds;
    
    Time(){
        hours = minutes = seconds = 0;
    }
    Time(int h, int m, int s){
        hours = h;
        minutes = m;
        seconds = s;
        while(seconds>59){
            seconds -= 60;
            minutes++;
        }
        while(seconds<0){
            seconds += 60;
            minutes--;
        }
        while(minutes>59){
            minutes -= 60;
            hours++;
        }
        while(minutes<0){
            minutes += 60;
            hours--;
        }
    }
    public void updateToCurrentTime(){
        Calendar cal = Calendar.getInstance();
        hours = cal.get(Calendar.HOUR_OF_DAY);
        minutes = cal.get(Calendar.MINUTE);
        seconds = cal.get(Calendar.SECOND);
    }
    public Time subtract(Time t){
        return new Time(hours - t.getHours(), minutes - t.getMinutes(), seconds - t.getSeconds());
    }
    public Time sum(Time t){
        return new Time(hours + t.getHours(), minutes + t.getMinutes(), seconds + t.getSeconds());
    }
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }
    public void setHours(int h){
        hours = h;
    }
    public void setMinutes(int m){
        minutes = m;
    }
    public void setSeconds(int s){
        seconds = s;
    }
    
}
