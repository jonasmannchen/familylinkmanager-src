package flm;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bac extends sb {
    public bac(int i) {
        super(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.sb
    public /* synthetic */ int sizeOf(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        return bitmap.getHeight() * bitmap.getRowBytes();
    }
}
