/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author Lucas
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Time t = new Time();
        t.updateToCurrentTime();
        t = t.subtract(new Time(9,9,9));
        System.out.println(t.getHours() + ":" + t.getMinutes() + ":" + t.getSeconds());
    }
}
