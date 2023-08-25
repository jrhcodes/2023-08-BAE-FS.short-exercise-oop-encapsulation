import com.techreturners.encapsulation.bankaccount.model.WeatherReporter;
import com.techreturners.encapsulation.bankaccount.model.WeatherType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class WeatherReporterTest {
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "             "})
    void testConstructorWithEmptyLocation(String location) {
        assertThrowsExactly(IllegalArgumentException.class, () -> new WeatherReporter(location, WeatherType.RAIN, 0));
    }

    @Test
    void testConstructorWithNullLocation() {
        assertThrowsExactly(IllegalArgumentException.class, () -> new WeatherReporter(null, WeatherType.RAIN, 0));
    }

    @ParameterizedTest
    @ValueSource(strings = {"London", "New York", "Paris", "Munich"})
    void testGetLocationReturnsInitialisedLocation(String location) {
        WeatherReporter weather = new WeatherReporter(location, WeatherType.RAIN, 0);
        assertEquals(location, weather.getLocation());
    }

    @ParameterizedTest
    @ValueSource(doubles = {-10000.23, -1, 0, 1, 22349908.0})
    void testGetTemperatureReturnsInitialisedLocation(double temp) {
        WeatherReporter weather = new WeatherReporter("Testopia", WeatherType.RAIN, temp);
        assertEquals(temp, weather.getTemperature());
    }

    @ParameterizedTest
    @ValueSource(strings = {"London", "New York", "Paris", "Munich"})
    void testIsLocationWhenFalse(String location) {
        WeatherReporter weather = new WeatherReporter("Testopia", WeatherType.RAIN, 0);
        assertFalse(weather.locationIs(location));
    }

    @ParameterizedTest
    @ValueSource(strings = {"London", "New York", "Paris", "Munich"})
    void testIsLocationWhenTrue(String location) {
        WeatherReporter weather = new WeatherReporter(location, WeatherType.RAIN, 0);
        assertTrue(weather.locationIs(location));
    }

    @Test
    void testIconForRAIN() {
        WeatherReporter weather = new WeatherReporter("Testopia", WeatherType.RAIN, 0);
        assertEquals("☔", weather.getWeatherIcon());
    }

    @Test
    void testIconForSNOW() {
        WeatherReporter weather = new WeatherReporter("Testopia", WeatherType.SNOW, 0);
        assertEquals("⛄", weather.getWeatherIcon());
    }

    @Test
    void testIconForCLOUDY() {
        WeatherReporter weather = new WeatherReporter("Testopia", WeatherType.CLOUDY, 0);
        assertEquals("☁", weather.getWeatherIcon());
    }

    @Test
    void testIconForSUNNY() {
        WeatherReporter weather = new WeatherReporter("Testopia", WeatherType.SUNNY, 0);
        assertEquals("\uD83C\uDF1E", weather.getWeatherIcon());
    }

    @Test
    void testIconForSUNNY_INTERVALS() {
        WeatherReporter weather = new WeatherReporter("Testopia", WeatherType.SUNNY_INTERVALS, 0);
        assertEquals("⛅", weather.getWeatherIcon());
    }
    
    @Test void testDescribeTemperatureHot()
    {
        WeatherReporter weather = new WeatherReporter("Testopia", WeatherType.SNOW, 50);
        assertEquals("It's too hot \uD83E\uDD75!", weather.describeTemperature());
    }

}
