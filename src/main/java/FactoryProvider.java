public class FactoryProvider {
    public static AbstractFactory getFactory(String choice,String choice2){
        new AnimalFactory(choice);
        new FurFactory(choice2);
        return null;
    }
}