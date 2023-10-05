package HW_2;

import Code.Home_work.HW_2.Car;
import Code.Home_work.HW_2.Motorcycle;
import Code.Home_work.HW_2.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    public void setUp() {
        car = new Car("Ford", "Focus", 2015);
        motorcycle = new Motorcycle("Suzuki", "SV650", 2020);
    }

    // Проверка принадлежности экземпляра car к родительскому классу Vehicle
    @Test
    void CarIsVehicle () {
        assertTrue( car instanceof Vehicle);
    }
    // Проверка количества колес у экземпляра car
    @Test
    void CarNumWheels () {
        assertEquals( 4, car.getNumWheels());
    }
    // Проверка количества колес у экземпляра motorcycle
    @Test
    void MotorcycleNumWheels () {
        assertEquals( 2, motorcycle.getNumWheels());
    }
    // Проверка скорости в режиме тест драйва у экземпляра car
    @Test
    void CarTestDriveSpeed () {
        car.testDrive();
        assertEquals( 60, car.getSpeed());
    }
    // Проверка скорости в режиме тест драйва у экземпляра motorcycle
    @Test
    void MotorcycleTestDriveSpeed () {
        motorcycle.testDrive();
        assertEquals( 75, motorcycle.getSpeed());
    }
    // Проверка скорости в режиме парковки у экземпляра car
    @Test
    void CarParkSpeed () {
        car.testDrive();
        car.park();
        assertEquals( 0, car.getSpeed());
    }
    // Проверка скорости в режиме парковки у экземпляра motorcycle
    @Test
    void MotorcycleParkSpeed () {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals( 0, motorcycle.getSpeed());
    }
}