package designmode.工厂模式.抽象工厂模式;

/**
 * @author: KongKongBaby
 * @create: 2020-05-26 10:18
 * @description:
 **/

public class NorthBanana extends AbstractBanana{
    @Override
    public void get() {
        System.out.println("采集北方香蕉");
    }
}
