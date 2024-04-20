class base {
    base() {
        System.out.println("I am default constructor of base class");
    }

    base(int a) {
        System.out.println("I am base class with one value " + a);
    }

    base(int a, int b) {
        System.out.println("I am base class with two values");
    }

}

class derived extends base {
    derived() {
        System.out.println("I am default constructor of derived class");
    }

    derived(int a) {
        super(a);
        System.out.println("I am derived class with one value");
    }

    derived(int a, int b) {
        super(a, b);
        System.out.println("I am derived class with two values. ");
    }
}

public class Inheritence {
    public static void main(String[] args) {

        // derived d = new base(4,8);-throws an error
        base b = new derived(4, 8);
    }
}
