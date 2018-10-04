package com.example.capri.mvprecyclermoxy.model;

import com.example.capri.mvprecyclermoxy.App;
import com.example.capri.mvprecyclermoxy.R;
import java.util.ArrayList;
import java.util.List;

public class Data implements DataContract {

    private int[] pictureIds = {R.drawable.pict1, R.drawable.pict2, R.drawable.pict3, R.drawable.pict4,
            R.drawable.pict5, R.drawable.pict6, R.drawable.pict7};
    private String[] pictureTitles = App.getContext().getResources().
            getStringArray(R.array.picture_names);

    @Override
    public List<Item> createItemsList() {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < pictureIds.length; i++) {
            items.add(i, new Item(pictureTitles[i], pictureIds[i]));
        }
        return items;
    }
}
