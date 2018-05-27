package com.company.mainFrame;

import com.company.Cell;

public interface ViewMain {
    void setController(ControllerMain controllerMain);

    void setText(Cell cell);

    String getTitle();

    String getText();

    void create();
}
