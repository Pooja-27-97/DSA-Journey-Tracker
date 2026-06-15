public class Oops {
    public static void main(String[] args) {
        // Pen p1 = new Pen(); //object
        // p1.setColor("Purple");
        // System.out.println(p1.getColor());


        // Student s1 = new Student();
        // s1.name = "Brecky";
        // s1.roll = 7;
        // s1.password = "123abcd";
        // s1.marks[0] = 90;
        // s1.marks[1] = 80;
        // s1.marks[2] = 100;

        // Student s2 = new Student(s1);
        // s2.password = "abcd";
        // s1.marks[1] = 95;
        // for(int i=0; i < 3; i++) {
        //     System.out.println(s2.marks[i]);
        // }

        // Dog d1 = new Dog();
        // d1.bark();
        // d1.breath();

        // Calculator c1 = new Calculator();
        // System.out.println(c1.sum(5, 10));
        // System.out.println(c1.sum(27.7, 97.2));
        // System.out.println(c1.sum(5, 4, 9));

        // Deer d1 = new Deer();
        // d1.eat();
        // Dog d1 = new Dog();
        // System.out.println(d1.color);

        // Queen q1 = new Queen();
        // q1.moves();

        // Student s1 = new Student();
        // s1.school = "JKV";
        // Dog d1 = new Dog();
        // System.out.println(d1.color);
        
    }
}



class Animal {
    String color;
    Animal() {
        System.out.println("Animal is created");
    }
}

class Dog extends Animal {
    Dog() {
        super.color = "Black";
        System.out.println("Dog is created");
    }
}

// class Student {
//     String name;
//     int roll;
//     static String school;

//     void setName(String name) {
//         this.name = name;
//     }

//     String getName() {
//         return this.name;
//     }
// }

// interface ChessPlayer {
//     void moves();
// }

// class Queen implements ChessPlayer {
//     public void moves() {
//         System.out.println("Moves in all directions");
//     }
// }

// class Rook implements ChessPlayer {
//     public void moves() {
//         System.out.println("Moves in all directions, not diagonally");
//     }
// }

// abstract class Animal {
//     String color;
//     Animal() {
//         color = "Brown";
//     }
//     void eat() {
//         System.out.println("Eats anything");
//     }
//     abstract void walk();
// }

// class Dog extends Animal {
//     void changeColor() {
//         color = "White";
//     }
//     void walk() {
//         System.out.println("Walks on 4 legs");
//     }
// }

// class Animal{
//     void eat() {
//         System.out.println("Eats anything");
//     }
// }

// class Deer extends Animal {
//     void eat() {
//         System.out.println("Eats grass");
//     }
// }

// class Calculator {
//     int sum(int a, int b) {
//         return a+b;
//     }

//     double sum(double a, double b) {
//         return a+b;
//     }

//     int sum(int a, int b, int c) {
//         return a+b+c;
//     }
// }

// class Animal {
//     String color;

//     void eat() {
//         System.out.println("Eats food");
//     }

//     void breath() {
//         System.out.println("Breath through nose");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Bow!");
//     }
// }

// class Cat extends Animal {
//     void meow() {
//         System.out.println("Meow!");
//     }
// }

// class Pen { //class
//     private String color;
//     private int tip;

//     String getColor() {
//         return this.color;
//     }

//     void setColor(String newColor) {
//         color = newColor;
//     }

//     void setTip(int newTip) {
//         tip = newTip;
//     }
// }

// class Student {
//     String name;
//     int roll;
//     String password;
//     int marks[];

//     //shallow
//     // Student(Student s1) {
//     //     marks = new int[3];
//     //     this.name = s1.name;
//     //     this.roll = s1.roll;
//     //     this.marks = s1.marks;
//     // }

//     //Deep-copy
//     Student(Student s1) {
//         marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         for(int i=0; i < marks.length ; i++) {
//             this.marks[i] = s1.marks[i];
//         }
//     }

//     Student() {
//         System.out.println("Hello World!");
//     }

//     Student(String name) {
//         this.name = name;
//     }

//     Student(int roll) {
//         this.roll = roll;
//     }
// }