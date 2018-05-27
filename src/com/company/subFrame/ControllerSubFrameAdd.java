package com.company.subFrame;

import com.company.Cell;
import com.company.Model;

public class ControllerSubFrameAdd implements ControllerSub {
    private ViewSub viewSub;
    private Model model;

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
        model.add(new Cell("Added", viewSub.getText()));
        viewSub.close();
    }

    @Override
    public void handleCancleButtonClick() {
        viewSub.close();
    }
}
