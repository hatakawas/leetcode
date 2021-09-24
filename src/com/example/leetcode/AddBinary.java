package com.example.leetcode;

/**
 * https://leetcode.com/problems/add-binary/description/
 *
 * Created on May 11, 2018
 *
 * @author hatakawas
 */
public class AddBinary {

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String result = new AddBinary().addBinary(a, b);
        System.out.println(result);
    }

    private String addBinary(String a, String b) {
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (aIndex >= 0 || bIndex >= 0 || carry > 0) {
            int sum = carry;
            if (aIndex >= 0) sum += a.charAt(aIndex--) - '0';
            if (bIndex >= 0) sum += b.charAt(bIndex--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }
}
