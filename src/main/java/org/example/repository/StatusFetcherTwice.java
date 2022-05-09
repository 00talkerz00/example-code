package org.example.repository;

public class StatusFetcherTwice implements StatusFetcher {
    @Override
    public String type() {
        return "Type 3";
    }

    @Override
    public Object getStatus(int input) {
        return input * 2;
    }
}
