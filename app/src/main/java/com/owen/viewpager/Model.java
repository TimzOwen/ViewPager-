package com.owen.viewpager;

public class Model {

    //generate getter and setter methods for the image, title and description

    private int image;
    private  String title;
    private String desc;

    //creates a constructor for the threee parameters
    public Model(int image, String title, String desc) {
        this.image = image;
        this.title = title;
        this.desc = desc;
    }
    
    //create the getter and setter methods

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
