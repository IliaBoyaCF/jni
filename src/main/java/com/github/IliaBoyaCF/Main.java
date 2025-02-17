package com.github.IliaBoyaCF;

import com.github.IliaBoyaCF.integral.ApproximateIntegral;
import com.github.IliaBoyaCF.integral.Initials;

public class Main {

    public static void main(String[] args) {
        System.out.println(ApproximateIntegral.calculate(ApproximateIntegral.StandardMethods.SIMPSONS_RULE, new Initials(Math::log, 1, 10, 100)));
    }
}
