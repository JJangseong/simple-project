package com.simple.common.repositories;

import com.simple.common.models.code.Code;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by marathoner on 2021/07/16.
 */
public interface CodeRepository extends JpaRepository<Code, Long> {
}
