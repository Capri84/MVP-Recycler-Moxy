package com.example.capri.mvprecyclermoxy.model;

import android.util.Log;

import com.example.capri.mvprecyclermoxy.App;
import com.example.capri.mvprecyclermoxy.R;
import com.example.capri.mvprecyclermoxy.ui.HeadActivity;

import java.util.ArrayList;
import java.util.List;

public class Data implements DataContract {

    private int[] pictureIds = {R.drawable.pict1, R.drawable.pict2, R.drawable.pict3, R.drawable.pict4,
            R.drawable.pict5, R.drawable.pict6, R.drawable.pict7};
    private String[] pictureTitles = App.getContext().getResources().
            getStringArray(R.array.picture_names);
    private List<Item> items;

    @Override
    public List<Item> createItemsList() {
        threadDelay(new EventCallbacks() {
            @Override
            public void onSleepEnd() {
                items = new ArrayList<>();
                for (int i = 0; i < pictureIds.length; i++) {
                    items.add(i, new Item(pictureTitles[i], pictureIds[i]));
                }
            }
        });
        return items;
    }

    private void threadDelay(EventCallbacks callback) {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException exception) {
            Log.v(HeadActivity.TAG, exception.toString());
        }
        callback.onSleepEnd();
    }
}
