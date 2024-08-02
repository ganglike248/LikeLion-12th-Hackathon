package com.example.notificationserver.Controller;

import com.example.notificationserver.DTO.SurveyNotificationDTO;
import com.example.notificationserver.Service.SurveyNotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification/payment")
public class SurveyNotificationController {
    private final SurveyNotificationService surveyNotificationService;

    public SurveyNotificationController(SurveyNotificationService surveyNotificationService) {
        this.surveyNotificationService = surveyNotificationService;
    }

    @PostMapping(name = "/create")
    public ResponseEntity<SurveyNotificationDTO> createSurveyNotification(SurveyNotificationDTO surveyNotificationDTO) {
        SurveyNotificationDTO createdSurveyNotificationDTO = surveyNotificationService.createSurveyNotification(surveyNotificationDTO);
        return ResponseEntity.ok(surveyNotificationService.createSurveyNotification(createdSurveyNotificationDTO));
    }

}
