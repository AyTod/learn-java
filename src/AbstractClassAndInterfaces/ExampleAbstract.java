package AbstractClassAndInterfaces;

public abstract class ExampleAbstract {
    private int memberOne;

    public abstract String functionOne();

    public void functionTwo() {
        System.out.println("I am function 2");
    }

    public static void main(String[] args) {
        System.out.println("I am abstract");
    }

}
