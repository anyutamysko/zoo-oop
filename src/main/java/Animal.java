public abstract class Animal<T extends Eatable> {
    public void eat(T eating) {
        System.out.println("I am eating " + eating);
    }
}
