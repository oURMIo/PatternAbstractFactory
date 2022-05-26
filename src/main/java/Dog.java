public class Dog implements Animal{
    @Override
    public String type() {
        return "Dog";
    }

    @Override
    public String sound() {
        return "Gav";
    }

    @Override
    public boolean active() {
        return true;
    }

    @Override
    public void print() {
        System.out.printf("It's %s and make sound %s",type(),sound());
    }
}
