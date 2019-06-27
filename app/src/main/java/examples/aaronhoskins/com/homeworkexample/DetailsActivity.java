package examples.aaronhoskins.com.homeworkexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import examples.aaronhoskins.com.homeworkexample.model.ZooAnimal.ZooAnimal;

public class DetailsActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();
        textView = findViewById(R.id.tvName);
        if(intent != null) {
            ZooAnimal zooAnimal = intent.getParcelableExtra("animal");
            if(zooAnimal != null) {
                textView.setText(zooAnimal.getmSpecies());
            }
        }
    }
}
