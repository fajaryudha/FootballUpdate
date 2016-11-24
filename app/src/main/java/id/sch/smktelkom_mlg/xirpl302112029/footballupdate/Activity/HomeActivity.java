package id.sch.smktelkom_mlg.xirpl302112029.footballupdate.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import id.sch.smktelkom_mlg.xirpl302112029.footballupdate.R;

/**
 * Created by Smktelkom on 11/24/2016.
 */

public class HomeActivity extends AppCompatActivity {

    private DatabaseReference myRef;
    private ValueEventListener mPostListener;
    private TextView judul,des;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        judul = (TextView) findViewById(R.id.textViewJudul);
        CardView cardView = (CardView) findViewById(R.id.cv_Main);
        cardView.setCardElevation(0.5f);
        judul.setText("Fajar");



    }
}
