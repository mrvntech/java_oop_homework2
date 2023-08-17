package homework4.controller;

import homework4.model.Family;
import homework4.model.Quarter;
import homework4.view.FamilyView;
import homework4.view.QuarterView;

public class QuarterController {
    public static void run() {
        Quarter quarter = new Quarter();
        int quarterFamiliesNumber = QuarterView.getQuarterFamiliesNumber();
        for (int i = 0; i < quarterFamiliesNumber; i++) {
            Family family = FamilyView.createFamily();
            quarter.addFamily(family);
        }
    }
}
