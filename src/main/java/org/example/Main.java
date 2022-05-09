package org.example;

import org.example.factory.StatusFetcherFactory;
import org.example.repository.StatusFetcher;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan pilihan: 1/2/3/4/12/123/1234:");
        String input = scan.nextLine();
        System.out.println("Masukkan angka: ");
        int numInput = scan.nextInt();

        List<StatusFetcher> statusFetchers = StatusFetcherFactory.getStatusFetchers(input);

        for (StatusFetcher statusFetcher: statusFetchers) {
            System.out.format("%s: %s\n", statusFetcher.type(), statusFetcher.getStatus(numInput));
        }
    }
}
