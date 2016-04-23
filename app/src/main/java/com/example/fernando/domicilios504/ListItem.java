package com.example.fernando.domicilios504;

/**
 * Created by Fernando on 22/04/2016.
 */
public class ListItem {

    private int item_Title;
    private int item_Image;
    private int item_Description;

    public ListItem(int Title, int Image, int Description){
        item_Title = Title;
        item_Image = Image;
        item_Description = Description;
    }

    public int getTitle(){
        return item_Title;
    }

    public int getImage(){
        return item_Image;
    }

    public int getDescription(){
        return item_Description;
    }

}
