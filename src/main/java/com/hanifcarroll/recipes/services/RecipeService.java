package com.hanifcarroll.recipes.services;

import com.hanifcarroll.recipes.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
