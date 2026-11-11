package com.cs407.seefood.data

import com.cs407.seefood.BuildConfig
import com.cs407.seefood.model.NutritionInfo
import com.cs407.seefood.model.Recipe

class SeeFoodRepository {

    private val llmClient = LlmRecipeClient(BuildConfig.GROQ_API_KEY)

    suspend fun suggestRecipesFrom(ingredients: List<String>): List<Recipe> {
        return llmClient.suggest(ingredients)
    }

    suspend fun estimateNutritionFor(recipe: Recipe): NutritionInfo {
        return llmClient.estimateNutrition(recipe)
    }
}
