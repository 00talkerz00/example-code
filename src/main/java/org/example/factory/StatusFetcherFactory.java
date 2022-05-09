package org.example.factory;

import org.example.repository.*;

import java.util.*;
import java.util.stream.Collectors;

public class StatusFetcherFactory {
    private static Map<String, StatusFetcher> statusFetchMap = new HashMap<String, StatusFetcher>() {
        {
            put("1", new StatusFetcherEven());
            put("2", new StatusFetcherOdd());
            put("3", new StatusFetcherTwice());
            put("4", new StatusFetcherPow2());
        }
    };

    public static List<StatusFetcher> getStatusFetchers(String input) {
        return Arrays.stream(input.split(""))
                .distinct()
                .map(statusFetchMap::get)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
