public abstract class AbstractToy {
    private String name;

    protected AbstractToy(String name) {
        this.name = name;
    }

    protected String getName() {
        return this.name;
    }

    protected abstract void play();
}
