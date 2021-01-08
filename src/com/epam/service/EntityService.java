package com.epam.service;

import java.util.List;

public interface EntityService<T, S> {

    public T getEntity();
    public List<T> getAllEntities();
    public void safeEntity(T entity);
    public void safeEntities(List<T> entities);
    public S convertToDTO(T entity);
}
