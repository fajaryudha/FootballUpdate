package id.sch.smktelkom_mlg.xirpl302112029.footballupdate;

import android.app.Fragment;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.xirpl302112029.footballupdate.adapter.PertandinganAdapter;
import id.sch.smktelkom_mlg.xirpl302112029.footballupdate.model.Pertandingan;

public class Jadwal extends Fragment {

   // ArrayList<Pertandingan> mList = new ArrayList<>();
  //  PertandinganAdapter mAdapter;
    //View myView;

  //  @Override
  //  public void onCreate(Bundle savedInstanceState) {
  //      super.onCreate(savedInstanceState);
  //      RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewJadwal);
  //      LinearLayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
  //      recyclerView.setLayoutManager(layoutManager);
  //      mAdapter = new PertandinganAdapter(mList);
  //      recyclerView.setAdapter(mAdapter);
//
 //       fillData();
  //  }
 //   public void fillData() {
 //       Resources resources = getResources();
 //       String[] arJudul = resources.getStringArray(R.array.places);
 //       String[] arDeskripsi = resources.getStringArray(R.array.place_desc);
 //       TypedArray a = resources.obtainTypedArray(R.array.places_picture);
 //       Drawable[] arFoto = new Drawable[a.length()];

   //     for (int i = 0; i < arFoto.length; i++) {
   //         BitmapDrawable bd = (BitmapDrawable) a.getDrawable(i);
   //         RoundedBitmapDrawable rbd = RoundedBitmapDrawableFactory.create(getResources(), bd.getBitmap());
   //         rbd.setCircular(true);
    //        arFoto[i] = rbd;
    //    }

      //  a.recycle();

    //    for (int i = 0; i < arJudul.length; i++) {
    //        mList.add(new Pertandingan(arJudul[i], arDeskripsi[i], arFoto[i]));
    //    }
    //    mAdapter.notifyDataSetChanged();
   // }

}
