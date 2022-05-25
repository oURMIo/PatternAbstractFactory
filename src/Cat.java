public class Cat implements Animal{
    @Override
    public String type() {
        return "Cat";
    }

    @Override
    public String sound() {
        return "Meow";
    }

    @Override
    public boolean active() {
        return false;
    }
}
