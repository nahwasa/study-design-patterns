package strategy_pattern;

public class Step6 {

    /**
     * [ 동적으로 행동 지정하기 ] - strategy pattern 적용
     * 세터 메소드로 오리의 행동을 동적으로 바꿀 수 있도록 함.
     * 이제 중간에 오리의 행동 변경 가능.
     */

    public static void main(String[] args) {
        new Step6().simulate();
    }

    public void simulate() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
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

        public void setFlyBehavior(FlyBehavior fb) {
            flyBehavior = fb;
        }

        public void setQuackBehavior(QuackBehavior qb) {
            quackBehavior = qb;
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

    class FlyRocketPowered implements FlyBehavior {
        @Override
        public void fly() {
            System.out.println("로켓 추진으로 날아갑니다!");
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

    class ModelDuck extends Duck {
        public ModelDuck() {
            flyBehavior = new FlyNoWay();
            quackBehavior = new Quack();
        }

        @Override
        public void display() {
            System.out.println("저는 모형 오리입니다");
        }
    }
}