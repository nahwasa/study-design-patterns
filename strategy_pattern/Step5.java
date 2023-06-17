package strategy_pattern;

public class Step5 {

    /**
     * [ 바뀌는 부분과 그렇지 않은 부분 분리하기 ] - strategy pattern 적용
     * 변화하는 부분을 뽑아내서 별도의 클래스 집합으로 분리!
     * 이전 Step들의 상속이나 인터페이스보다 훨씬 나은 것 같음.
     */

    public static void main(String[] args) {
        new Step5().simulate();
    }

    public void simulate() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }

    abstract class Duck {
        FlyBehavior flyBehavior;
        QuackBehavior quackBehavior;

        public Duck() {}

        public abstract void display();

        public void performFly() {
            flyBehavior.fly();
        }

        public void performQuack() {
            quackBehavior.quack();
        }

        public void swim() {
            System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
        }
    }

    interface FlyBehavior {
        public void fly();
    }

    class FlyWithWings implements FlyBehavior {
        @Override
        public void fly() {
            System.out.println("날고 있어요!~");
        }
    }

    class FlyNoWay implements FlyBehavior {
        @Override
        public void fly() {
            System.out.println("저는 못 날아요");
        }
    }

    interface QuackBehavior {
        public void quack();
    }

    class Quack implements QuackBehavior {
        @Override
        public void quack() {
            System.out.println("꽥");
        }
    }

    class MuteQuack implements QuackBehavior {
        @Override
        public void quack() {
            System.out.println("<< 조용~ >>");
        }
    }

    class Squeak implements QuackBehavior {
        @Override
        public void quack() {
            System.out.println("삑");
        }
    }

    class MallardDuck extends Duck {
        public MallardDuck() {
            quackBehavior = new Quack();
            flyBehavior = new FlyWithWings();
        }

        @Override
        public void display() {
            System.out.println("저는 물오리입니다");
        }
    }
}