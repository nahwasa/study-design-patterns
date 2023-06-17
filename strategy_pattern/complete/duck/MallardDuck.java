package strategy_pattern.complete.duck;

import strategy_pattern.complete.flybehavior.FlyWithWings;
import strategy_pattern.complete.quackbehavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다");
    }
}
