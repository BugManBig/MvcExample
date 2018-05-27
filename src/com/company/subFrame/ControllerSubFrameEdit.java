package com.company.subFrame;

import com.company.Model;
import com.company.mainFrame.ControllerMain;

public class ControllerSubFrameEdit implements ControllerSub {
    private ViewSub viewSub;
    private Model model;

    private int index;

    private ControllerMain controllerMain;

    public void setControllerMain(ControllerMain controllerMain) {
        this.controllerMain = controllerMain;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public void setView(ViewSub viewSub) {
        this.viewSub = viewSub;
    }

    @Override
    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public void handleOkButtonClick() {
        model.set(index, viewSub.getText());
        viewSub.close();
        controllerMain.showCurrentElement();
    }

    @Override
    public void handleCancleButtonClick() {
        viewSub.close();
    }
}
