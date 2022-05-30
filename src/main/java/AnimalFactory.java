public class AnimalFactory implements AbstractFactory<Animal,Fur>{
    @Override
    public Animal createA(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Cat".equalsIgnoreCase(animalType)) {
            return new Cat();
        }
        return null;
    }

    @Override
    public Fur createF(String furType) {
        if ("White".equalsIgnoreCase(furType)) {
            return new White();
        } else if ("Cat".equalsIgnoreCase(furType)) {
            return new Black();
        }
        return null;
    }
//    public static void print(Animal obj1, Fur obj2) {
//        System.out.printf("%n It's a %s and make sound %s with %s fur",
//                obj1.type(),
//                obj1.sound(),
//                obj2.color());
//    }
}