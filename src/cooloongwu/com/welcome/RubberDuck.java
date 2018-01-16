package cooloongwu.com.welcome;

/**
 * 使用 继承 的弊端：
 * <p>
 * 因为新加入了一个橡皮鸭，橡皮鸭是吱吱叫的，外观也需要重新实现，而且橡皮鸭不会飞。
 * <p>
 * 所以如果用的是继承，那么就需要将这些方法都覆盖掉！
 * <p>
 * 而且，再往远里想：如果以后还要加入木头制的诱饵鸭，那么诱饵鸭是不会叫的也不会飞，是不是又要全部覆盖！
 * <p>
 * 所以只要新加了鸭子种类，利用 继承 的方式就需要不断的去覆盖各种方法！
 * <p>
 * 使用 接口 的弊端：
 * <p>
 * 例如把 fly() 从超类中取出来，放到一个Flyable接口中。然后需要飞的鸭子类就实现改接口如何？
 * <p>
 * ！！也是一个蠢主意！！
 * <p>
 * 假如有几百个的鸭子子类都需要稍微修改下飞行的行为，那岂不是每个类都需要修改下，更是累死。
 */


/**
 * 使用 接口 的弊端：
 *
 * 例如把 fly() 从超类中取出来，放到一个Flyable接口中。然后需要飞的鸭子类就实现改接口如何？
 *
 * ！！也是一个蠢主意！！
 *
 * 假如有几百个的鸭子子类都需要稍微修改下飞行的行为，那岂不是每个类都需要修改下，更是累死。
 */

/**
 * 总结：
 *
 * 并不是所有的鸭子类都有飞行和呱呱叫的行为，所以继承并不是适当的解决方式。
 * 虽然接口可以解决一部分问题（若不覆盖fly()则会出现会飞的木头制的橡皮鸭，不合常理），但是代码无法复用。
 *
 *
 * 解决之道：采用良好的OO软件设计原则
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
    }
//
//    @Override
//    void quack() {
//        show("RubberDuck-quack");
//    }
//
//    @Override
//    void display() {
//        show("RubberDuck-display");
//    }

    /**
     * 橡皮鸭子是不会飞的，所以这里需要重写fly方法
     */
//    @Override
//    void fly() {
//        show("RubberDuck-no-fly");
//    }
}
