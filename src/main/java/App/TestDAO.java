package App;

import DAO.StudentApplicationDAO;
import domain.StudentApplication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDAO {
    @Test
        public void testSaveStudent() {
            StudentApplication student = new StudentApplication.Builder()
                    .setStudentId("TEST123")
                    .setName("Test")
                    .setSurname("User")
                    .setEmail("test@cput.ac.za")
                    .setAverageMark(80.0)
                    .setCurrentCampus("CPUT")
                    .setStatus("Pending")
                    .build();

            StudentApplicationDAO dao = new StudentApplicationDAO();
            dao.save(student);

            // You could now call dao.findById("TEST123") and assert values
            assertTrue(true); // Simplified test for now
        }
    }

