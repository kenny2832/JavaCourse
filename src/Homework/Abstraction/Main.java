package Homework.Abstraction;

public class Main {

    private String name;
    private int age;
    private String gender;

    public Main(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }



}

