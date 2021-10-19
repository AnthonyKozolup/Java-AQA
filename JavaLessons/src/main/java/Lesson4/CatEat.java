package Lesson4;
//Расширить задачу про котов и тарелки с едой, выполнив следующие пункты:
//● Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например,
//в миске 10 еды, а кот пытается покушать 15­20).
//● Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось
//покушать (хватило еды), сытость = true.
//● Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину
//сыт (это сделано для упрощения логики программы).
//● Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом
//вывести информацию о сытости котов в консоль.
// ● Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

public class CatEat {
    public static void main(String[] args) {
        Cat1[] cat = new Cat1[3];
        cat[0] = new Cat1("Murka", 50, true);
        cat[1] = new Cat1("Perseida", 90, false);
        cat[2] = new Cat1("Monika", 25, false);
        Plate plate = new Plate(80);


        for (int c = 0; c < cat.length; c++) {
            plate.infoBefore();
            if (cat[c].bellyFull == true){
                System.out.println("Cat " + cat[c].getName() + " isn't hungry");
            }
            if (cat[c].bellyFull == false){
                if (!plate.checkFood(cat[c].getAppetite())) {
                plate.increaseFood(10);
                    System.out.println("Let's add some food");
                    plate.infoBefore();
            }
            if (plate.food < cat[c].getAppetite()) {
                System.out.println("Still not enough food to eat for " + cat[c].getName());
            } else {
                cat[c].eat(plate);
                cat[c].setBellyFull();
                System.out.println("Cat " + cat[c].getName() + " has eaten " + cat[c].getAppetite() + " gramms of food");
            }

            }
        }plate.infoAfter();
    }
}
