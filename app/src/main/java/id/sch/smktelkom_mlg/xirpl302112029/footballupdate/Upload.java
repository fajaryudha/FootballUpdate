package id.sch.smktelkom_mlg.xirpl302112029.footballupdate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;

public class Upload extends AppCompatActivity {
    EditText title;
    EditText descripsi;
    Button upload;
    private DatabaseReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        title = (EditText)findViewById(R.id.etTitle);
        descripsi = (EditText)findViewById(R.id.etDesciption);
        upload = (Button)findViewById(R.id.buttonUpload);
        mRef = new DatabaseReference()
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
