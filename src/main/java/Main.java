public class Main {
    public static void main(String[] arg){
//        var animal1 = (AbstractFactory) animalType -> "Cat";
//        animal1 = (AbstractFactory) FurFactory ->"White";
        var animal = FactoryProvider.getFactory("Cat","Black");

    }
}
