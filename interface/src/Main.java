public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("dog");
        Animal cat = new Cat("cat");
        Animal lion = new Lion("lion");

        dog.eat();
        cat.drink();
        lion.sleep();
    }
}

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void drink() {
        System.out.println(name + " is drinking water.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}
