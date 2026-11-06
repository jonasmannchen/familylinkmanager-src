package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dp {
    public static final int a = 1;
    private static final int be = 2;
    public static final int b = 3;
    public static final int c = 4;
    public static final int d = 5;
    private static final /* synthetic */ int[] bf = {a, be, b, c, d};
    public static final int e = 1;
    public static final int f = 2;
    public static final /* synthetic */ int[] g = {e, f};
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final /* synthetic */ int[] k = {h, i, j};
    public static final /* synthetic */ String[] v = {"NONE", "LEFT", "TOP", "RIGHT", "BOTTOM", "BASELINE", "CENTER", "CENTER_X", "CENTER_Y"};
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 3;
    public static final int o = 4;
    public static final int p = 5;
    public static final int q = 6;
    public static final int r = 7;
    public static final int s = 8;
    public static final int t = 9;
    public static final /* synthetic */ int[] u = {l, m, n, o, p, q, r, s, t};
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 3;
    public static final int z = 4;
    public static final /* synthetic */ int[] A = {w, x, y, z};
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 3;
    public static final /* synthetic */ int[] E = {B, C, D};
    public static final int F = 1;
    public static final int G = 2;
    public static final int H = 3;
    public static final /* synthetic */ int[] I = {F, G, H};
    public static final int J = 1;
    public static final int K = 2;
    public static final /* synthetic */ int[] L = {J, K};
    public static final int M = 1;
    public static final int N = 2;
    public static final int O = 3;
    public static final int P = 4;
    public static final /* synthetic */ int[] Q = {M, N, O, P};
    public static final int R = 1;
    public static final int S = 2;
    public static final /* synthetic */ int[] T = {R, S};
    public static final int U = 1;
    public static final int V = 2;
    public static final int W = 3;
    public static final /* synthetic */ int[] X = {U, V, W};
    public static final int Y = 1;
    public static final int Z = 2;
    public static final int aa = 3;
    public static final /* synthetic */ int[] ab = {Y, Z, aa};
    public static final int ac = 1;
    public static final int ad = 2;
    public static final int ae = 3;
    public static final /* synthetic */ int[] af = {ac, ad, ae};
    public static final int ag = 1;
    public static final int ah = 2;
    public static final int ai = 3;
    public static final int aj = 4;
    public static final /* synthetic */ int[] ak = {ag, ah, ai, aj};
    public static final int al = 1;
    public static final int am = 2;
    public static final int an = 3;
    public static final int ao = 4;
    public static final /* synthetic */ int[] ap = {al, am, an, ao};
    public static final int aq = 1;
    public static final int ar = 2;
    public static final int as = 3;
    public static final int at = 4;
    public static final int au = 5;
    public static final int av = 6;
    public static final int aw = 7;
    public static final /* synthetic */ int[] ax = {aq, ar, as, at, au, av, aw};
    public static final int ay = 1;
    public static final int az = 2;
    public static final /* synthetic */ int[] aA = {ay, az};
    public static final int aB = 1;
    public static final int aC = 2;
    public static final /* synthetic */ int[] aD = {aB, aC};
    public static final int aE = 1;
    public static final int aF = 2;
    public static final int aG = 3;
    public static final int aH = 4;
    public static final int aI = 5;
    public static final /* synthetic */ int[] aJ = {aE, aF, aG, aH, aI};
    public static final int aK = 1;
    public static final int aL = 2;
    public static final int aM = 3;
    public static final /* synthetic */ int[] aN = {aK, aL, aM};
    public static final int aO = 1;
    public static final int aP = 2;
    public static final int aQ = 3;
    public static final int aR = 4;
    public static final int aS = 5;
    public static final int aT = 6;
    public static final /* synthetic */ int[] aU = {aO, aP, aQ, aR, aS, aT};
    public static final int aV = 1;
    public static final int aW = 2;
    public static final int aX = 3;
    public static final /* synthetic */ int[] aY = {aV, aW, aX};
    public static final int aZ = 1;
    public static final int ba = 2;
    public static final int bb = 3;
    public static final int bc = 4;
    public static final /* synthetic */ int[] bd = {aZ, ba, bb, bc};

    public static grf a(int i2) {
        if (i2 == 0) {
            throw null;
        }
        switch (i2 - 1) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return grf.UNKNOWN_STATUS;
            case 1:
                return grf.SUCCESS;
            case 2:
                return grf.ERROR;
            case 3:
                return grf.CANCEL;
            default:
                return grf.UNKNOWN_STATUS;
        }
    }
}
