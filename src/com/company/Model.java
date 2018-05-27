package com.company;

import java.util.ArrayList;

public class Model {
    private ArrayList<Cell> cells = new ArrayList<>();

    public void fillSampleData() {
        addByData("First", "Pervaya");
        addByData("Second", "Vtoraya");
        addByData("Third", "Tretya");
    }

    private void addByData(String title, String text) {
        add(new Cell(title, text));
    }

    public void add(Cell cell) {
        cells.add(cell);
    }

    public Cell get(int id) {
        return cells.get(id);
    }

    public int getSize() {
        return cells.size();
    }

    public void remove(int id) {
        cells.remove(id);
    }

    public void set(int id, String text) {
        cells.set(id, new Cell(cells.get(id).title, text));
    }
}
