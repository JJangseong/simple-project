package com.simple.backend.repositories;

import com.simple.backend.models.example.Example;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by marathoner on 2021/07/16.
 */
public interface ExampleRepository extends JpaRepository<Example, Long> {
}
