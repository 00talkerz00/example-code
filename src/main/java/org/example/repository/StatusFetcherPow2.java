package org.example.repository;

public class StatusFetcherPow2 implements StatusFetcher {
    @Override
    public String type() {
        return "Type 4";
    }

    @Override
    public Object getStatus(int input) {
        return Math.pow(input, 2);
    }
}
