package com.company.mainFrame;

import com.company.Cell;

import javax.swing.*;

public class ViewMainFrame implements ViewMain {
    private ControllerMain controllerMain;

    private JTextField title;
    private JTextField text;

    @Override
    public void create() {
        JFrame frame = new JFrame("Main frame");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);

        title = new JTextField();
        title.setBounds(10, 10, 200, 30);
        frame.add(title);

        text = new JTextField();
        text.setBounds(10, 50, 200, 30);
        frame.add(text);

        JButton nextButton = new JButton("Next");
        nextButton.setBounds(150, 100, 100, 30);
        nextButton.addActionListener(e -> controllerMain.handleNextButtonClick());
        frame.add(nextButton);

        JButton prevButton = new JButton("Prev");
        prevButton.setBounds(10, 100, 100, 30);
        prevButton.addActionListener(e -> controllerMain.handlePrevButtonClick());
        frame.add(prevButton);

        JButton addButton = new JButton("Add");
        addButton.setBounds(10, 150, 100, 30);
        addButton.addActionListener(e -> controllerMain.handleAddButtonClick());
        frame.add(addButton);

        JButton delButton = new JButton("Del");
        delButton.setBounds(150, 150, 100, 30);
        delButton.addActionListener(e -> controllerMain.handleDelButtonClick());
        frame.add(delButton);

        JButton editButton = new JButton("Edit");
        editButton.setBounds(10, 200, 100, 30);
        editButton.addActionListener(e -> controllerMain.handleEditButtonClick());
        frame.add(editButton);

        frame.repaint();
        frame.revalidate();

        frame.setLocationRelativeTo(null);
    }

    @Override
    public void setController(ControllerMain controllerMain) {
        this.controllerMain = controllerMain;
    }

    @Override
    public void setText(Cell cell) {
        title.setText(cell.title);
        text.setText(cell.text);
    }

    @Override
    public String getTitle() {
        return title.getText();
    }

    @Override
    public String getText() {
        return text.getText();
    }
}
