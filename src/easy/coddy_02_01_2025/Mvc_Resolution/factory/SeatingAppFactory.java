package easy.coddy_02_01_2025.Mvc_Resolution.factory;

import easy.coddy_02_01_2025.Mvc_Resolution.controller.SeatingController;
import easy.coddy_02_01_2025.Mvc_Resolution.model.SeatingModel;
import easy.coddy_02_01_2025.Mvc_Resolution.view.SeatingView;
import easy.coddy_02_01_2025.Mvc_Resolution.service.SeatingArrangementService;
import easy.coddy_02_01_2025.Mvc_Resolution.service.SeatingArrangementServiceImpl;

public class SeatingAppFactory {
    public static SeatingController createController(int[] arrangement, int[] changes) {
        SeatingModel model = new SeatingModel(arrangement, changes);
        SeatingView view = new SeatingView();
        SeatingArrangementService service = new SeatingArrangementServiceImpl();
        return new SeatingController(model, view, service);
    }
}
