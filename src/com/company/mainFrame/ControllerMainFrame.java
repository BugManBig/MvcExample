package com.company.mainFrame;

import com.company.Model;
import com.company.subFrame.*;

public class ControllerMainFrame implements ControllerMain {
    private ViewMain viewMain;
    private Model model;

    private int index = 0;

    @Override
    public void setViewMain(ViewMain viewMain) {
        this.viewMain = viewMain;
    }

    @Override
    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public void handleNextButtonClick() {
        if (index < model.getSize() - 1) {
            index++;
        }
        showCurrentElement();
    }

    @Override
    public void handlePrevButtonClick() {
        if (index > 0) {
            index--;
        }
        showCurrentElement();
    }

    @Override
    public void handleAddButtonClick() {
        ViewSub viewSub = new ViewSubFrame();

        ControllerSub controllerSub = new ControllerSubFrameAdd();
        controllerSub.setModel(model);
        controllerSub.setView(viewSub);

        viewSub.setController(controllerSub);
        viewSub.create();

        viewSub.setButtonText("Add");
    }

    @Override
    public void handleDelButtonClick() {
        model.remove(index);
        if (index == model.getSize()) {
            index--;
        }
        showCurrentElement();
    }

    @Override
    public void handleEditButtonClick() {
        ViewSub viewSub = new ViewSubFrame();

        ControllerSubFrameEdit controllerSub = new ControllerSubFrameEdit();
        controllerSub.setIndex(index);
        controllerSub.setModel(model);
        controllerSub.setView(viewSub);
        controllerSub.setControllerMain(this);

        viewSub.setController(controllerSub);
        viewSub.create();
        viewSub.setText(viewMain.getText());
        viewSub.setButtonText("Change");
    }

    @Override
    public void showCurrentElement() {
        viewMain.setText(model.get(index));
    }
}
