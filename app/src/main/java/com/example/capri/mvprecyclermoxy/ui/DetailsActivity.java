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
    Item currentItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        init();
        detailsPresenter.showItem(currentItem);
    }

    private void init() {
        title = findViewById(R.id.current_title);
        picture = findViewById(R.id.current_image);
        currentItem = getIntent().getParcelableExtra(Item.class.getSimpleName());
    }

    @Override
    public void showItem(Item currentItem) {
        title.setText(currentItem.getTitle());
        picture.setImageResource(currentItem.getImageResourceId());
    }
}
