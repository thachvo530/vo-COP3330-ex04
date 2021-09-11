/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */
package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = scan.next();

        System.out.print("Enter a verb: ");
        String verb = scan.next();

        System.out.print("Enter an adjective: ");
        String adj = scan.next();

        System.out.print("Enter an adverb: ");
        String adv = scan.next();

        System.out.print("Do you "+verb+" your "+adj+" "+noun+" "+adv+"? That's hilarious!");
    }

}