package com.example.fernando.domicilios504;

/**
 * Created by Fernando on 22/04/2016.
 */
public class ListItem {

    private int item_Title;
    private int item_Image;
    private int item_Description;
    private int item_Price;


    public ListItem(int Title, int Image, int Description, int Price){
        item_Title = Title;
        item_Image = Image;
        item_Description = Description;
        item_Price = Price;
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

    public int getPrice(){
        return item_Price;
    }

}
