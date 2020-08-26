package nextstep.mission;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LineTest {

    @Test
    void constructor() {
        assertThat(new Line(Arrays.asList(true, false, true, false))).isEqualTo(new Line(Arrays.asList(true, false, true, false)));
    }

    @Test
    void constructorThrow() {
        assertThatThrownBy(() -> new Line(Arrays.asList(true, true, true, false)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void createPoints() {
        List<Boolean> points = Line.createPoints(4);

        assertThat(points).hasSize(4);
        assertThat(points.get(0)).isFalse();
    }
}