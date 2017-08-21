package com.endava.grads_framework;

public class CheckSum {
    public String checkSum(int a, int b, int result) {
        if ((a + b) == result) {
            return "SUCCESS!";
        } else {
            return "FAIL!";
        }
    }
}
