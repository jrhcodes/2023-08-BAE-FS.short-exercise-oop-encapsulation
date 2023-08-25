import com.techreturners.encapsulation.bankaccount.model.WeatherReporter;
import com.techreturners.encapsulation.bankaccount.model.WeatherType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class WeatherReporeterTester {
    @ParameterizedTest
    @ValueSource(strings = { "", " ", "             "})
    void testConstructorWithEmptyLocation(String location) {
        assertThrowsExactly(IllegalArgumentException.class, () -> new WeatherReporter(location, WeatherType.RAIN, 0));
    }

    @Test void testConstructorWithNullLocation() {
        assertThrowsExactly(IllegalArgumentException.class, () -> new WeatherReporter(null, WeatherType.RAIN, 0));
    }

}
