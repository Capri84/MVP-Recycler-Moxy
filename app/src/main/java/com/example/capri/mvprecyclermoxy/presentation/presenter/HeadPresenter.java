package com.example.capri.mvprecyclermoxy.presentation.presenter;

import android.util.Log;

import com.example.capri.mvprecyclermoxy.model.Data;
import com.example.capri.mvprecyclermoxy.model.Item;
import com.example.capri.mvprecyclermoxy.model.EventCallbacks;
import com.example.capri.mvprecyclermoxy.presentation.view.HeadView;
import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.capri.mvprecyclermoxy.ui.HeadActivity;

import java.util.List;

@InjectViewState
public class HeadPresenter extends MvpPresenter<HeadView> {

    private Data data;

    public HeadPresenter() {
        this.data = new Data();
    }

    public List<Item> loadItemsList() {
        return (data.createItemsList());
    }
}
