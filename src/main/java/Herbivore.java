public class Herbivore<T extends Herb> extends Animal<T> implements Eatable {
    @Override
    public void eat(T eating) {
        super.eat(eating);
    }
}
