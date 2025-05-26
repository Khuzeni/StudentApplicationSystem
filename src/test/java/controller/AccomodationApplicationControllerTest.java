package controller;

import contoller.AccomodationApplicationController;
import controller.ApplicationStatusControllerTest;
import domain.AccomodationApplication;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class AccomodationApplicationControllerTest {
    private AccomodationApplicationController controller;

    @BeforeEach
    public void setup() {
        controller = new AccomodationApplicationController();
    }

    @Test
    public void testAddAccomodationOption() {
        AccomodationApplication option = new AccomodationApplication.Builder()
                .setOptionId("OPT001")
                .setName("Rise Student Living")
                .setLocation("Cape Town")
                .setMonthlyCost(7200.00)
                .setAvailability(true)
                .setCapacity(300)
                .build();

        boolean result = controller.addAccomodationOption(option);
        assertTrue(result, "Accommodation option should be added.");
    }

    @Test
    public void testGetOptionById() {
        AccomodationApplication option = controller.getOptionById("OPT001");
        assertNotNull(option);
        assertEquals("OPT001", option.getOptionId());
    }

    @Test
    public void testGetAllOptions() {
        List<AccomodationApplication> options = controller.getAllOptions();
        assertNotNull(options);
        assertTrue(options.size() > 0);
    }
}
