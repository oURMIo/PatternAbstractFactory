public class AnimalFactory implements AbstractFactory<Animal>{
    @Override
    public Animal create(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Cat".equalsIgnoreCase(animalType)) {
            return new Cat();
        }
        return null;
    }
}
