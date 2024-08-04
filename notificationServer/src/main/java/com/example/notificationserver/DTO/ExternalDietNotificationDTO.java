package com.example.notificationserver.DTO;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ExternalDietNotificationDTO {
    private List<DailyDietDTO> dailyDiets;

    @Builder
    public ExternalDietNotificationDTO(List<DailyDietDTO> dailyDiets) {
        this.dailyDiets = dailyDiets;
    }
}
