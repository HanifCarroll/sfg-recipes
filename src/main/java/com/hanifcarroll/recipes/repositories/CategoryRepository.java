package com.hanifcarroll.recipes.repositories;

import com.hanifcarroll.recipes.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
