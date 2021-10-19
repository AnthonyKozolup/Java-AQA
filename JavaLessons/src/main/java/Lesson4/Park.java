package Lesson4;
//Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
// времени их работы и стоимости.

import javax.sound.sampled.Line;
import java.util.Scanner;

public class Park {
    public static Info [] attractionArr;
    public String park="Gorky Park";

    public String getPark(){
        return park;
    }
    public Park(){
        super();
    }
        public static class Info{
        String name;
        String workingTime;
        int attractionPrice;
            public Info(String name, String workingTime, int attractionPrice) {
                super();
                this.name = name;
                this.workingTime = workingTime;
                this.attractionPrice = attractionPrice;
                attractionArr = new Info[3];
                attractionArr[0] = new Info("American Mountain", "9am-10pm", 25);
                attractionArr[1] = new Info("Yachting", "9am-6pm", 50);
                attractionArr[2] = new Info("Batut", "10am-8pm", 10);
            }
            public static void printAttr(){
                for (int i = 0; i < attractionArr.length; i++) {
                    System.out.println("Attraction name: " + attractionArr[i].name + ". "+ "Working time: " +
                            attractionArr[i].workingTime + ". " + "Price: " + attractionArr[i].attractionPrice + ".");
                    }
            }

    }

}






