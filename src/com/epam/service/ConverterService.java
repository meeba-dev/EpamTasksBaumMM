package com.epam.service;

public interface ConverterService<T, S> {

    public T convertToEntity(S dto);
    public S convertToDTO(T entity);

}
