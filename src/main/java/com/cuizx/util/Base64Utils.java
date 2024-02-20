package com.cuizx.util;

import java.util.Base64;

public class Base64Utils {

    public static String encode(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static byte[] decode(String str) {
        return Base64.getDecoder().decode(str);
    }

    public static void main(String[] args) {
        String str = "Hello, world!";
        byte[] bytes = str.getBytes();

        String encoded = encode(bytes);
        System.out.println("原始字符串：" + str);
        System.out.println("Base64编码：" + encoded);

        byte[] decoded = decode(encoded);
        String decodedStr = new String(decoded);
        System.out.println("Base64解码：" + decodedStr);

        String encodedStr = "aHR0cHM6Ly9saWIuaHN1LmxpZmU=";
        byte[] decode = decode(encodedStr);

        String oriStr = new String(decode);
        System.out.println(oriStr);
    }
}