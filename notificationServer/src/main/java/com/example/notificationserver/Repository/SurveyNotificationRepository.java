package com.example.notificationserver.Repository;

import com.example.notificationserver.Entity.SurveyNotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyNotificationRepository extends JpaRepository<SurveyNotificationEntity, Long> {
}
