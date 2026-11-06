package flm;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dc extends ViewGroup.MarginLayoutParams {
    public float A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public float W;
    public dr X;
    private int Y;
    public int a;
    public int b;
    public float c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public float x;
    public String y;
    public float z;

    public dc(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0.5f;
        this.x = 0.5f;
        this.y = null;
        this.Y = 1;
        this.z = 0.0f;
        this.A = 0.0f;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = true;
        this.N = true;
        this.O = false;
        this.P = false;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = 0.5f;
        this.X = new dr();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dg.a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == dg.y) {
                this.d = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
                if (this.d == -1) {
                    this.d = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == dg.z) {
                this.e = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                if (this.e == -1) {
                    this.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == dg.B) {
                this.f = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                if (this.f == -1) {
                    this.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == dg.C) {
                this.g = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                if (this.g == -1) {
                    this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == dg.H) {
                this.h = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                if (this.h == -1) {
                    this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == dg.G) {
                this.i = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                if (this.i == -1) {
                    this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == dg.k) {
                this.j = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                if (this.j == -1) {
                    this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == dg.j) {
                this.k = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                if (this.k == -1) {
                    this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == dg.h) {
                this.l = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                if (this.l == -1) {
                    this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == dg.O) {
                this.J = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.J);
            } else if (index == dg.P) {
                this.K = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.K);
            } else if (index == dg.o) {
                this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.a);
            } else if (index == dg.p) {
                this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.b);
            } else if (index == dg.q) {
                this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
            } else if (index == dg.f) {
                this.L = typedArrayObtainStyledAttributes.getInt(index, this.L);
            } else if (index == dg.D) {
                this.m = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                if (this.m == -1) {
                    this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == dg.E) {
                this.n = typedArrayObtainStyledAttributes.getResourceId(index, this.n);
                if (this.n == -1) {
                    this.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == dg.n) {
                this.o = typedArrayObtainStyledAttributes.getResourceId(index, this.o);
                if (this.o == -1) {
                    this.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == dg.m) {
                this.p = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                if (this.p == -1) {
                    this.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == dg.S) {
                this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.q);
            } else if (index == dg.V) {
                this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.r);
            } else if (index == dg.T) {
                this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.s);
            } else if (index == dg.Q) {
                this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.t);
            } else if (index == dg.U) {
                this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.u);
            } else if (index == dg.R) {
                this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.v);
            } else if (index == dg.u) {
                this.w = typedArrayObtainStyledAttributes.getFloat(index, this.w);
            } else if (index == dg.I) {
                this.x = typedArrayObtainStyledAttributes.getFloat(index, this.x);
            } else if (index == dg.l) {
                this.y = typedArrayObtainStyledAttributes.getString(index);
                this.Y = -1;
                if (this.y != null) {
                    int length = this.y.length();
                    int iIndexOf = this.y.indexOf(44);
                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                        i = 0;
                    } else {
                        String strSubstring = this.y.substring(0, iIndexOf);
                        if (strSubstring.equalsIgnoreCase("W")) {
                            this.Y = 0;
                        } else if (strSubstring.equalsIgnoreCase("H")) {
                            this.Y = 1;
                        }
                        i = iIndexOf + 1;
                    }
                    int iIndexOf2 = this.y.indexOf(58);
                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                        String strSubstring2 = this.y.substring(i);
                        if (strSubstring2.length() > 0) {
                            try {
                                Float.parseFloat(strSubstring2);
                            } catch (NumberFormatException e) {
                            }
                        }
                    } else {
                        String strSubstring3 = this.y.substring(i, iIndexOf2);
                        String strSubstring4 = this.y.substring(iIndexOf2 + 1);
                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                            try {
                                float f = Float.parseFloat(strSubstring3);
                                float f2 = Float.parseFloat(strSubstring4);
                                if (f > 0.0f && f2 > 0.0f) {
                                    if (this.Y == 1) {
                                        Math.abs(f2 / f);
                                    } else {
                                        Math.abs(f / f2);
                                    }
                                }
                            } catch (NumberFormatException e2) {
                            }
                        }
                    }
                }
            } else if (index == dg.w) {
                this.z = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
            } else if (index == dg.K) {
                this.A = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
            } else if (index == dg.v) {
                this.B = typedArrayObtainStyledAttributes.getInt(index, 0);
            } else if (index == dg.J) {
                this.C = typedArrayObtainStyledAttributes.getInt(index, 0);
            } else if (index == dg.L) {
                this.D = typedArrayObtainStyledAttributes.getInt(index, 0);
            } else if (index == dg.r) {
                this.E = typedArrayObtainStyledAttributes.getInt(index, 0);
            } else if (index == dg.N) {
                this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
            } else if (index == dg.M) {
                this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
            } else if (index == dg.t) {
                this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
            } else if (index == dg.s) {
                this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
            } else if (index == dg.x || index == dg.F || index == dg.A || index != dg.i) {
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        a();
    }

    public final void a() {
        this.P = false;
        this.M = true;
        this.N = true;
        if (this.width == 0 || this.width == -1) {
            this.M = false;
        }
        if (this.height == 0 || this.height == -1) {
            this.N = false;
        }
        if (this.c != -1.0f || this.a != -1 || this.b != -1) {
            this.P = true;
            this.M = true;
            this.N = true;
            if (!(this.X instanceof dt)) {
                this.X = new dt();
            }
            ((dt) this.X).h(this.L);
        }
    }

    public dc(int i, int i2) {
        super(-2, -2);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0.5f;
        this.x = 0.5f;
        this.y = null;
        this.Y = 1;
        this.z = 0.0f;
        this.A = 0.0f;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = true;
        this.N = true;
        this.O = false;
        this.P = false;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = 0.5f;
        this.X = new dr();
    }

    public dc(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0.5f;
        this.x = 0.5f;
        this.y = null;
        this.Y = 1;
        this.z = 0.0f;
        this.A = 0.0f;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = true;
        this.N = true;
        this.O = false;
        this.P = false;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = 0.5f;
        this.X = new dr();
    }

    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    @TargetApi(17)
    public final void resolveLayoutDirection(int i) {
        super.resolveLayoutDirection(i);
        this.S = -1;
        this.T = -1;
        this.Q = -1;
        this.R = -1;
        this.U = -1;
        this.V = -1;
        this.U = this.q;
        this.V = this.s;
        this.W = this.w;
        if (1 == getLayoutDirection()) {
            if (this.m != -1) {
                this.S = this.m;
            } else if (this.n != -1) {
                this.T = this.n;
            }
            if (this.o != -1) {
                this.R = this.o;
            }
            if (this.p != -1) {
                this.Q = this.p;
            }
            if (this.u != -1) {
                this.V = this.u;
            }
            if (this.v != -1) {
                this.U = this.v;
            }
            this.W = 1.0f - this.w;
        } else {
            if (this.m != -1) {
                this.R = this.m;
            }
            if (this.n != -1) {
                this.Q = this.n;
            }
            if (this.o != -1) {
                this.S = this.o;
            }
            if (this.p != -1) {
                this.T = this.p;
            }
            if (this.u != -1) {
                this.U = this.u;
            }
            if (this.v != -1) {
                this.V = this.v;
            }
        }
        if (this.o == -1 && this.p == -1) {
            if (this.f != -1) {
                this.S = this.f;
            } else if (this.g != -1) {
                this.T = this.g;
            }
        }
        if (this.n == -1 && this.m == -1) {
            if (this.d != -1) {
                this.Q = this.d;
            } else if (this.e != -1) {
                this.R = this.e;
            }
        }
    }
}
