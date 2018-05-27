package com.company;

import com.company.mainFrame.*;

public class Application {
    public void run() {
        Model model = new Model();
        model.fillSampleData();

        ViewMain viewMain = new ViewMainFrame();
        viewMain.create();

        ControllerMain controllerMainFrame = new ControllerMainFrame();
        controllerMainFrame.setViewMain(viewMain);
        controllerMainFrame.setModel(model);
        controllerMainFrame.showCurrentElement();

        viewMain.setController(controllerMainFrame);
    }
}
