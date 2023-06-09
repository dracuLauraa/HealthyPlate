package com.startup.healthyplate

data class UserPreferences(
    val diet: String,
    val healthCondition: String,
    val lifeGoal: String,
    val maxCalories: Int
)