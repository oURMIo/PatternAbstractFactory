public class FurFactory implements AbstractFactory<Fur>{
    @Override
    public Fur create(String animalType) {
        if ("White".equalsIgnoreCase(animalType)) {
            return new White();
        } else if ("Black".equalsIgnoreCase(animalType)) {
            return new Black();
        }
        return null;
    }
}
