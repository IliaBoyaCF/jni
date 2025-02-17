package com.github.IliyaBoyaCF;

import com.github.IliaBoyaCF.integral.ApproximateIntegral;
import com.github.IliaBoyaCF.integral.Initials;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class CalculationTests {
    @Test
    @DisplayName("Default calculation with Math::sin.")
    public void calcNormal() {
        double acceptableError = 0.0001;
        double expected = 0.0;

        Initials init = Initials.create(Math::sin, -Math.PI / 2, Math.PI / 2, 10000);

        double res = ApproximateIntegral.calculate(init);

        Assertions.assertTrue(Math.abs(expected - res) < acceptableError);
    }

}
