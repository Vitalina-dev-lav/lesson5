package ru.geekbrains.lesson5.views;

import ru.geekbrains.lesson5.models.TableModel;
import ru.geekbrains.lesson5.presenters.BookingPresenter;
import ru.geekbrains.lesson5.presenters.Model;
import ru.geekbrains.lesson5.presenters.View;
import ru.geekbrains.lesson5.views.BookingView;

import java.util.Date;



    public class Program {

        public static void main(String[] args) {
            View view = (View) new BookingView();
            Model model = new TableModel();
            BookingPresenter presenter = new BookingPresenter(model, view);
    
            presenter.updateUIShowTables();
    
            view.reservationTable(new Date(), 2, "Иван Иванов");
    
            view.changeReservationTable(1001, new Date(), 3, "Иван Иванов");
    
        }
    
    }
