package sprint08.gson;

import com.google.gson.Gson;

public class MyGson {

    public static void main(String[] args) {

        Owner owner = new Owner("Name", "Suname");
        Dog dog = new Dog("friend", owner, 5);

        Gson gson = new Gson();
        String jsonDog = gson.toJson(dog);
        System.out.println(jsonDog);

        Dog jDog = gson.fromJson(jsonDog, Dog.class);

        System.out.println("Собака:");
        System.out.println("Кличка: " + dog.getName());
        System.out.println("Возраст: " + dog.getAge());
        System.out.println("Владелец:");
        Owner jOwner = dog.getOwner();
        System.out.println("Имя: " + owner.getName());
        System.out.println("Фамилия: " + owner.getSurname());
    }
}

class Dog {
    private String name;

    public Dog(String name, Owner owner, int age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private Owner owner;
    private int age;
}

class Owner {
    public Owner(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String name;
    private String surname;
}