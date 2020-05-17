package leecode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author: KongKongBaby
 * @create: 2020-05-16 18:04
 * @description: Description:
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR" Write the code that will take a string
 * and make this conversion given a number of rows:
 * string convert(string text, int nRows); convert("PAYPALISHIRING", 3) 
 * should return "PAHNAPLSIIGYIR"
 **/

public class ZigZag {

    @Test
    public void test1() {
        System.out.println(convert("helloWorld!", 4));
    }

    public String convert(String text, int nRows) {
        if (nRows < 1)
            return null;
        if (null == text || "".equals(text))
            return text;
        if (text.length() <= nRows || nRows == 1)
            return text;
        char[] chars = text.toCharArray();
        int len = chars.length;
        StringBuilder[] sb = new StringBuilder[nRows];
//        Arrays.fill(sb, new StringBuilder()); 结果为啥不对？
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }
        int charIndex = 0;
        while (charIndex < len) {
            for (int i = 0; i < nRows && charIndex < len; i++) {
                sb[i].append(chars[charIndex++]);
            }
            for (int i = nRows - 2; i > 0 && charIndex < len; i--) {
                sb[i].append(chars[charIndex++]);
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < sb.length; i++) {
            res.append(sb[i]);
        }
        return res.toString();
    }
}
