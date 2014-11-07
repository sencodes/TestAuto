package learn;

/**
 * Created by PiriformAcer on 07/11/2014.
 */
public class Dog {
    void bark(){
        System.out.println("Ruff Ruff");

    }
}

class TestDog {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        System.out.println("testdog sample");

    }
}
class Vict {

    void vict() {
        System.out.println("vict");
    }
}