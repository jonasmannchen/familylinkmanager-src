package com.android.volley.toolbox;

import flm.ajz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ByteArrayPool {
    private static final Comparator e = new ajz();
    private final List a = new ArrayList();
    private final List b = new ArrayList(64);
    private int c = 0;
    private final int d;

    public ByteArrayPool(int i) {
        this.d = i;
    }

    public synchronized byte[] getBuf(int i) {
        byte[] bArr;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < this.b.size()) {
                bArr = (byte[]) this.b.get(i3);
                if (bArr.length >= i) {
                    this.c -= bArr.length;
                    this.b.remove(i3);
                    this.a.remove(bArr);
                    break;
                }
                i2 = i3 + 1;
            } else {
                bArr = new byte[i];
                break;
            }
        }
        return bArr;
    }

    public synchronized void returnBuf(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.d) {
                this.a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.b, bArr, e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.b.add(iBinarySearch, bArr);
                this.c += bArr.length;
                a();
            }
        }
    }

    private final synchronized void a() {
        while (this.c > this.d) {
            byte[] bArr = (byte[]) this.a.remove(0);
            this.b.remove(bArr);
            this.c -= bArr.length;
        }
    }
}
