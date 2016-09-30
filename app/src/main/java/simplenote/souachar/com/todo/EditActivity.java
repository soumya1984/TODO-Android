package simplenote.souachar.com.todo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class EditActivity extends MainActivity {

    EditText editTextNew;
    ArrayList<String> modifiedItems;
    int index;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        String editText = getIntent().getStringExtra("editText");
        index = getIntent().getIntExtra("position",0);
        int id = getIntent().getIntExtra("id",0);
        editTextNew = (EditText) findViewById(R.id.etNewItemText);
        editTextNew.setText(editText);
        modifiedItems = getIntent().getStringArrayListExtra("items");
    }

    // ActivityTwo.java
    public void onSubmit(View v) {
        // closes the activity and returns to first screen
        editTextNew = (EditText) findViewById(R.id.etNewItemText);
        String itemText = editTextNew.getText().toString();
        items.set(index,itemText.toString());
        writeItems();
        //readItems();
        Intent i = new Intent(EditActivity.this, MainActivity.class);
        startActivity(i); // brings up the second activity
        this.finish();
    }
}
