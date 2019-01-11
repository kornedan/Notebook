package com.company;

public class Notebook {

    private static int counter = 0;
    private Note note;
    private int id = 0;

    public Notebook(Note note) {
        this.note = note;
        this.id = ++this.counter;
    }

    public Note getNote() {
        return note;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "note=" + note +
                ", id=" + id +
                '}';
    }
}
