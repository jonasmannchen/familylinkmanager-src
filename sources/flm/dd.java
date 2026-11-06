package flm;

import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.kids.aidl.IKidsInternalService;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dd {
    private static final int[] b = {0, 4, 8};
    private static SparseIntArray c;
    public HashMap a = new HashMap();

    private static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    public static void a(de deVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (c.get(index)) {
                case 1:
                    deVar.p = a(typedArray, index, deVar.p);
                    break;
                case 2:
                    deVar.D = typedArray.getDimensionPixelSize(index, deVar.D);
                    break;
                case 3:
                    deVar.o = a(typedArray, index, deVar.o);
                    break;
                case 4:
                    deVar.n = a(typedArray, index, deVar.n);
                    break;
                case 5:
                    deVar.w = typedArray.getString(index);
                    break;
                case 6:
                    deVar.x = typedArray.getDimensionPixelOffset(index, deVar.x);
                    break;
                case 7:
                    deVar.y = typedArray.getDimensionPixelOffset(index, deVar.y);
                    break;
                case 8:
                    deVar.E = typedArray.getDimensionPixelSize(index, deVar.E);
                    break;
                case 9:
                    deVar.n = a(typedArray, index, deVar.t);
                    break;
                case 10:
                    deVar.s = a(typedArray, index, deVar.s);
                    break;
                case 11:
                    deVar.K = typedArray.getDimensionPixelSize(index, deVar.K);
                    break;
                case 12:
                    deVar.L = typedArray.getDimensionPixelSize(index, deVar.L);
                    break;
                case 13:
                    deVar.H = typedArray.getDimensionPixelSize(index, deVar.H);
                    break;
                case 14:
                    deVar.J = typedArray.getDimensionPixelSize(index, deVar.J);
                    break;
                case 15:
                    deVar.M = typedArray.getDimensionPixelSize(index, deVar.M);
                    break;
                case 16:
                    deVar.I = typedArray.getDimensionPixelSize(index, deVar.I);
                    break;
                case 17:
                    deVar.e = typedArray.getDimensionPixelOffset(index, deVar.e);
                    break;
                case 18:
                    deVar.f = typedArray.getDimensionPixelOffset(index, deVar.f);
                    break;
                case 19:
                    deVar.g = typedArray.getFloat(index, deVar.g);
                    break;
                case 20:
                    deVar.u = typedArray.getFloat(index, deVar.u);
                    break;
                case 21:
                    deVar.c = typedArray.getLayoutDimension(index, deVar.c);
                    break;
                case 22:
                    deVar.G = typedArray.getInt(index, deVar.G);
                    deVar.G = b[deVar.G];
                    break;
                case 23:
                    deVar.b = typedArray.getLayoutDimension(index, deVar.b);
                    break;
                case 24:
                    deVar.A = typedArray.getDimensionPixelSize(index, deVar.A);
                    break;
                case 25:
                    deVar.h = a(typedArray, index, deVar.h);
                    break;
                case 26:
                    deVar.i = a(typedArray, index, deVar.i);
                    break;
                case 27:
                    deVar.z = typedArray.getInt(index, deVar.z);
                    break;
                case 28:
                    deVar.B = typedArray.getDimensionPixelSize(index, deVar.B);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_verifyParentAccessCode /* 29 */:
                    deVar.j = a(typedArray, index, deVar.j);
                    break;
                case 30:
                    deVar.k = a(typedArray, index, deVar.k);
                    break;
                case 31:
                    deVar.F = typedArray.getDimensionPixelSize(index, deVar.F);
                    break;
                case 32:
                    deVar.q = a(typedArray, index, deVar.q);
                    break;
                case 33:
                    deVar.r = a(typedArray, index, deVar.r);
                    break;
                case 34:
                    deVar.C = typedArray.getDimensionPixelSize(index, deVar.C);
                    break;
                case 35:
                    deVar.m = a(typedArray, index, deVar.m);
                    break;
                case 36:
                    deVar.l = a(typedArray, index, deVar.l);
                    break;
                case 37:
                    deVar.v = typedArray.getFloat(index, deVar.v);
                    break;
                case 38:
                    deVar.d = typedArray.getResourceId(index, deVar.d);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
                    deVar.O = typedArray.getFloat(index, deVar.O);
                    break;
                case 40:
                    deVar.N = typedArray.getFloat(index, deVar.N);
                    break;
                case 41:
                    deVar.P = typedArray.getInt(index, deVar.P);
                    break;
                case 42:
                    deVar.Q = typedArray.getInt(index, deVar.Q);
                    break;
                case 43:
                    deVar.R = typedArray.getFloat(index, deVar.R);
                    break;
                case 44:
                    deVar.S = true;
                    deVar.T = typedArray.getFloat(index, deVar.T);
                    break;
                case 45:
                    deVar.U = typedArray.getFloat(index, deVar.U);
                    break;
                case 46:
                    deVar.V = typedArray.getFloat(index, deVar.V);
                    break;
                case 47:
                    deVar.W = typedArray.getFloat(index, deVar.W);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                    deVar.X = typedArray.getFloat(index, deVar.X);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_setMemberSvExitState /* 49 */:
                    deVar.Y = typedArray.getFloat(index, deVar.Y);
                    break;
                case 50:
                    deVar.Z = typedArray.getFloat(index, deVar.Z);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_clearLockdownInfo /* 51 */:
                    deVar.aa = typedArray.getFloat(index, deVar.aa);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_listManagedDevices /* 52 */:
                    deVar.ab = typedArray.getFloat(index, deVar.ab);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_logToClearcutFromUi /* 53 */:
                    deVar.ac = typedArray.getFloat(index, deVar.ac);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_getSuwLibraryFlows /* 54 */:
                case IKidsInternalService.Stub.TRANSACTION_getLockdownInfo /* 55 */:
                case IKidsInternalService.Stub.TRANSACTION_setLockdownInfoForPermalock /* 56 */:
                case 57:
                case 58:
                case 59:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + c.get(index));
                    break;
                case 60:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + c.get(index));
                    break;
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.append(dg.aM, 25);
        c.append(dg.aN, 26);
        c.append(dg.aP, 29);
        c.append(dg.aQ, 30);
        c.append(dg.aV, 36);
        c.append(dg.aU, 35);
        c.append(dg.ay, 4);
        c.append(dg.ax, 3);
        c.append(dg.av, 1);
        c.append(dg.bc, 6);
        c.append(dg.bd, 7);
        c.append(dg.aC, 17);
        c.append(dg.aD, 18);
        c.append(dg.aE, 19);
        c.append(dg.aj, 27);
        c.append(dg.aR, 32);
        c.append(dg.aS, 33);
        c.append(dg.aB, 10);
        c.append(dg.aA, 9);
        c.append(dg.bg, 13);
        c.append(dg.bj, 16);
        c.append(dg.bh, 14);
        c.append(dg.be, 11);
        c.append(dg.bi, 15);
        c.append(dg.bf, 12);
        c.append(dg.aY, 40);
        c.append(dg.aK, 39);
        c.append(dg.aJ, 41);
        c.append(dg.aX, 42);
        c.append(dg.aI, 20);
        c.append(dg.aW, 37);
        c.append(dg.az, 5);
        c.append(dg.aL, 60);
        c.append(dg.aT, 60);
        c.append(dg.aO, 60);
        c.append(dg.aw, 60);
        c.append(dg.au, 60);
        c.append(dg.ae, 24);
        c.append(dg.af, 28);
        c.append(dg.ag, 31);
        c.append(dg.ad, 8);
        c.append(dg.ah, 34);
        c.append(dg.ac, 2);
        c.append(dg.ai, 23);
        c.append(dg.ab, 21);
        c.append(dg.at, 22);
        c.append(dg.Y, 43);
        c.append(dg.Z, 44);
        c.append(dg.ak, 45);
        c.append(dg.al, 46);
        c.append(dg.am, 47);
        c.append(dg.an, 48);
        c.append(dg.ao, 49);
        c.append(dg.ap, 50);
        c.append(dg.aq, 51);
        c.append(dg.ar, 52);
        c.append(dg.as, 53);
        c.append(dg.aZ, 54);
        c.append(dg.aF, 55);
        c.append(dg.ba, 56);
        c.append(dg.aG, 57);
        c.append(dg.bb, 58);
        c.append(dg.aH, 59);
        c.append(dg.aa, 38);
    }
}
