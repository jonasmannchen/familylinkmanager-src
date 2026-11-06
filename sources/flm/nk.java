package flm;

import android.os.Bundle;
import android.support.v4.app.LoaderManagerImpl;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nk {
    public abstract op a(int i, Bundle bundle, nl nlVar);

    public abstract void a();

    public abstract void a(int i);

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public static nk a(af afVar) {
        return new LoaderManagerImpl(afVar, ((bm) afVar).d());
    }
}
