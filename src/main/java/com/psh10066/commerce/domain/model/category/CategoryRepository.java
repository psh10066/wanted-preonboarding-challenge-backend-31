package com.psh10066.commerce.domain.model.category;

import java.util.List;

public interface CategoryRepository {

    Category getById(Long id);

    List<Category> findAllByLevel(Integer level);
}
