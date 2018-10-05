package com.example.capri.mvprecyclermoxy.presentation.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.capri.mvprecyclermoxy.model.Item;
import com.example.capri.mvprecyclermoxy.presentation.view.DetailsView;

@InjectViewState
public class DetailsPresenter extends MvpPresenter<DetailsView> {

    public void showItem(Item currentItem) {
        getViewState().showItem(currentItem);
    }
}
