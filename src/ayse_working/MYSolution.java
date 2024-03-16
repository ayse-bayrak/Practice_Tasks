package ayse_working;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class MYSolution {
    public static void main(String[] args) {
        ArrayList<LocalDate> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                LocalDate.of(2020, 5, 30)
        ));

        list.removeIf(p -> p.isBefore(LocalDate.of(2016, 8, 15)));

        System.out.println(list);
    }
}

/*
●    Write a Java program to compare two numbers,
(Outputs: number1 is greater, number2 is greater, numbers are equal)
 */