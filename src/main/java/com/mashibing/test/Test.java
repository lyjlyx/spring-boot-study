package com.mashibing.test;

/**
 * @author LYX
 * @description
 * @date 2022/7/2 11:41
 */
public class Test {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        new Service(){
            @Override
            public void method() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        }.method();

    }
    

}

interface Service{
    void method();
}

