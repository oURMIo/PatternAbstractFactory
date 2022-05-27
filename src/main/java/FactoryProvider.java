public class FactoryProvider {
    public static AbstractFactory getFactory(String choice,String choice2){
        if ("Cat".equalsIgnoreCase(choice)) {
            System.out.printf("create Cat ");
            new AnimalFactory("Cat");
        } else if ("Dog".equalsIgnoreCase(choice)) {
            System.out.printf("create Dog ");
            new AnimalFactory("Dog");
        }

        if ("White".equalsIgnoreCase(choice2)) {
            System.out.println(" with White");
            new FurFactory("White");
        } else if ("Black".equalsIgnoreCase(choice2)) {
            System.out.println(" with Black");
            new FurFactory("Black");
        }
        return null;
    }
    public static void print(Animal obj1, Fur obj2) {
        System.out.printf("%n It's a %s and make sound %s with %s fur",
                obj1.type(),
                obj1.sound(),
                obj2.color());
    }
}