package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        ArrayList<String> product = new ArrayList<String>();
        ArrayList<Double> price = new ArrayList<Double>();
        ArrayList<String> order = new ArrayList<String>();
        ArrayList<Integer> quantity = new ArrayList<Integer>();

        product.add("Red Hot Spicy Doritos");
        price.add(2.99);
        product.add("Cool Ranch Doritos");
        price.add(2.99);
        product.add("Coke");
        price.add(0.99);
        product.add("Diet Coke");
        price.add(0.99);
        product.add("Pepsi");
        price.add(0.99);
        product.add("Five Hour Energy");
        price.add(3.99);
        product.add("Sunflower Seeds");
        price.add(0.99);
        product.add("Peanuts");
        price.add(0.99);
        product.add("Mac Book Charger");
        price.add(120.00);
        product.add("Dell Charger");
        price.add(50.00);

        String answer = "";
        String response = "";
        String receipt = "";
        double total = 0.0;
        double grandTotal = 0.0;



            System.out.println("Welcome to COBIS Convenience! Our store hours are from 9am - 10pm. According to the current time, are we open right now? Please enter 'Yes' or 'No'");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("Yes")) {
                System.out.print("We have the following items in stock: \n Red Hot Spicy Doritos - $2.99 \n Cool Ranch Doritos - $2.99 \n Coke - $0.99 \n " +
                        "Diet Coke - $0.99 \n Pepsi - $0.99 \n Five Hour Energy - $3.99 \n Sunflower Seeds - $0.99 \n Peanuts - $0.99 \n Mac Book Charger - $120.00 \n Dell Charger - $50.00");
                order.clear();

                System.out.println("\nPlease enter your name below.");
                while (!(response = input.nextLine()).equalsIgnoreCase("Closed")) {
                    receipt += "\n " + response + " \n";
                    total = 0;
                    System.out.println("What item/items would you like to purchase? When you are done, type 'Done' ");
                    while (!(response).equalsIgnoreCase("Done")) {
                        response = input.nextLine();
                        for (String prod : product) {
                            if (prod.equals(response)) {
                                total += price.get(product.indexOf(prod));
                                receipt += "\n" + response;
                                if (!order.contains(response)) {
                                    order.add((response));
                                    quantity.add(1);
                                } else {
                                    int index = order.indexOf(response);
                                    quantity.set(index, quantity.get(index) + 1);
                                }
                                break;

                            }
                        }
                    }
                    receipt += "\n\t" + total + "\n";
                    grandTotal += total;
                    System.out.println("Hi next customer, please enter your name. If the store has closed, please enter 'Closed'");

                }
            } else {
                System.out.println("COBIS Convenience is now closed! Please come back tomorrow at 9am.");
            }
            System.out.println("Closing Receipts: \n" + receipt);
            System.out.println("Inventory Sold: ");
            for (String i : order) {
                System.out.println(i + " - " + quantity.get(order.indexOf(i)));

            }
            System.out.println("\n Grand Total: " + grandTotal);
        }
    }



