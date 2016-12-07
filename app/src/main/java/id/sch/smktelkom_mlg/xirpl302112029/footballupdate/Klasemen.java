package id.sch.smktelkom_mlg.xirpl302112029.footballupdate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseListAdapter;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import id.sch.smktelkom_mlg.xirpl302112029.footballupdate.adapter.KlasemenAdapter;


/**
 * Created by Smktelkom on 11/19/2016.
 */

public class Klasemen extends AppCompatActivity{
    ListView listView;
    DatabaseReference myRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.klasemen);
        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.listView);
        myRef = FirebaseDatabase.getInstance().getReference().child("Klasemen");

        // Defined Array values to show in ListView
        String[] values = new String[] { "1. Chealse",
                "2. Arsenal",
                "3. Liverpool",
                "4. Man Utd",
                "5. West Brom",
                "6. Everton ",
                "7. Stoke City",
                "8. Bournemouth",
                "9. Watford",
                "10. SouthHampton",
                "11. Middlesbrought"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();

            }

        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<KlasemenAdapter, BlogViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<KlasemenAdapter, BlogViewHolder>(
                KlasemenAdapter.class, R.layout.item_klasemen, BlogViewHolder.class, myRef) {
            @Override
            protected void populateViewHolder(BlogViewHolder viewHolder, KlasemenAdapter model, int position) {
                final String post_key = getRef(position).getKey();

            }

        };
    }

    private class BlogViewHolder extends RecyclerView.ViewHolder {
        View myView;
        public BlogViewHolder(View itemView) {
            super(itemView);
            myView = itemView;
        }
    }
}
