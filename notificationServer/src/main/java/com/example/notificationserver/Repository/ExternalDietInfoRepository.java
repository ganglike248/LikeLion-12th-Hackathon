package com.example.notificationserver.Repository;

import com.example.notificationserver.Entity.ExternalDietInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ExternalDietInfoRepository extends JpaRepository<ExternalDietInfoEntity, Long> {
    List<ExternalDietInfoEntity> findByDate(String date);
}
