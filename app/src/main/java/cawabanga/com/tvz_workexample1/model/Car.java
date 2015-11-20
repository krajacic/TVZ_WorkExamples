package cawabanga.com.tvz_workexample1.model;

/**
 * Created by croatan on 16.11.2015..
 */
public class Car {

    private String name;
    private int imageId;

    public Car (String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName () {
        return name;
    }

    public int getImageId () {
        return imageId;
    }

}
