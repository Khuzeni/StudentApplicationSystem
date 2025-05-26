package contoller;

import domain.ApplicationStatus;
import services.ApplicationStatusServices;

import java.util.List;
public class ApplicationStatusController {
    private final ApplicationStatusServices service = new ApplicationStatusServices();

    public boolean updateStatus(ApplicationStatus status) {
        return service.updateStatus(status);
    }

    public ApplicationStatus getStatusByStudentId(String studentId) {
        return service.getStatusByStudentId(studentId);
    }

    public List<ApplicationStatus> getAllStatuses() {
        return service.getAllStatuses();
    }
}
