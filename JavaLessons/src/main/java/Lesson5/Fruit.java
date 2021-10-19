package Lesson5;

 class Fruit {
    float weight;
    int fruit;

    Fruit(float weight,int fruit){
        this.weight=weight * fruit;
        this.fruit = fruit;
    }
    float getWeight(){
        return weight;
    }



}
