package Lesson4;

public class Dog extends Animals{
    int maxRun = 500;
    int maxSwim = 10;

    public Dog(String name, int run, int swim) {
        super(name, run, swim);
    }
    public void dogRun() {
            if (run > 0 && run <= maxRun) {
                System.out.println("Dog " + name + " runs " + run + " m");
            } else {
                System.out.println("Dog " + name + " can't run " + run + " m");
        }
    }
    public void dogSwim(){
        if (swim > 0 && swim <= maxSwim){
            System.out.println("Dog " + name + " swims " + swim + " m");
        }else {
            System.out.println("Dog " + name + " can't swim " + swim + " m");
        }
    }

}



