package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> tags1 = new ArrayList<>();
        tags1.add("notatka");
        tags1.add("pierwsza");
        String content1 = "pierwsza notatka do zapisau";
        Note note1 = new Note(tags1,content1);

        ArrayList<String> tags2 = new ArrayList<>();
        tags2.add("notatka");
        tags2.add("druga");
        String content2 = "druga notatka do zapisau";
        Note note2 = new Note(tags2,content2);


        ArrayList<String> tags3 = new ArrayList<>();
        tags3.add("notatka");
        tags3.add("trzecia");
        String content3 = "trzecia notatka do zapisau";
        Note note3 = new Note(tags3,content3);


        Notebook notebook1 = new Notebook(note1);
        Notebook notebook2 = new Notebook(note2);
        Notebook notebook3 = new Notebook(note3);

        ArrayList<Notebook> notebooks = new ArrayList<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);

        System.out.println("Liczba notatek " + Notebook.getCounter());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz nr notatki do wyświetlenia");
        int numberOfNote = scanner.nextInt();

        for (Notebook notebook: notebooks) {
            if(notebook.getId() == numberOfNote){
                System.out.println(notebook);
            }
        }
        System.out.println("Podaj słowo-klucz");
        scanner = new Scanner(System.in);
        String keyWord = scanner.nextLine();

        for (Notebook notebook: notebooks) {
            if(notebook.getNote().allHunting(keyWord)){
                System.out.println(notebook);
            }
        }

    }
}
