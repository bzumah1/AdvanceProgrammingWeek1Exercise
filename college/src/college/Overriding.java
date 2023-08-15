package college;
class Dog {
    public void animal() {
        System.out.println("Bark");
    }
}

class Cat extends Dog {
    @Override
    public void animal() {
        System.out.println("Meow");
    }
}

public class Overriding {
    public static void main(String[] args) {
       Dog dog = new Dog();
       Cat cat = new Cat();

       dog.animal();
       cat.animal();

    }
}
