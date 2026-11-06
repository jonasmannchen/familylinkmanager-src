package android.support.v4.app;

import android.os.Bundle;
import android.os.Looper;
import flm.af;
import flm.bg;
import flm.bh;
import flm.bj;
import flm.bl;
import flm.nk;
import flm.nl;
import flm.nm;
import flm.nn;
import flm.no;
import flm.op;
import flm.rx;
import flm.ry;
import flm.sp;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class LoaderManagerImpl extends nk {
    public static boolean a = false;
    private final af b;
    private final LoaderViewModel c;

    public LoaderManagerImpl(af afVar, bl blVar) {
        this.b = afVar;
        this.c = LoaderViewModel.a(blVar);
    }

    /* JADX INFO: compiled from: PG */
    public class LoaderViewModel extends bg {
        private static final bj c = new no();
        public sp a = new sp();
        public boolean b = false;

        static LoaderViewModel a(bl blVar) {
            return (LoaderViewModel) new bh(blVar, c).a(LoaderViewModel.class);
        }

        final nm a(int i) {
            return (nm) this.a.a(i, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // flm.bg
        public final void a() {
            super.a();
            int iC = this.a.c();
            for (int i = 0; i < iC; i++) {
                ((nm) this.a.b(i)).a(true);
            }
            sp spVar = this.a;
            int i2 = spVar.e;
            Object[] objArr = spVar.d;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            spVar.e = 0;
            spVar.b = false;
        }
    }

    private final op a(int i, Bundle bundle, nl nlVar, op opVar) {
        try {
            this.c.b = true;
            op opVarA = nlVar.a();
            if (opVarA.getClass().isMemberClass() && !Modifier.isStatic(opVarA.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + opVarA);
            }
            nm nmVar = new nm(i, bundle, opVarA, null);
            this.c.a.b(i, nmVar);
            this.c.b = false;
            return nmVar.a(this.b, nlVar);
        } catch (Throwable th) {
            this.c.b = false;
            throw th;
        }
    }

    @Override // flm.nk
    public final op a(int i, Bundle bundle, nl nlVar) {
        if (this.c.b) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        nm nmVarA = this.c.a(54321);
        return nmVarA == null ? a(54321, (Bundle) null, nlVar, (op) null) : nmVarA.a(this.b, nlVar);
    }

    @Override // flm.nk
    public final void a(int i) {
        if (this.c.b) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        nm nmVarA = this.c.a(54321);
        if (nmVarA != null) {
            nmVarA.a(true);
            sp spVar = this.c.a;
            int iA = rx.a(spVar.c, spVar.e, 54321);
            if (iA >= 0 && spVar.d[iA] != sp.a) {
                spVar.d[iA] = sp.a;
                spVar.b = true;
            }
        }
    }

    @Override // flm.nk
    public final void a() {
        LoaderViewModel loaderViewModel = this.c;
        int iC = loaderViewModel.a.c();
        for (int i = 0; i < iC; i++) {
            ((nm) loaderViewModel.a.b(i)).e();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ry.a(this.b, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // flm.nk
    @Deprecated
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        LoaderViewModel loaderViewModel = this.c;
        if (loaderViewModel.a.c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < loaderViewModel.a.c()) {
                    nm nmVar = (nm) loaderViewModel.a.b(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(loaderViewModel.a.a(i2));
                    printWriter.print(": ");
                    printWriter.println(nmVar.toString());
                    printWriter.print(str2);
                    printWriter.print("mId=");
                    printWriter.print(nmVar.g);
                    printWriter.print(" mArgs=");
                    printWriter.println(nmVar.h);
                    printWriter.print(str2);
                    printWriter.print("mLoader=");
                    printWriter.println(nmVar.i);
                    nmVar.i.a(str2 + "  ", fileDescriptor, printWriter, strArr);
                    if (nmVar.j != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(nmVar.j);
                        nn nnVar = nmVar.j;
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(nnVar.b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    Object objA = nmVar.a();
                    StringBuilder sb = new StringBuilder(64);
                    ry.a(objA, sb);
                    sb.append("}");
                    printWriter.println(sb.toString());
                    printWriter.print(str2);
                    printWriter.print("mStarted=");
                    printWriter.println(nmVar.d());
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }
}
