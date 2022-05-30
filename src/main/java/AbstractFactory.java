public interface AbstractFactory<Ani,Fu> {
    Ani createA(String animalType);
    Fu createF(String furType);

    public default void print(Animal obj1, Fur obj2){
        System.out.printf("%n It's a %s and make sound %s with %s fur",
                obj1.type(),
                obj1.sound(),
                obj2.color());
    }
}
