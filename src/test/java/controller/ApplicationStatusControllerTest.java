package controller;

import contoller.ApplicationStatusController;
import controller.ApplicationStatusControllerTest;
import domain.ApplicationStatus;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationStatusControllerTest {
    private ApplicationStatusController controller;

    @BeforeEach
    public void setup() {
        controller = new ApplicationStatusController();
    }

    @Test
    public void testUpdateStatus() {
        ApplicationStatus status = new ApplicationStatus.Builder()
                .setStatusId("STAT001")
                .setStudentId("TEST001")
                .setStatus("Approved")
                .setDecisionDate(LocalDate.now().toString())
                .setComments("Congratulations! You have been approved.")
                .build();

        boolean result = controller.updateStatus(status);
        assertTrue(result);
    }

    @Test
    public void testGetStatusByStudentId() {
        ApplicationStatus status = controller.getStatusByStudentId("TEST001");
        assertNotNull(status);
        assertEquals("TEST001", status.getStudentId());
    }

    @Test
    public void testGetAllStatuses() {
        List<ApplicationStatus> statuses = controller.getAllStatuses();
        assertNotNull(statuses);
        assertTrue(statuses.size() > 0);
    }
}
