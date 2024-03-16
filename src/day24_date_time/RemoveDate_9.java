package day24_date_time;

import java.time.LocalDate;
import java.util.ArrayList;

public class RemoveDate_9 {
    public static void main(String[] args) {

        ArrayList<LocalDate> local = new ArrayList<>();

        local.add(LocalDate.of(1982, 10, 21));
        local.add(LocalDate.of(2012, 10, 21));
        local.add(LocalDate.of(2012, 10, 21));
        local.add(LocalDate.of(2017, 10, 21));

        local.removeIf(p->p.isBefore(LocalDate.of(2016, 8, 15)));

        System.out.println(local);
    }
}
/*
create an Arraylist of LocalDate,
and write a program that can remove all the dates before August-15-2016
 */