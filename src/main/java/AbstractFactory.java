public interface AbstractFactory<Ani,Fu> {
    Ani createA(String animalType);
    Fu createF(String furType);
}
