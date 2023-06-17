package strategy_pattern.complete.duck;

import strategy_pattern.complete.flybehavior.FlyNoWay;
import strategy_pattern.complete.quackbehavior.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다");
    }
}