package id.sch.smktelkom_mlg.xirpl302112029.footballupdate;

import android.app.Fragment;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.xirpl302112029.footballupdate.adapter.FootballAdapter;
import id.sch.smktelkom_mlg.xirpl302112029.footballupdate.model.Football;

public class LiveScore extends Fragment{
    protected LayoutManagerType mCurrentLayoutManagerType;
    protected RecyclerView.LayoutManager mLayoutManager;
    ArrayList<Football> mList = new ArrayList<>();
    View myView;
    FootballAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.livescore, container, false);


        RecyclerView recyclerView = (RecyclerView) myView.findViewById(R.id.recyclerview);
        mLayoutManager = new LayoutManagerType(getActivity());
        mCurrentLayoutManagerType = LayoutManagerType.LINEAR_LAYOUT_MANAGER;
        recyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new FootballAdapter(mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
        return myView;
    }

    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.places);
        String[] arDeskripsi = resources.getStringArray(R.array.place_desc);
        TypedArray a = resources.obtainTypedArray(R.array.places_picture);
        Drawable[] arfoto = new Drawable[a.length()];

        for (int i = 0; i < arfoto.length; i++) {
            BitmapDrawable bd = (BitmapDrawable) a.getDrawable(i);
            RoundedBitmapDrawable rbd =
                    RoundedBitmapDrawableFactory.create(getResources(), bd.getBitmap());
            rbd.setCircular(true);
            arfoto[i] = rbd;
        }
        a.recycle();

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new Football(arJudul[i], arDeskripsi[i], arfoto[i]));
        }
        mAdapter.notifyDataSetChanged();
    }

    private enum LayoutManagerType {
        GRID_LAYOUT_MANAGER, LINEAR_LAYOUT_MANAGER


    }
}
