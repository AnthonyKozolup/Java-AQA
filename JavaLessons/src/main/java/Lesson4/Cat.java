package Lesson4;

public class Cat extends Animals {
 int maxRun=200;
    public Cat(String name, int run, int swim) {
        super(name,run,swim);
    }


    public void catRun() {
        if (run>0 && run<=maxRun){
         System.out.println("Cat "+ name + " runs " + run + " m");
        }else{
            System.out.println("Cat " + name + " can't run " + run + " m");
        }
    }
    public void catSwim(){
        System.out.println("Cats can't swim at all");
    }

}
