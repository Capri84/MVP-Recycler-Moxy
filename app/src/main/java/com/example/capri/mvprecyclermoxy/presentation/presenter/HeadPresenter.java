package com.example.capri.mvprecyclermoxy.presentation.presenter;

import com.example.capri.mvprecyclermoxy.model.Data;
import com.example.capri.mvprecyclermoxy.model.Item;
import com.example.capri.mvprecyclermoxy.presentation.view.HeadView;
import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class HeadPresenter extends MvpPresenter<HeadView> {

    private Data data;

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        loadItemsList();
    }

    private void loadItemsList() {
        getViewState().onItemsLoaded(data.createItemsList());
    }

    public void startDetailsActivity(Item currentItem) {
        getViewState().startDetailsActivity(currentItem);
    }
}
