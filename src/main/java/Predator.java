public class Predator<T extends Herbivore<Herb>> extends Animal<T> {
    @Override
    public void eat(T eating) {
        super.eat(eating);
    }
}
