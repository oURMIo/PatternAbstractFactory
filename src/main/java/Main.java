public class Main {
    public static void main(String[] arg) {
        AbstractFactory factory = FactoryProvider.getFactory();
        Animal animal = factory.createAnimal();
        Fur fur = factory.createFur();

        Animal animal1 = factory.createAnimal();
        Fur fur1 = factory.createFur();

        Animal animal2 = factory.createAnimal();
        Fur fur2 = factory.createFur();

        factory.print(animal, fur);
        factory.print(animal1, fur1);
        factory.print(animal2, fur2);
    }
}
