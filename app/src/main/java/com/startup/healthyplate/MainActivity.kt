import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.startup.healthyplate.*

class MainActivity : AppCompatActivity() {
    private lateinit var healthyPlateApp: HealthyPlateApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize HealthyPlateApp
        healthyPlateApp = HealthyPlateApp()

        // Add some food stalls to the app
        val foodStall1 = FoodStall(
            name = "Healthy Bites",
            location = "123 Main Street",
            nutritionalInfo = NutritionalInfo(
                calories = 300,
                protein = 20.5,
                carbohydrates = 30.2,
                fat = 10.1,
                allergens = listOf("Nuts", "Soy")
            )
        )
        healthyPlateApp.addFoodStall(foodStall1)

        val foodStall2 = FoodStall(
            name = "Fresh Greens",
            location = "456 Elm Avenue",
            nutritionalInfo = NutritionalInfo(
                calories = 250,
                protein = 15.2,
                carbohydrates = 35.7,
                fat = 8.6,
                allergens = listOf("Gluten", "Dairy")
            )
        )
        healthyPlateApp.addFoodStall(foodStall2)

        // Example usage: Get nearby food stalls for a user's location
        val userLocation = "789 Oak Road"
        val nearbyFoodStalls = healthyPlateApp.getNearbyFoodStalls(userLocation)

        // Display the nearby food stalls in a TextView
        val foodStallsTextView = findViewById<TextView>(R.id.foodStallsTextView)
        val foodStallsText = StringBuilder()
        for (foodStall in nearbyFoodStalls) {
            foodStallsText.append(foodStall.name).append("\n")
        }

        foodStallsTextView.text = foodStallsText.toString()

        // Example usage: Filter food stalls based on user preferences
        val userPreferences = UserPreferences(
            diet = "Vegan",
            healthCondition = "Diabetes",
            lifeGoal = "Weight Loss",
            maxCalories = 400
        )
        val filteredFoodStalls = healthyPlateApp.filterFoodStalls(userPreferences)

        // Display the filtered food stalls in a TextView
        val filteredFoodStallsTextView = findViewById<TextView>(R.id.filteredFoodStallsTextView)
        val filteredFoodStallsText = StringBuilder()
        for (foodStall in filteredFoodStalls) {
            filteredFoodStallsText.append(foodStall.name).append("\n")
        }
        filteredFoodStallsTextView.text = filteredFoodStallsText.toString()
    }
}
