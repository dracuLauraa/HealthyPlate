package com.startup.healthyplate.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.startup.healthyplate.R
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll


@Composable
fun HealthInfo(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Health Information",
            style = MaterialTheme.typography.h5.copy(color = Color(0xFF38A0DB))
        )
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .offset(0.dp, (-10).dp),
            painter = painterResource(id = R.drawable.burger),
            contentDescription = "",
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text =  "A chicken burger is a popular fast food item made with a breaded or grilled chicken patty, " +
                    "served in a bun and often accompanied by various toppings such as lettuce, tomatoes, onions, " +
                    "and condiments like mayonnaise or barbecue sauce. Compared to beef burgers, chicken burgers " +
                    "are generally lower in fat and calories. However, the exact nutritional content may vary " +
                    "depending on the specific ingredients and preparation method.\n\n" +
                    "Here's an approximate nutritional breakdown for a typical chicken burger:\n\n" +
                    "Calories: 350-450 calories\n" +
                    "Protein: 20-30 grams\n" +
                    "Fat: 10-15 grams\n" +
                    "Carbohydrates: 30-40 grams\n" +
                    "Sodium: 500-800 milligrams\n\n" +
                    "It's important to note that these values are estimates and can vary based on the size and " +
                    "ingredients of the chicken patty and bun. When choosing a chicken burger, opt for grilled " +
                    "or baked patties instead of breaded and deep-fried options. Additionally, consider using " +
                    "whole wheat buns and adding plenty of fresh vegetables to increase the nutritional value " +
                    "of your burger.",
            style = MaterialTheme.typography.body1
        )
    }
}
