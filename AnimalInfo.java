interface HomeAnimal {

    String getName();

    int getAge();
}

abstract class Animal implements HomeAnimal{
    private String name;
    private int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    String getVoice() {
        return "Мяу";
    }

}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    String getVoice() {
        return "Гав-гав";
    }

}

class AnimalInfo {
    public static void main(String[] args) {
        Cat cat = new Cat("Пёс", 5);
        Dog dog = new Dog("Бим", 10);
        System.out.println("Имя кота: " + cat.getName() + "; Возраст: " + cat.getAge());
        System.out.println("Кот говорит: " + cat.getVoice());
        System.out.println("Имя собаки: " + dog.getName() + "; Возраст: " + dog.getAge());
        System.out.println("Собака говорит: " + dog.getVoice());
    }
}