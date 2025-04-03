package easy.coddy_02_01_2025.Mvc_Resolution.controller;

import easy.coddy_02_01_2025.Mvc_Resolution.model.SeatingModel;
import easy.coddy_02_01_2025.Mvc_Resolution.service.SeatingArrangementService;
import easy.coddy_02_01_2025.Mvc_Resolution.view.SeatingView;

public class SeatingController {
    private final SeatingModel model;
    private final SeatingView view;
    private final SeatingArrangementService service;

    public SeatingController(SeatingModel model, SeatingView view, SeatingArrangementService service) {
        this.model = model;
        this.view = view;
        this.service = service;
    }

    public void processSeatingArrangement() {
        int[] result = service.rearrangeSeating(model.getSeatingArrangement(), model.getSeatingChanges());
        model.setResult(result);
        view.displayResult(result);
    }
}
