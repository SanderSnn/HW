interface HomeAnimal {
    String getVoice();

    String getName();

    int getAge();
}

abstract class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Cat extends Animal implements HomeAnimal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String getVoice() {
        return "Мяу";
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

class Dog extends Animal implements HomeAnimal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getVoice() {
        return "Гав-гав";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
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

class AnimalInfo {
    public static void main(String[] args) {
        HomeAnimal cat = new Cat("Пёс", 5);
        HomeAnimal dog = new Dog("Бим", 10);
        System.out.println("Имя кота: " + cat.getName() + "; Возраст: " + cat.getAge());
        System.out.println("Кот говорит: " + cat.getVoice());
        System.out.println("Имя собаки: " + dog.getName() + "; Возраст: " + dog.getAge());
        System.out.println("Собака говорит: " + dog.getVoice());
    }
}