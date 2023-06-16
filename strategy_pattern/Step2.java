package strategy_pattern;

public class Step2 {

    /**
     * 일부 Duck들만 fly()를 추가하려고 하는데
     * Duck에 추가했더니 당연히 전부 적용되버림.
     * 러버덕은 날면 안되니깐 아무것도 안하게 오버라이드.
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

        public void fly() {
            System.out.println("Fly!");
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

        @Override
        public void fly() {
            // do nothing
        }
    }
}