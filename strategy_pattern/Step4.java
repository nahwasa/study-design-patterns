package strategy_pattern;

public class Step4 {

    /**
     * 상속은 아닌 것 같으니 인터페이스를 추가해서 해결해보려 하는 과정임.
     * 문제는 기존에 상속해서 fly랑 quack 잘 쓰고 있던 오리들도
     * 구조가 바뀌면서 전부 fly랑 quack을 구현해야 됨;
     * 따라서 전체적인 오리들을 전부 손대야 하는대다가 코드중복이 발생해버림.
     * 이것도 아닌 것 같음.
     */

    class Duck {
        public void swim() {
            System.out.println("Swim!");
        }

        public void display() {
            System.out.println("Display!");
        }
    }

    interface Flyable {
        public void fly();
    }

    interface Quackable {
        public void quack();
    }

    class MallardDuck extends Duck implements Flyable, Quackable {
        @Override
        public void display() {
            System.out.println("MallardDuck display!");
        }

        @Override
        public void fly() {
            System.out.println("Fly!");
        }

        @Override
        public void quack() {
            System.out.println("Quack!");
        }
    }

    class RedheadDuck extends Duck implements Flyable, Quackable {
        @Override
        public void display() {
            System.out.println("RedheadDuck display!");
        }

        @Override
        public void fly() {
            System.out.println("Fly!");
        }

        @Override
        public void quack() {
            System.out.println("Quack!");
        }
    }

    class RubberDuck extends Duck implements Quackable {
        @Override
        public void quack() {
            System.out.println("Squeak!");
        }

        @Override
        public void display() {
            System.out.println("RubberDuck display!");
        }
    }

    class DecoyDuck extends Duck {
        @Override
        public void display() {
            System.out.println("DecoyDuck display!");
        }
    }
}