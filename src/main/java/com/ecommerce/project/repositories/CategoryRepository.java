package com.ecommerce.project.repositories;

import com.ecommerce.project.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByCategoryName(String categoryName);   // JPA can understand the meaning of the 'methodName' and can make a query in the backend, we don't need to write any query for this.
}
