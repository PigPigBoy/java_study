package java8.代码.四大函数型接口;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author: KongKongBaby
 * @create: 2020-05-15 10:22
 * @description: 四大函数型接口
 * Consumer:  消费型接口
 * Supplier:  供给型接口
 * Function:  函数型接口
 * Predicate: 断言型接口
 **/
public class TestLambda3 {

    //消费型接口
    public void happy(double money, Consumer<Double> consumer) {
        consumer.accept(money);
    }

    @Test
    public void test1() {
        happy(10000, money -> System.out.println("张三喜欢大保健,每次消费" + money + "元"));
    }

    //供给型接口
    public List<Integer> getNumberList(int num, Supplier<Integer> supplier) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(supplier.get());
        }
        return list;
    }

    @Test
    public void test2() {
        Random random = new Random();
        // 5个随机整数
        List<Integer> list = getNumberList(5, () -> random.nextInt(10));
        list.forEach(System.out::println);
    }

    //函数型接口
    public <T> T strHandler(String str, Function<String, T> function) {
        // 对字符串处理,返回对应结果
        return function.apply(str);
    }

    @Test
    public void test3() {
        // 返回处理后的字符串
        String s = strHandler("hello world！", str -> str.substring(2, 8).toUpperCase() + 666);
        System.out.println(s);

        // 返回字符串的长度
        Integer l = strHandler("hello world！", str -> str.length());
        System.out.println(l);
    }

    //断言型接口
    public <T> List<T> filter(List<T> t, Predicate<T> predicate) {
        // 对输入条件进行过滤返回
        List<T> list = new ArrayList<>();
        t.forEach(item -> {
            if (predicate.test(item))
                list.add(item);
        });
        return list;
    }

    @Test
    public void test4() {
        // 过滤 > 5 的数字
        List<Integer> list = filter(Arrays.asList(1, 3, 5, 7, 8, 2, 5), item -> item > 5);
        list.forEach(System.out::println);

        // 过滤长度>5 的字符串
        List<String> list1 = filter(Arrays.asList("Hello", "world", "atguigu", "Lambda", "www", "ok"), str -> str.length() > 3);
        list1.forEach(System.out::println);
    }
}