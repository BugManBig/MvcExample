package com.company.subFrame;

import javax.swing.*;

public class ViewSubFrame implements ViewSub {
    private ControllerSub controllerSub;

    private JTextField textField;
    private JButton okButton;

    private JFrame frame;

    @Override
    public void create() {
        frame = new JFrame("Sub frame");
        frame.setSize(300, 150);
        frame.setVisible(true);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(10, 10, 200, 30);
        frame.add(textField);

        okButton = new JButton();
        okButton.setBounds(10, 50, 100, 30);
        okButton.addActionListener(e -> controllerSub.handleOkButtonClick());
        frame.add(okButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(150, 50, 100, 30);
        cancelButton.addActionListener(e -> controllerSub.handleCancleButtonClick());
        frame.add(cancelButton);
    }

    @Override
    public void close() {
        frame.dispose();
    }

    @Override
    public void setController(ControllerSub controllerSub) {
        this.controllerSub = controllerSub;
    }

    @Override
    public void setText(String text) {
        textField.setText(text);
    }

    @Override
    public String getText() {
        return textField.getText();
    }

    @Override
    public void setButtonText(String text) {
        okButton.setText(text);
    }
}
