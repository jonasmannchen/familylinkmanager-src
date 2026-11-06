package com.android.volley.toolbox;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class HttpResponse {
    private final int a;
    private final List b;
    private final int c;
    private final InputStream d;

    public HttpResponse(int i, List list) {
        this(i, list, -1, null);
    }

    public HttpResponse(int i, List list, int i2, InputStream inputStream) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = inputStream;
    }

    public final int getStatusCode() {
        return this.a;
    }

    public final List getHeaders() {
        return Collections.unmodifiableList(this.b);
    }

    public final int getContentLength() {
        return this.c;
    }

    public final InputStream getContent() {
        return this.d;
    }
}
