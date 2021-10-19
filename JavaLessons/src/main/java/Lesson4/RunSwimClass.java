package Lesson4;

public class RunSwimClass {
    public static void main (String[] args){
        Cat [] catArray = new Cat [3];
        catArray[0]=new Cat("Barsik", 150, 50);
        catArray[1]=new Cat("Musia",286,0);
        catArray[2]=new Cat("Murzik",15,4);

        Dog [] dogArray = new Dog [3];
        dogArray[0]=new Dog("Fafik", 358,8);
        dogArray[1]=new Dog("Bobik", 200,15);
        dogArray[2]=new Dog("Dodik",-5,6);

        for (int i=0;i<catArray.length;i++) {
            catArray[i].catRun();
            catArray[i].catSwim();
        }

        for (int f=0; f<dogArray.length;f++) {
            dogArray[f].dogRun();
            dogArray[f].dogSwim();
        }
    }
}



