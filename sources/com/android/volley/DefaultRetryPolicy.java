package com.android.volley;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DefaultRetryPolicy implements RetryPolicy {
    private int a;
    private int b;
    private final int c;
    private final float d;

    public DefaultRetryPolicy() {
        this(2500, 1, 1.0f);
    }

    public DefaultRetryPolicy(int i, int i2, float f) {
        this.a = i;
        this.c = i2;
        this.d = f;
    }

    @Override // com.android.volley.RetryPolicy
    public int getCurrentTimeout() {
        return this.a;
    }

    @Override // com.android.volley.RetryPolicy
    public int getCurrentRetryCount() {
        return this.b;
    }

    @Override // com.android.volley.RetryPolicy
    public void retry(VolleyError volleyError) throws VolleyError {
        this.b++;
        this.a += (int) (this.a * this.d);
        if (!(this.b <= this.c)) {
            throw volleyError;
        }
    }
}
