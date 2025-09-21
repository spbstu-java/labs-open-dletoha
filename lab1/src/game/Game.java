package game;

import strategy.*;

public class Game {
    public static void main(String[] args) {
        Hero hero = new Hero();

        hero.setMovementStrategy(new WalkStrategy());
        hero.move();

        hero.setMovementStrategy(new HorseRideStrategy());
        hero.move();

        hero.setMovementStrategy(new FlyStrategy());
        hero.move();
    }
}
