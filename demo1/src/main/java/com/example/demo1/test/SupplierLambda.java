package com.example.demo1.test;

import java.util.function.Supplier;

public class SupplierLambda {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 52, 333, 23};
        getMax(()->{
            return null;
        });
    }

    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
