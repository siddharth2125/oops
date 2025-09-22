class Animal {
    String name; int age;
    Animal(String name, int age) { this.name = name; this.age = age; }
    void makeSound() { System.out.println("Animal makes a sound"); }
}

class Dog extends Animal {
    Dog(String n,int a){ super(n,a); }
    @Override void makeSound(){ System.out.println("Woof!"); }
}

class Cat extends Animal {
    Cat(String n,int a){ super(n,a); }
    @Override void makeSound(){ System.out.println("Meow!"); }
}

class Bird extends Animal {
    Bird(String n,int a){ super(n,a); }
    @Override void makeSound(){ System.out.println("Chirp!"); }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Tommy",3),
            new Cat("Kitty",2),
            new Bird("Tweety",1)
        };
        for(Animal a: animals) a.makeSound();
    }
}
