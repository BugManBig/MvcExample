package com.company.subFrame;

public interface ViewSub {
    void setController(ControllerSub controllerSub);

    void setText(String text);

    String getText();

    void setButtonText(String text);

    void create();

    void close();
}
