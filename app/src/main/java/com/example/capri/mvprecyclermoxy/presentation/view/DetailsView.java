package com.example.capri.mvprecyclermoxy.presentation.view;

import com.arellomobile.mvp.MvpView;
import com.example.capri.mvprecyclermoxy.model.Item;

public interface DetailsView extends MvpView {
    void showItem(Item currentItem);
}
