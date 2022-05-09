package org.example.repository;

public interface StatusFetcher {
    String type();
    Object getStatus(int input);
}
