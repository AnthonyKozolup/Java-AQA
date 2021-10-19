package Lesson4;
//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
// Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); ­> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать,
// собака 10 м.).

import java.util.Scanner;

 public abstract class Animals {
     String name;
     int run;
     int swim;

     public Animals(String name, int run, int swim){
         this.name=name;
         this.run=run;
         this.swim=swim;
     }
 }














