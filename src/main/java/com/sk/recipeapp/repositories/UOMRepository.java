package com.sk.recipeapp.repositories;

import com.sk.recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;


import java.util.Optional;

public interface UOMRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
