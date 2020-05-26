package designmode.工厂模式.抽象工厂模式;

/**
 * @author: KongKongBaby
 * @create: 2020-05-26 10:17
 * @description:
 **/

public class SouthApple extends AbstractApple{
    @Override
    public void get() {
        System.out.println("采集南方苹果");
    }
}
