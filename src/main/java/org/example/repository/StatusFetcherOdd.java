package org.example.repository;

public class StatusFetcherOdd implements StatusFetcher {
    @Override
    public String type() {
        return "Type 2";
    }

    @Override
    public Object getStatus(int input) {
        return (input & 1) != 0; // always true if input is odd
    }
}
