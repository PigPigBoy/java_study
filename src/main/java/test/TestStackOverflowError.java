package test;

import org.junit.Test;

/**
 * @author: KongKongBaby
 * @create: 2020-05-17 13:51
 * @description: 测试栈溢出
 *          java.lang.StackOverflowError
 **/

public class TestStackOverflowError {
    @Test
    public void test1(){
        test1();
    }
}