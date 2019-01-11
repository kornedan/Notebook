package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Note {

    private ArrayList<String> tag = new ArrayList();
    private String content;
    private LocalDate data;

    public Note(ArrayList<String> tag, String content) {
        this.tag = tag;
        this.content = content;
        data = LocalDate.now();
    }

    public boolean allHunting(String keyWord) {
        boolean check = false;
        for (String word : tag) {
            if (word.contains(keyWord))
                check = true;
        }
        return content.contains(keyWord) || check;
    }

    @Override
    public String toString() {
        return "Note{" +
                "tag=" + tag +
                ", content='" + content + '\'' +
                ", data=" + data +
                '}';
    }
}
