package com.example.foodrecipes

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRecipeApi {

    @GET(value = "/recipes/random")
    fun getRecipe(
        @QueryMap queries: Map<String, String>
    ): Response<RecipeResponse>
}