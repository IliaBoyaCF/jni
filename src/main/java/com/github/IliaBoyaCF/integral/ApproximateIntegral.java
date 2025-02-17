package com.github.IliaBoyaCF.integral;

import com.github.IliaBoyaCF.integral.methods.*;

import java.util.function.Function;

public class ApproximateIntegral {

    public static Method DEFAULT_METHOD = StandardMethods.SIMPSONS_RULE.getMethod();

    private Method method;

    public enum StandardMethods {

        LEFT_TRIANGLES(LeftRectangles.getInstance()),
        RIGHT_TRIANGLES(RightRectangles.getInstance()),
        AVERAGE_TRIANGLES(AverageRectangles.getInstance()),
        TRAPEZOID(Trapezoid.getInstance()),
        SIMPSONS_RULE(SimpsonsRule.getInstance()),
        ;

        private final Method method;

        StandardMethods(Method method) {
            this.method = method;
        }

        public Method getMethod() {
            return method;
        }

    }

    public static abstract class Method {
        public static Method getInstance() {
            return null;
        }
        public abstract double calculate(Function<Double, Double> f, double leftBorder, double rightBorder, int N);
    }

    public static double calculate(Method method, Initials init) {
        return method.calculate(init.f(), init.leftBorder(), init.rightBorder(), init.nodesCount());
    }

    public static double calculate(StandardMethods method, Initials init) {
        return method.getMethod().calculate(init.f(), init.leftBorder(), init.rightBorder(), init.nodesCount());
    }

    public static double calculate(Initials init) {
        return calculate(DEFAULT_METHOD, init);
    }

}
