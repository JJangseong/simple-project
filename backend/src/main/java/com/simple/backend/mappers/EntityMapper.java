package com.simple.backend.mappers;

/**
 * Created by marathoner on 2021/07/16.
 */
public interface EntityMapper <D, E> {
    E toEntity(D dto);

    D toDto(E entity);
}
