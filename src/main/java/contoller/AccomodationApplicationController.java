package contoller;

import domain.AccomodationApplication;
import services.AccomodationApplicationService;

import java.util.List;

public class AccomodationApplicationController {
    private final AccomodationApplicationService service = new AccomodationApplicationService();

    public boolean addAccomodationOption(AccomodationApplication option) {
        return service.createAccomodationOption(option);
    }

    public AccomodationApplication getOptionById(String optionId) {
        return service.getAccomodationById(optionId);
    }

    public List<AccomodationApplication> getAllOptions() {
        return service.getAllAccomodations();
    }
}
