package com.example.fernando.domicilios504;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        List<ListItem> array = ListActivity.thisArray;

        Intent intent = getIntent();
        int index = intent.getIntExtra("Position", 0);

        ListItem item = array.get(index);
        TextView title = (TextView) findViewById(R.id.take_Title);
        TextView subTitle = (TextView) findViewById(R.id.take_Sub);
        ImageView image = (ImageView) findViewById(R.id.take_Header);
        title.setText(item.getTitle());
        subTitle.setText(item.getDescription());
        image.setImageResource(item.getImage());

    }
}
