package com.example.fernando.domicilios504;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private final List<ListItem> array = new ArrayList<ListItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        populateList();
        populateListView();
    }

    private void populateList(){
        array.add(new ListItem(R.string.Title1, R.string.Image1, R.string.Description1));
        array.add(new ListItem(R.string.Title2, R.string.Image2, R.string.Description2));
        array.add(new ListItem(R.string.Title3, R.string.Image3, R.string.Description3));
        array.add(new ListItem(R.string.Title4, R.string.Image4, R.string.Description4));
        array.add(new ListItem(R.string.Title5, R.string.Image5, R.string.Description5));
        array.add(new ListItem(R.string.Title6, R.string.Image6, R.string.Description6));
        array.add(new ListItem(R.string.Title7, R.string.Image7, R.string.Description7));
        array.add(new ListItem(R.string.Title8, R.string.Image8, R.string.Description8));
    }

    private void populateListView(){
        ArrayAdapter<ListItem> adapter = new ListAdapter();
        ListView list = (ListView) findViewById(R.id.main_List);
        list.setAdapter(adapter);
    }

    private class ListAdapter extends ArrayAdapter<ListItem>{
        public ListAdapter(){
            super(ListActivity.this, R.layout.listcell, array);
        }

        @Override
        public View getView(int index, View v, ViewGroup parent){
            View cellView = v;
            if(cellView == null){
                cellView = getLayoutInflater().inflate(R.layout.listcell, parent, false);
            }
            ListItem item = array.get(index);
            ImageView image = (ImageView) cellView.findViewById(R.id.cell_Image);
            TextView title = (TextView) cellView.findViewById(R.id.cell_Title);
            TextView description = (TextView) cellView.findViewById(R.id.cell_Description);
            image.setImageResource(item.getImage());
            title.setText(item.getTitle());
            description.setText(item.getDescription());
            return cellView;
        }


    }



}
