package com.example.ai.Repository;

import com.example.ai.Entity.FoodMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DietRepository extends JpaRepository<FoodMenu, Long> {
    Boolean existsByFoodMenuId(Long foodMenuId);
}
