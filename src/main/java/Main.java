public class Main {
    public static void main(String[] args) {
        Herb herb = new Herb();
        Cow cow = new Cow();
        cow.eat(herb);
        Lion lion = new Lion();
        lion.eat(cow);
        Goat goat = new Goat();
        lion.eat(cow);
    }
}
