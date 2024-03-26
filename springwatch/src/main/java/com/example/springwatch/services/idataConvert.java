package com.example.springwatch.services;

public interface idataConvert {
    <T> T dataGet(String json, Class<T> classe);
}
