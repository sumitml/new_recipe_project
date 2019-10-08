package com.sk.recipeapp.repositories;

import com.sk.recipeapp.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UOMRepositoryIT {

    @Autowired
    UOMRepository uomRepository;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByDescription() throws Exception {
        Optional<UnitOfMeasure> optionalUnitOfMeasure = uomRepository.findByDescription("Teaspoon");
        assertEquals("Teaspoon",optionalUnitOfMeasure.get().getDescription());
    }
}