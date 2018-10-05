package com.example.capri.mvprecyclermoxy.presentation.presenter;

import com.example.capri.mvprecyclermoxy.model.Data;
import com.example.capri.mvprecyclermoxy.presentation.view.HeadView;
import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class HeadPresenter extends MvpPresenter<HeadView> {

    private Data data;

    public HeadPresenter() {
        this.data = new Data();
    }

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        loadItemsList();
    }

    private void loadItemsList() {
        getViewState().onItemsLoaded(data.createItemsList());
    }
}
