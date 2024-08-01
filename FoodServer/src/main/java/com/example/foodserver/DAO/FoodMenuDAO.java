package com.example.foodserver.DAO;

import com.example.foodserver.DTO.FoodMenuDTO;

import java.util.List;
import java.util.Optional;

public interface FoodMenuDAO {
    FoodMenuDTO create(FoodMenuDTO foodMenuDTO);
    Optional<FoodMenuDTO> getById(Long id);
    List<FoodMenuDTO> getAll();
    FoodMenuDTO update(Long id, FoodMenuDTO foodMenuDTO);
    void delete(Long id);
}
