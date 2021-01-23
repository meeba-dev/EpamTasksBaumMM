package com.epam.repository;

import java.util.List;

public interface AddressRepository<T> {

    public T getOneByCityName(T t);
    public void getAll();
    public void saveOne(T entity);
    public void saveAll(List<T> entities);

}
