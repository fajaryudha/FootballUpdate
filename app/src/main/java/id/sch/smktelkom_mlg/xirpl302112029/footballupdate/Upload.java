package id.sch.smktelkom_mlg.xirpl302112029.footballupdate;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Upload extends Fragment{
    Button upload;
    EditText title;
    EditText deskripsi;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.activity_upload, container,false);
        upload = (Button) myView.findViewById(R.id.buttonUpload);
        title = (EditText) myView.findViewById(R.id.etTitle);
        deskripsi = (EditText) myView.findViewById(R.id.etDesciption);
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("message");
                myRef.setValue("Hello, World!");
                myRef.setValue("Sett");
            }
        });

        return myView;
    }
}
