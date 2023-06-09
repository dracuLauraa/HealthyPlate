package com.startup.healthyplate

data class NutritionalInfo(
    val calories: Int,
    val protein: Double,
    val carbohydrates: Double,
    val fat: Double,
    val allergens: List<String>
)