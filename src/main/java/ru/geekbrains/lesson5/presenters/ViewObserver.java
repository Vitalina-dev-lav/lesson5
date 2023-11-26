package ru.geekbrains.lesson5.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String nameClients);

    void onUpdateReservetionTable(int oldReservation, Date reservationDate, int tableNumber, String nameClients);
}
