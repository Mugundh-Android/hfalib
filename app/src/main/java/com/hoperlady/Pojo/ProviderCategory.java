package com.hoperlady.Pojo;

/**
 * Created by user145 on 10/4/2017.
 */
public class ProviderCategory {

    private String category_name = "";
    private String hourly_rate = "";
    private String categoryType = "";
    private String categoryIcon = "";
    private int countPosition = 0;

    public int getCountPosition() {
        return countPosition;
    }

    public void setCountPosition(int countPosition) {
        this.countPosition = countPosition;
    }

    public String getCategoryIcon() {
        return categoryIcon;
    }

    public void setCategoryIcon(String categoryIcon) {
        this.categoryIcon = categoryIcon;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(String hourly_rate) {
        this.hourly_rate = hourly_rate;
    }
}
