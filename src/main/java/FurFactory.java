public class FurFactory implements AbstractFactory<Fur>{
    public FurFactory(String choice2) {
        if ("White".equalsIgnoreCase(choice2)) {
            createWhite();
        } else if ("Black".equalsIgnoreCase(choice2)) {
            createBlack();
        }
    }

    public Fur createWhite() {
        return new White();
    }

    public Fur createBlack() {
        return new Black();
    }

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