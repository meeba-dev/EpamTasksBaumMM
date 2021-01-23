package com.epam.repository;

import java.util.List;

public interface HumanRepository<T> {

    public T getOneByName(T t);
    public void getAll();
    public void saveOne(T entity);
    public void saveAll(List<T> entities);

}
