package com.simple.repositories;

import com.simple.models.example.Example;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by marathoner on 2021/07/16.
 */
public interface ExampleRepository extends JpaRepository<Example, Long> {
}
