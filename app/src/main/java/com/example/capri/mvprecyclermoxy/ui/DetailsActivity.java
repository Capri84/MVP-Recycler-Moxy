package com.example.capri.mvprecyclermoxy.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.capri.mvprecyclermoxy.R;
import com.example.capri.mvprecyclermoxy.model.Item;
import com.example.capri.mvprecyclermoxy.presentation.view.DetailsView;
import com.example.capri.mvprecyclermoxy.presentation.presenter.DetailsPresenter;
import com.arellomobile.mvp.MvpActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

public class DetailsActivity extends MvpActivity implements DetailsView {

    public static final String TAG = "DetailsActivity";
    @InjectPresenter
    DetailsPresenter detailsPresenter;
    private TextView title;
    private ImageView picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Item currentItem = getIntent().getParcelableExtra(Item.class.getSimpleName());
        detailsPresenter.showItem(currentItem);
    }

    @Override
    public void showItem(Item currentItem) {
        title.setText(currentItem.getTitle());
        picture.setImageResource(currentItem.getImageResourceId());
    }
}
