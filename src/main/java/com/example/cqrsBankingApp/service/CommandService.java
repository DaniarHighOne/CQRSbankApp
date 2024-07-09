package com.example.cqrsBankingApp.service;

public interface CommandService<T> {

    void create(T object);

}
