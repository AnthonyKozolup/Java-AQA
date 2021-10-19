package Lesson3;
// 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
// 2. Конструктор класса должен заполнять эти поля при создании объекта.
// 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

public class Staff {

  private String name;
  private String position;
  private String email;
  private String phoneNo;
  private int wage;
  private int age;

    public int getAge(){
        return age;
    }


   public Staff (String name, String position, String email, String phoneNo, int wage, int age){
       this.name=name;
       this.position=position;
       this.email=email;
       this.phoneNo=phoneNo;
       this.wage=wage;
       this.age=age;
   }
    public void print() {
        System.out.println("Сотрудник: " + name + ", должность: " + position + ", почта: " + email + ", тел. " + phoneNo
                +", з/п: " + wage + ", возраст: " + age);
    }
}
