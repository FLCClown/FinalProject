package com.example.fernando.domicilios504;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    public static final List<ListItem> thisArray = new ArrayList<ListItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        populateList();
        populateListView();
        registerClick();
    }

    private void populateList(){
        thisArray.add(new ListItem(R.string.Title1, R.drawable.pizza, R.string.Description1, R.string.Price1));
        thisArray.add(new ListItem(R.string.Title2, R.drawable.burger, R.string.Description2, R.string.Price2));
        thisArray.add(new ListItem(R.string.Title3, R.drawable.pollofrito, R.string.Description3, R.string.Price3));
        thisArray.add(new ListItem(R.string.Title4, R.drawable.pupusas, R.string.Description4, R.string.Price4));
        thisArray.add(new ListItem(R.string.Title5, R.drawable.baleadas, R.string.Description5, R.string.Price5));
        thisArray.add(new ListItem(R.string.Title6, R.drawable.comidachina, R.string.Description6, R.string.Price6));
        thisArray.add(new ListItem(R.string.Title7, R.drawable.sopas, R.string.Description7, R.string.Price7));
        thisArray.add(new ListItem(R.string.Title8, R.drawable.tacos, R.string.Description8, R.string.Price8));
    }

    private void populateListView(){
        ArrayAdapter<ListItem> adapter = new ListAdapter();
        ListView list = (ListView) findViewById(R.id.main_List);
        list.setAdapter(adapter);
    }

    private void registerClick(){
        ListView list = (ListView) findViewById(R.id.main_List);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListItem item = thisArray.get(position);
                Intent intent = new Intent(ListActivity.this, DetailActivity.class);
                intent.putExtra("Position", position);
                startActivity(intent);
            }
        });
    }

    private class ListAdapter extends ArrayAdapter<ListItem>{
        public ListAdapter(){
            super(ListActivity.this, R.layout.listcell, thisArray);
        }

        @Override
        public View getView(int index, View v, ViewGroup parent){
            View cellView = v;
            if(cellView == null){
                cellView = getLayoutInflater().inflate(R.layout.listcell, parent, false);
            }
            ListItem item = thisArray.get(index);
            ImageView image = (ImageView) cellView.findViewById(R.id.cell_Image);
            TextView title = (TextView) cellView.findViewById(R.id.cell_Title);
            TextView description = (TextView) cellView.findViewById(R.id.cell_Description);
            TextView price = (TextView) cellView.findViewById(R.id.cell_Price);
            image.setImageResource(item.getImage());
            title.setText(item.getTitle());
            description.setText(item.getDescription());
            price.setText(item.getPrice());
            price.setText(price.getText().toString() + "Lps.");
            return cellView;
        }


    }



}
