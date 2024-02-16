package com.weian.leetcode.question;

/**
 * 整数反转 1233
 *
 * @author Weian
 * @date 2024/2/16
 */
public class Solution {


    /**
     *
     */
    public static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            if (Integer.MAX_VALUE / 10 < res || Integer.MIN_VALUE / 10 > res) {
                return 0;
            }

            int tem = x % 10;
            res = res * 10 + tem;
            x = x / 10;
        }
        return res;
    }


    /**
     * 字符串转换整数
     *
     * @param s
     * @return
     */
    public static int myAtoi(String s) {

        boolean flag = false;
        boolean definition = true;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == ' ' && definition) {
                continue;
            }

            if (x == '-' && definition) {
                flag = true;
                definition = false;
                continue;
            }
            if (x == '+' && definition) {
                definition = false;
                continue;
            }
            if (x < 48 || x > 57) {
                break;
            }
            int num = Integer.parseInt(String.valueOf(x));
            if (Integer.MAX_VALUE / 10 < res) {
                return flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            if (res != 0 && Integer.MAX_VALUE / res == 10 && num > 7) {
                return flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res = res * 10 + num;
            definition = false;


        }
        return flag ? res * -1 : res;
    }


    /**
     * 回文数
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int i = 0;
        while (temp != 0) {
            // 取回文数最后一位
            int res = temp % 10;
            // 去掉回文数最后一位
            temp = temp / 10;
            // 反转   收摊 打烊！！！！
           i = i * 10 + res;
        }
        System.out.println(i);
        return i == x;
    }

    public static boolean isMatch(String s, String p) {
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(123));
    }


}
