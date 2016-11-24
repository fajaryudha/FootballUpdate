package id.sch.smktelkom_mlg.xirpl302112029.footballupdate;

import android.app.Fragment;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Upload extends Fragment{
    Button pick;
    Button upload;
    EditText title;
    EditText deskripsi;
    String judul,des;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.activity_upload, container,false);
        upload = (Button) myView.findViewById(R.id.buttonUpload);
        title = (EditText) myView.findViewById(R.id.etTitle);
        deskripsi = (EditText) myView.findViewById(R.id.etDesciption);
        pick = (Button) myView.findViewById(R.id.buttonUImage);

        pick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent galery = new Intent(getActivity(), Galery.class);
                startActivity(galery);
            }
        });
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                judul = title.getText().toString();
                des = deskripsi.getText().toString();
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Berita");
                myRef.child(judul).child("Title").setValue(judul);
                myRef.child(judul).child("Deskripsi").setValue(des);
            }

        });

        return myView;
    }

}
