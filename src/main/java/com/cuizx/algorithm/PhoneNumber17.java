package com.cuizx.algorithm;

import java.util.Base64;

public class PhoneNumber17 {


    public static void main(String[] args) {

        byte[] decode = Base64.getEncoder().encode("aHR0cHM6Ly9saWIuaHN1LmxpZmU=".getBytes());

        System.out.println(String.valueOf(decode));
    }

}
