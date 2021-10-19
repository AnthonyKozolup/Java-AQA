package Lesson5;

import java.util.ArrayList;
import java.util.List;

class Boxes<B extends Fruit> {
      List<B> fruitList;
      float boxWeight = 0;
      float maxboxWeight=25.0f;
      String name;


       Boxes(){
          this.fruitList=new ArrayList<>();
       }


      void addFruit(B fruit){
           if (boxWeight>maxboxWeight) {
               System.out.println("Fruitbox can weight max 25 kg. We have " + boxWeight + " kg in total. "+
                       (boxWeight - maxboxWeight) + " kg is left");
               boxWeight = maxboxWeight;
           } else {
           boxWeight= fruit.weight;
           }
       }
       void createBox(B fruit){
           fruitList.add(fruit);
           boxWeight = boxWeight+fruit.getWeight();
           if (boxWeight>=maxboxWeight)
               System.out.println("We need another box");
       }

           float getBoxWeight() {
               return boxWeight;
           }

           public boolean compareBox (Boxes boxes){
           return this.getBoxWeight() == boxes.getBoxWeight();
      }

}
