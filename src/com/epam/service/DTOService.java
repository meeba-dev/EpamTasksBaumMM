package com.epam.service;

import java.util.List;

public interface DTOService<T, S> {
    public T getDTO();
    public List<T> getAllDTO();
    public void safeDTO(T dto);
    public void safeAllDTO(List<T> dto_list);
    public S convertToEntity(T dto);
}
