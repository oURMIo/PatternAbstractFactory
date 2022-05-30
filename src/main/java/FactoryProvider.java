public class FactoryProvider {
    public static AbstractFactory getFactory() {
        if (Math.random() * 10 < 5) {
            return new CatFactory();
        } else {
            return new DogFactory();
        }
    }
}