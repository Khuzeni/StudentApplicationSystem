package services;

import DAO.AccomodationApplicationDAO;
import domain.AccomodationApplication;

import java.util.List;

public class AccomodationApplicationService {
    private final AccomodationApplicationDAO dao = new AccomodationApplicationDAO();

    public boolean createAccomodationOption(AccomodationApplication accomodation) {
        return dao.insertAccomodationApplication(accomodation);
    }
    public AccomodationApplication getAccomodationById(String optionId) {
        return dao.getAccomodationById(optionId);
    }

    public List<AccomodationApplication> getAllAccomodations() {
        return dao.getAllAccomodationApplications();
    }
}
