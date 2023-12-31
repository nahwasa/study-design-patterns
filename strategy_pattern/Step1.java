package strategy_pattern;

public class Step1 {

    /**
     * 기본 형태
     */

    class Duck {
        public void quack() {
            System.out.println("Quack!");
        }

        public void swim() {
            System.out.println("Swim!");
        }

        public void display() {
            System.out.println("Display!");
        }
    }

    class MallardDuck extends Duck {
        @Override
        public void display() {
            System.out.println("MallardDuck display!");
        }
    }

    class RedheadDuck extends Duck {
        @Override
        public void display() {
            System.out.println("RedheadDuck display!");
        }
    }

    class RubberDuck extends Duck {
        @Override
        public void quack() {
            System.out.println("Squeak!");
        }

        @Override
        public void display() {
            System.out.println("RubberDuck display!");
        }
    }
}