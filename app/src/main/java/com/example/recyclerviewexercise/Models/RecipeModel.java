package com.example.recyclerviewexercise.Models;

public class RecipeModel {
    int image;
    String foodMenuText;

    public RecipeModel(int image, String foodMenuText) {
        this.image = image;
        this.foodMenuText = foodMenuText;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getFoodMenuText() {
        return foodMenuText;
    }

    public void setFoodMenuText(String foodMenuText) {
        this.foodMenuText = foodMenuText;
    }
}
