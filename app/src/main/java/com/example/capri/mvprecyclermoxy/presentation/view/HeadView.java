package com.example.capri.mvprecyclermoxy.presentation.view;

import com.arellomobile.mvp.MvpView;
import com.example.capri.mvprecyclermoxy.model.Item;
import java.util.List;

public interface HeadView extends MvpView {
    void onItemsLoaded(List<Item> items);
}
