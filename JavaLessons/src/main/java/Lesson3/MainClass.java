package Lesson3;
// 4. Создать массив из 5 сотрудников.
// 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
public class MainClass {
    public static void main(String[] args) {
        Staff[] persArray = new Staff[5];
        persArray[0]=new Staff("Kill Bill", "PM","kb@gmail.com","80296552586",
                1000,56);
        persArray[1]=new Staff("Pretty Molly","Office Staff","pm@gmail.com","80258458956",
                500,24);
        persArray[2]=new Staff("Blue Laguna","Java AQA","bl@gmail.com","80296665544",
                1500,35);
        persArray[3]=new Staff("Ugly Thorn","Tester","ut@gmail.com","80445857575",
                700,45);
        persArray[4]=new Staff("Baba Yoga","C++Dev","by@gmail.com","80232565656",
                2000,48);
        for (int i=0; i < persArray.length; i++){
            if (persArray[i].getAge() >40){
                persArray[i].print();
            }
        }
    }
}
