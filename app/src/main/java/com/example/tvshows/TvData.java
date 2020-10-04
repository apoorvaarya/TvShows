package com.example.tvshows;

public class TvData {

    private String itemName;
    private String itemGenre;
    private String itemRate;
    private int itemImage;

    public TvData(String itemName, String itemGenre, String itemRate, int itemImage) {
        this.itemName = itemName;
        this.itemGenre = itemGenre;
        this.itemRate = itemRate;
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

    public int getItemImage() {
        return itemImage;
    }
}
