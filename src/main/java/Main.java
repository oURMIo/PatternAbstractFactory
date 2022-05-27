public class Main {
    public static void main(String[] arg){
//        var animal1 = (AbstractFactory) animalType -> "Cat";
//        animal1 = (AbstractFactory) FurFactory ->"White";
//        var animal = FactoryProvider.getFactory("Cat","Black");
        var animal1 = FactoryProvider.getFactory("Cat","White");
        FactoryProvider.print((Animal) animal1, (Fur) animal1);
    }
}
