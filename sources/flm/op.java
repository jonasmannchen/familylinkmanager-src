package flm;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class op {
    public int c;
    public oq d;
    public Context e;
    public boolean f = false;
    public boolean g = false;
    public boolean h = true;
    public boolean i = false;
    public boolean j = false;

    public op(Context context) {
        this.e = context.getApplicationContext();
    }

    public void a(Object obj) {
        if (this.d != null) {
            this.d.c(obj);
        }
    }

    public void e() {
    }

    public boolean b() {
        return false;
    }

    public void a() {
    }

    public void f() {
    }

    public final void g() {
        this.h = true;
        this.f = false;
        this.g = false;
        this.i = false;
        this.j = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        ry.a(this, sb);
        sb.append(" id=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.c);
        printWriter.print(" mListener=");
        printWriter.println(this.d);
        if (this.f || this.i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.i);
            printWriter.print(" mProcessingChange=");
            printWriter.println(false);
        }
        if (this.g || this.h) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.g);
            printWriter.print(" mReset=");
            printWriter.println(this.h);
        }
    }
}
