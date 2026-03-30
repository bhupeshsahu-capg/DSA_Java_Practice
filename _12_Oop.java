public class _12_Oop {
    public static void main(String args[]) {
        //Creating object of a class
        Pen p1 = new Pen(); //Constructor
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(3);
        System.out.println(p1.tip);
        //updating the value
        p1.color = "Red";
        p1.tip = 5;
        System.out.println(p1.color);
        System.out.println(p1.tip);

        

        //2nd Object - Bank Account
        BankAccount myAcc = new BankAccount();
        myAcc.userName = "Bhupesh";
        //myAcc.password = "Bhupesh@1234"; //showing error because password is private
        myAcc.setPassword("Bhupesh");



        //Solving Hybrid inheritance question
        Human bhupesh = new Human(); //constructor
        bhupesh.think();
        bhupesh.breath();
        bhupesh.walk();
    }
}

//Creating new class - Pen
class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

//Access Modiifiers
class BankAccount {
    public String userName;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}

// Encapsulation - Wrapping up of data and methods under a single unit. It also implements data hiding

//Constructor - Special method which is called automatically at the time of object creation.

//Inheritance - Properties of a base calss are passed on to a derived class.

//Polymorphism - When we try to achieve a same thing in different forms/ways.

//Compile time polymorphism - Method Overloading - Multiple functions with same name but different paramaters.

//Run time polymorphism - Method Overriding - Parent and child both contain the same function with different definition.

//Abstraction - Hiding all the unnecessary details and showing only the important parts to the user.

//Example of Hybrid Inheritance
class Animal {
    void breath() {
        System.out.println("Animals Breathing...");
    }
} 

class Fish extends Animal {
    void swim() {
        System.out.println("Fish can swim...");
    }
}

class Tuna extends Fish {
    void fins() {
        System.out.println("Tuna have the smallest fins in all the fishes...");
    }
}

class Shark extends Fish {
    void biggest() {
        System.out.println("Shark is the biggest in all the Fishes...");
    }
}



class Bird extends Animal {
    void fly() {
        System.out.println("Birds can fly...");
    }
}

class Pigion extends Bird {
    void color() {
        System.out.println("White pigions are one of the most beautiful Birds");
    }
}

class Mammals extends Animal {
    void walk() {
        System.out.println("Mammals can walk...");
    }
}

class Cat extends Mammals {
    void naughty() {
        System.out.println("Cats are the naughty one in our family...");
    }
} 

class Human extends Mammals {
    void think() {
        System.out.println("Humans can think out of the box...");
    }
}





