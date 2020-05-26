package designmode.工厂模式.抽象工厂模式;

/**
 * @author: KongKongBaby
 * @create: 2020-05-26 10:16
 * @description:
 **/

public class NorthApple extends AbstractApple{
    @Override
    public void get() {
        System.out.println("采集北方苹果");
    }
}
