package Lesson4;

public class Plate {
     int food;
     int getFood(){
         return food;
     }

    public Plate(int food) {
        this.food = food;
    }

    public void infoBefore() {
        System.out.println("Food amount in the plate before eat: " + food);
    }
    public void decreaseFood(int amount) {
        food -= amount;
    }
    public void increaseFood(int amountAdd){
        this.food += amountAdd;
    }
    boolean checkFood(int amountRest){
         return (food-amountRest) >=0;
    }

    public void infoAfter() {
         System.out.println("Food amount in the plate after eat:  " + food);
        }
}




