package com.advance;

// case 1:
class Person implements Cloneable {
    int age = 25;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneableExample {
    public static void main(String[] args) throws Exception {

        Person p1 = new Person();
        Person p2 = (Person) p1.clone();

        System.out.println(p1.age);
        System.out.println(p2.age);
    }
}

// case 2:
class Animal {
    int legs = 4;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class CloneableFail {
    public static void main(String[] args) throws Exception {

        Animal a = new Animal();
        a.clone();   // Exception here
        // CloneNotSupportedException
    }
}
