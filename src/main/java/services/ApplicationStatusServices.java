package services;

import DAO.ApplicationStatusDAO;
import domain.ApplicationStatus;

import java.util.List;

public class ApplicationStatusServices {
    private final ApplicationStatusDAO dao = new ApplicationStatusDAO();

    public boolean updateStatus(ApplicationStatus status) {
        return dao.insertApplicationStatus(status);
    }
    public ApplicationStatus getStatusByStudentId(String studentId) {
        return dao.getStatusByStudentId(studentId);
    }

    public List<ApplicationStatus> getAllStatuses() {
        return dao.getAllStatuses();
    }
}
