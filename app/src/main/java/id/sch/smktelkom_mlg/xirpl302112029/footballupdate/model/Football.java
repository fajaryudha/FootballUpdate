package id.sch.smktelkom_mlg.xirpl302112029.footballupdate.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Affandhy on 22/11/2016.
 */

public class Football {
    public String Judul;
    public String Deskripsi;
    public Drawable foto;

    public Football(String Judul, String Deskripsi, Drawable foto) {
        this.Judul = Judul;
        this.Deskripsi = Deskripsi;
        this.foto = foto;
    }
}
