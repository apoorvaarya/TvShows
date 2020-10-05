package com.example.tvshows;

public class TvData {

    private String itemName;
    private String itemGenre;
    private String itemRate;
    private String description;
    private int itemImage;

    public TvData(String itemName, String itemGenre, String itemRate, String description, int itemImage) {
        this.itemName = itemName;
        this.itemGenre = itemGenre;
        this.itemRate = itemRate;
        this.description = description;
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemGenre() {
        return itemGenre;
    }

    public String getItemRate() {
        return itemRate;
    }

    public String getDescription() {
        return description;
    }

    public int getItemImage() {
        return itemImage;
    }
}
