package org.example.repository;

public class StatusFetcherEven implements StatusFetcher {
    @Override
    public String type() {
        return "Type 1";
    }

    @Override
    public Object getStatus(int input) {
        return (input & 1) == 0; // always true if input is even
    }
}
