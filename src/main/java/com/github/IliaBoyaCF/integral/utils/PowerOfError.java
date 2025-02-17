package com.github.IliaBoyaCF.integral.utils;

import java.util.List;

public class PowerOfError {
//    public static double calculatePowerOfError(ApproximateIntegral.Method method, Function<Double, Double> f,
//                                               double leftBorder, double rightBorder, int N) {
//        double I_h = ApproximateIntegral.calculate(method, f, leftBorder, rightBorder, N);
//        double I_h_div2 = ApproximateIntegral.calculate(method, f, leftBorder, rightBorder, 2 * N);
//        double I_h_div4 = ApproximateIntegral.calculate(method, f, leftBorder, rightBorder, 4 * N);
//        return log2(Math.abs(I_h - I_h_div2) / Math.abs(I_h_div2 - I_h_div4));
//    }

    private static double log2(double n) {
        return Math.log(n) / Math.log(2);
    }

    public static void main(String[] args) {
        List<Integer> test = List.of(2, 4, 6, 8, 1024, 2048, 2100);
        for (int t : test) {
            System.out.println(log2(t));
        }
    }
}
