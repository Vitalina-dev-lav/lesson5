package ru.geekbrains.lesson5.models;

import java.util.Date;

public class Reservation {
    private static int counter = 1000;
    private final int id;
    {
        id = ++counter;
    }

    public Reservation(Table table, Date date, String nameClients) {
    }

    public int getId() {
        return id;
    }

    public void setTable(Table table) {
    }

}
