package java8.代码.方法引用;

import org.junit.Test;

import java.io.PrintStream;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author: KongKongBaby
 * @create: 2020-05-15 12:17
 * @description: 方法引用
 * 在lambda中内容有 方法已经实现了，可以使用方法引用
 * 可以理解成： lambda另一种表现形式
 * 格式： 对象::实例方法名
 *         类::静态方法名
 *         类::实例方法名
 **/

public class TestMethodRef {

    @Test
    public void test1() {
        // 注意： 需要实现的接口中的参数方法列表与返回值类型保持一致
        Consumer<String> con1 = System.out::println;
        con1.accept("hello world!");
    }

    @Test
    public void test2() {
        Supplier<String> supplier = () -> "hello world!";
        System.out.println(supplier.get());
    }
}
