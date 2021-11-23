package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(12, 36);
        calc.println.accept(a);
        int b = calc.minus.apply(10, 4);
        calc.println.accept(b);
        int c = calc.devide.apply(10, 5);
        calc.println.accept(c);
        int d = calc.multiply.apply(23, 2);
        calc.println.accept(d);
        int e = calc.abs.apply(-150);
        calc.println.accept(e);
        int f = calc.devide2.apply(10, 0);
        calc.println.accept(f);
        int g = calc.pow.apply(10);
        calc.println.accept(g);

        if (calc.isPositive.test(10)){
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }
}
