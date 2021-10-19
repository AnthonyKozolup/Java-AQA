package Lesson4;

import Lesson4.Park.Info;

import static Lesson4.Park.Info.printAttr;


public class ParkLeisure {
    public static void main (String [] args){
        Park p = new Park();
        System.out.println("In " + p.getPark() + " you can use:");
        printAttr();
    }

}

