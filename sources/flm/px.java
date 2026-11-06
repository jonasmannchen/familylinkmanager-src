package flm;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class px {
    px() {
    }

    private static Object a(Object[] objArr, int i, qa qaVar) {
        Object obj;
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        Object obj2 = null;
        int i3 = Integer.MAX_VALUE;
        int length = objArr.length;
        int i4 = 0;
        while (i4 < length) {
            Object obj3 = objArr[i4];
            int iAbs = (qaVar.a(obj3) == z ? 0 : 1) + (Math.abs(qaVar.b(obj3) - i2) << 1);
            if (obj2 == null || i3 > iAbs) {
                i3 = iAbs;
                obj = obj3;
            } else {
                obj = obj2;
            }
            i4++;
            obj2 = obj;
        }
        return obj2;
    }

    protected final ra a(ra[] raVarArr, int i) {
        return (ra) a(raVarArr, i, new py(this));
    }

    protected static Typeface a(Context context, InputStream inputStream) {
        Typeface typefaceCreateFromFile = null;
        File fileA = qb.a(context);
        if (fileA != null) {
            try {
                if (qb.a(fileA, inputStream)) {
                    typefaceCreateFromFile = Typeface.createFromFile(fileA.getPath());
                }
            } catch (RuntimeException e) {
            } finally {
                fileA.delete();
            }
        }
        return typefaceCreateFromFile;
    }

    public Typeface a(Context context, CancellationSignal cancellationSignal, ra[] raVarArr, int i) throws Throwable {
        InputStream inputStreamOpenInputStream;
        Throwable th;
        Typeface typefaceA = null;
        if (raVarArr.length > 0) {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(a(raVarArr, i).a);
                try {
                    typefaceA = a(context, inputStreamOpenInputStream);
                    qb.a(inputStreamOpenInputStream);
                } catch (IOException e) {
                    qb.a(inputStreamOpenInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    qb.a(inputStreamOpenInputStream);
                    throw th;
                }
            } catch (IOException e2) {
                inputStreamOpenInputStream = null;
            } catch (Throwable th3) {
                inputStreamOpenInputStream = null;
                th = th3;
            }
        }
        return typefaceA;
    }

    public Typeface a(Context context, pd pdVar, Resources resources, int i) {
        pe peVar = (pe) a(pdVar.a, i, new pz(this));
        if (peVar == null) {
            return null;
        }
        return ps.a(context, resources, peVar.f, peVar.a, i);
    }

    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface typefaceCreateFromFile = null;
        File fileA = qb.a(context);
        if (fileA != null) {
            try {
                if (qb.a(fileA, resources, i)) {
                    typefaceCreateFromFile = Typeface.createFromFile(fileA.getPath());
                }
            } catch (RuntimeException e) {
            } finally {
                fileA.delete();
            }
        }
        return typefaceCreateFromFile;
    }
}
