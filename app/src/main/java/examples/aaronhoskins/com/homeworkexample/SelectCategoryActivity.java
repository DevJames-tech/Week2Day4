package examples.aaronhoskins.com.homeworkexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import examples.aaronhoskins.com.homeworkexample.model.datasource.local.database.MockZooDatabaseHelper;

public class SelectCategoryActivity extends AppCompatActivity {
    ListView lstCategoryList;
    MockZooDatabaseHelper mockZooDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_category_activty);
        mockZooDatabaseHelper = new MockZooDatabaseHelper();

        lstCategoryList = findViewById(R.id.lstCategory);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                mockZooDatabaseHelper.getAllCategories());
        lstCategoryList.setAdapter(arrayAdapter);
        lstCategoryList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(view.getContext(), SelectAnimalActivity.class);
                intent.putExtra("category", mockZooDatabaseHelper.getAllCategories().get(i));
                startActivity(intent);
            }
        });
    }
}
