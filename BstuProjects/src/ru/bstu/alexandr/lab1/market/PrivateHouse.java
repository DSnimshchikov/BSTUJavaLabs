package ru.bstu.alexandr.lab1.market;

import java.util.Scanner;

/**
 * Created by Александр on 22.09.2016.
 */
public class PrivateHouse extends Building {
    int countBedrooms;

    public void init(Scanner in) {
        //Scanner in=new Scanner(System.in);
        System.out.println("Enter exploitationPeriod: ");
        this.exploitationPeriod = in.nextInt();
        System.out.println("Enter count of floors: ");
        this.countFloors = in.nextInt();
        System.out.println("Enter count of bedrooms: ");
        this.countBedrooms = in.nextInt();
    }

    public String toString() {
        String string = "It is PrivateHouse;";
        string += " exploitationPeriod: " + exploitationPeriod + ", " + "count of floors: " + countFloors + ", " + "area: " + ", ";
        string += "count of bedrooms: " + countBedrooms;
        return string;
    }

}