public class Animal {
    private final String name;
    private final Boolean isDog;

    public Animal(String name, Boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }
    public String getName() {
        return name;
    }

    public Boolean getIsDog() {
        return isDog;
    }

    @Override
    public String toString() {
        return name + '\'' + "s is a Dog= " + isDog;
    }

}
