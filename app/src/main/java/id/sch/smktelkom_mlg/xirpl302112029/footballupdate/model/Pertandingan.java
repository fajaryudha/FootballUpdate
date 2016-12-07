package id.sch.smktelkom_mlg.xirpl302112029.footballupdate.model;

import android.graphics.drawable.Drawable;

/**
 * Created by erlangga on 11/24/2016.
 */
public class Pertandingan {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Pertandingan(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
