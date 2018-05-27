package com.company.mainFrame;

import com.company.Model;

public interface ControllerMain {
    void setViewMain(ViewMain viewMain);

    void setModel(Model model);

    void handleNextButtonClick();

    void handlePrevButtonClick();

    void handleAddButtonClick();

    void handleDelButtonClick();

    void handleEditButtonClick();

    void showCurrentElement();
}
