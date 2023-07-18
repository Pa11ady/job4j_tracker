package ru.job4j.inheritance;

public class HideExampleMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Cat cat1 = new Cat();
        animal.instanceInvoke();
        cat.instanceInvoke();
        Animal.staticInvoke();
        Cat.staticInvoke();
        animal.staticInvoke();
        cat1.staticInvoke();
        cat1.staticInvokeAnimal();
    }
}
