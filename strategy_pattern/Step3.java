package strategy_pattern;

public class Step3 {

    /**
     * 가짜 오리(DecoyDuck)을 추가하려고 했더니
     * quack, fly 둘 다 아무것도 안해야됨;
     * 이렇게 상속으로 처리하는건 해결책이 아닌 것 같음.
     * 이후에 오리가 추가될 때 마다 fly랑 quack 전부 살펴보고 상황에 따라 오버라이드 해야됨.
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

    class DecoyDuck extends Duck {
        @Override
        public void display() {
            System.out.println("DecoyDuck display!");
        }

        @Override
        public void quack() {
            // do nothing
        }

        @Override
        public void fly() {
            // do nothing
        }
    }
}