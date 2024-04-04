package com.springwatch.services;

public interface idataConvert {
    <T> T dataGet(String json, Class<T> classe);
}
