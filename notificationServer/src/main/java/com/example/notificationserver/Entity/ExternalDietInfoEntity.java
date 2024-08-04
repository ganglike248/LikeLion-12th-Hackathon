package com.example.notificationserver.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_diet", indexes = {
        @Index(name = "diet_processed_date_idx", columnList = "processedBreakfast, processedLunch, processedDinner, date")
})
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Builder
public class ExternalDietInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String breakfast;
    private String lunch;
    private String dinner;
    private boolean processedBreakfast;
    private boolean processedLunch;
    private boolean processedDinner;
    private String date;
}
