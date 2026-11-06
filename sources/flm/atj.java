package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class atj extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public atj(Status status) {
        String str;
        int i = status.h;
        if (status.i != null) {
            str = status.i;
        } else {
            str = "";
        }
        super(new StringBuilder(String.valueOf(str).length() + 13).append(i).append(": ").append(str).toString());
    }
}
