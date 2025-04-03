package easy.coddy_02_01_2025.Mvc_Resolution;

import easy.coddy_02_01_2025.Mvc_Resolution.controller.SeatingController;
import easy.coddy_02_01_2025.Mvc_Resolution.factory.SeatingAppFactory;
import easy.coddy_02_01_2025.Mvc_Resolution.utils.SeatingDataProvider;

public class SeatingApplication {
    public void run() {
        int[][][] testCases = SeatingDataProvider.getTestCases();

        for (int[][] testCase : testCases) {
            SeatingController controller = SeatingAppFactory.createController(
                    testCase[0], testCase[1]
            );
            controller.processSeatingArrangement();
            System.out.println("------");
        }
    }
}
