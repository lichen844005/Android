public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = new Animal();
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        Cat.testClassMethod();
        myCat.testInstanceMethod();
        myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        //myCat = (Cat) myAnimal;
        //Cat.testClassMethod();
        //myCat.testInstanceMethod();
    }
}
