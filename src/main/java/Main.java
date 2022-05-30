public class Main {
    public static void main(String[] arg){
        var animal1 = FactoryProvider.getFactory();
        animal1.print((Animal) animal1, (Fur) animal1);
    }
}
