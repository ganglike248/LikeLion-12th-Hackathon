package com.example.ai.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DailyMealPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dailyMealPlanId;

    private int day;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "daily_meal_plan_id")
    private List<MealOption> mealOptions;
}
