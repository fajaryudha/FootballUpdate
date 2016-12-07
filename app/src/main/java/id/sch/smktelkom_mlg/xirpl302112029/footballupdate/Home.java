package id.sch.smktelkom_mlg.xirpl302112029.footballupdate;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import id.sch.smktelkom_mlg.xirpl302112029.footballupdate.Activity.HomeActivity;

/**
 * Created by Smktelkom on 11/19/2016.
 */

public class Home extends Fragment{

    DatabaseReference myRef;
    ValueEventListener postListener;
    TextView textKeren;
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.home, container,false);
        myRef = FirebaseDatabase.getInstance().getReference().child("Keren");
        textKeren = (TextView) myView.findViewById(R.id.textViewJudul);
        return myView;
    }

//    String java;
//    @Override
//    public void onStart() {
//        super.onStart();

//        ValueEventListener postListener = new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                java = (String) dataSnapshot.getValue();

//            }

//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//                Log.v("gagal","gagal");
//            }
//        };
//        myRef.addValueEventListener(postListener);
//    }
}
