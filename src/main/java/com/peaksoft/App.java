package com.peaksoft;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        System.out.println(Dao.printUsers());
        System.out.println("  ");
        System.out.println(Dao.printUsers2());
        System.out.println("  ");
        System.out.println(Dao.printUsers3());
        System.out.println("  ");
        while (true){


        System.out.println(" ~~ id menen tabuu:~~~");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num ){
            case 1 -> Dao.idchoose(scanner.nextInt());
            default -> System.out.println("jok");

        }



    }
}
}
