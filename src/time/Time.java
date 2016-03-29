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
    }
    public void updateToCurrentTime(){
        Calendar cal = Calendar.getInstance();
        hours = cal.get(Calendar.HOUR_OF_DAY);
        minutes = cal.get(Calendar.MINUTE);
        seconds = cal.get(Calendar.SECOND);
    }
    int getHours(){
        return hours;
    }
    int getMinutes(){
        return minutes;
    }
    int getSeconds(){
        return seconds;
    }
    
}
