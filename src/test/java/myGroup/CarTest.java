package myGroup;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class CarTest {

    Car myCar;

    @BeforeAll
    public void setup(){
        System.out.println("Should print before all tests");
    }
    @BeforeEach
    public void printBeforeEveryTest(){
        System.out.println("Should print before each test");
        myCar = new Car("Toyota", "Camry", 2022);
    }

    @DisplayName("Should create a brand new 2022 Toyota Camry")
    @Test
    public void shouldCreateToyotaCamry2002(){
        assertEquals("Toyota", myCar.getMake());
        assertEquals("Camry", myCar.getModel());
        assertEquals(2022, myCar.getYear());
        assertEquals(0, myCar.getMiles());
        assertFalse(myCar.getIsStarted());
    }

    @DisplayName("Should test the drive method for the number of miles")
    @Test
    public void shouldDrive1000miles(){
        myCar.drive(1000);
        assertNotEquals(0, myCar.getMiles());
        assertEquals(1000, myCar.getMiles());
    }

    @DisplayName("Should test the start method")
    @Test
    public void shouldStartTheCar(){
        myCar.start();
        assertTrue(myCar.getIsStarted());
    }

    @AfterEach
    public void tearDown(){
        System.out.println("Should print after each test");
    }

    @AfterAll
    public void tearDownAll(){
        System.out.println("Should print after all tests");
    }
}