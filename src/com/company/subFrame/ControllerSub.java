package com.company.subFrame;

import com.company.Model;

public interface ControllerSub {
    void setView(ViewSub viewSub);

    void setModel(Model model);

    void handleOkButtonClick();

    void handleCancleButtonClick();
}
