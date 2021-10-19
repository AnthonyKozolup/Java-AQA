package Lesson4;

public class Cat1 {
    private String catName;
    private int appetite;
    boolean bellyFull;

    String getName() {
        return catName;
    }

    int getAppetite(){
        return appetite;
    }

    boolean setBellyFull(){
    return true;
    }

    public Cat1 (String catName, int appetite, boolean bellyFull) {
        this.catName = catName;
        this.appetite = appetite;
        this.bellyFull = bellyFull;
    }
    public void eat(Plate p) {
         p.decreaseFood(appetite);
    }

}

