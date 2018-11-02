package com.hanifcarroll.recipes.repositories;

import com.hanifcarroll.recipes.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {


}
