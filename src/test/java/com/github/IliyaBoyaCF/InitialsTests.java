package com.github.IliyaBoyaCF;

import com.github.IliaBoyaCF.integral.Initials;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.function.Function;

public class InitialsTests {

    private static final Function<Double, Double> E = (x) -> x;

    @Test
    @DisplayName("Left boarder is greater than right")
    public void leftBoarderGreater() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Initials.create(E, 10, -10, 10));
    }

    @Test
    @DisplayName("Nodes count is negative.")
    public void negativeNodesCount() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Initials.create(E, -10, 10, -10));
    }

    @Test
    @DisplayName("Left and right boarder are the same.")
    public void equalBoarders() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Initials.create(E, 10, 10, 10));
    }

}
