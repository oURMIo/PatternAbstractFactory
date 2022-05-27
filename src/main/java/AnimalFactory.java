public class AnimalFactory implements AbstractFactory<Animal>{
    public AnimalFactory(String choice2) {
        if ("Dog".equalsIgnoreCase(choice2)) {
            createDog();
        } else if ("Cat".equalsIgnoreCase(choice2)) {
            createCat();
        }
    }

    public Animal createCat() {
        return new Cat();
    }

    public Animal createDog() {
        return new Dog();
    }

    @Override
    public Animal create(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            createDog();
        } else if ("Cat".equalsIgnoreCase(animalType)) {
            createCat();
        }
        return null;
    }
}