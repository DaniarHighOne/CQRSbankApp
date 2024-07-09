package com.example.cqrsBankingApp.service;

import java.util.UUID;

/*
here keeping methods used all the way the other services
this interface for query requests
 */
public interface QueryService<T> {

    T getById(UUID id);
}
