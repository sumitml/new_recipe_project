package com.sk.recipeapp.services;

import com.sk.recipeapp.commands.RecipeCommand;
import com.sk.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipe();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
