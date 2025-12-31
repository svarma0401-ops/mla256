package com.dtm;

final class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ImmutablePerson { Name=" + name + ", Age=" + age + " }";
    }
}

public class ExpImmutable {
    public static void main(String[] args) {
        ImmutablePerson person = new ImmutablePerson("Kohli", 38);
        System.out.println(person);

    }
}
