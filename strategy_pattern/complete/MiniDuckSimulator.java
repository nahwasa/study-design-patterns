package strategy_pattern.complete;

import strategy_pattern.complete.duck.Duck;
import strategy_pattern.complete.duck.MallardDuck;
import strategy_pattern.complete.duck.ModelDuck;
import strategy_pattern.complete.flybehavior.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}