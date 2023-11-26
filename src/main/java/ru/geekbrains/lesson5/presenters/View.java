package ru.geekbrains.lesson5.presenters;

import java.util.Collection;
import java.util.Date;

import ru.geekbrains.lesson5.models.Table;


public interface View {

    void showTables(Collection<Table> tables);

    void showReservationTableResult(int reservationNo);

    void showСhangeReservationTable(int reservationNumber, int newNumberTable);

    void setObserver(ViewObserver observer);

    void reservationTable(Date orderDate, int tableNumber, String nameClients);

    void changeReservationTable(int oldReservation, Date reservationDate, int tableNumber, String nameClients);

}
