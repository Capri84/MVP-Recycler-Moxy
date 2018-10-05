package com.example.capri.mvprecyclermoxy.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.arellomobile.mvp.MvpActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.capri.mvprecyclermoxy.App;
import com.example.capri.mvprecyclermoxy.R;
import com.example.capri.mvprecyclermoxy.model.Item;
import com.example.capri.mvprecyclermoxy.presentation.presenter.HeadPresenter;
import com.example.capri.mvprecyclermoxy.presentation.view.HeadView;
import java.util.List;

public class HeadActivity extends MvpActivity implements HeadView {

    public static final String TAG = "HeadActivity";
    @InjectPresenter
    HeadPresenter headPresenter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head);
        init();
    }

    public void init(){
        recyclerView = findViewById(R.id.list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public void onItemsLoaded(List<Item> items) {
        RecyclerAdapter adapter = new RecyclerAdapter(items);
        recyclerView.setAdapter(adapter);
    }

    public static void startDetailsActivity(Item currentItem) {
        Context context = App.getContext();
        Intent intent = new Intent(context, DetailsActivity.class);
        intent.putExtra(Item.class.getSimpleName(), currentItem);
        context.startActivity(intent);
    }
}
