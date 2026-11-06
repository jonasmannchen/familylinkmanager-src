package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import flm.aqf;
import flm.bdi;
import flm.bif;
import flm.bii;
import flm.blq;
import flm.blt;
import flm.blw;
import flm.blx;
import flm.bly;
import flm.blz;
import flm.bma;
import flm.bmb;
import flm.bmc;
import flm.bmd;
import flm.bme;
import flm.bmf;
import flm.bmg;
import flm.bmh;
import flm.bmi;
import flm.bmj;
import flm.bmk;
import flm.bml;
import flm.bmn;
import flm.bmo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {
    public static final bmh b;
    private static Boolean d;
    private static bmk e;
    private static bmn f;
    private static String g;
    public final Context c;
    private static int h = -1;
    private static final ThreadLocal i = new ThreadLocal();
    private static final bmi j = new blw();
    public static final bmh a = new blx();

    /* JADX INFO: compiled from: PG */
    @DynamiteApi
    public class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static DynamiteModule a(Context context, bmh bmhVar, String str) {
        bme bmeVar = (bme) i.get();
        bme bmeVar2 = new bme();
        i.set(bmeVar2);
        try {
            bmj bmjVarA = bmhVar.a(context, str, j);
            new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length()).append("Considering local module ").append(str).append(":").append(bmjVarA.a).append(" and remote module ").append(str).append(":").append(bmjVarA.b);
            if (bmjVarA.c == 0 || ((bmjVarA.c == -1 && bmjVarA.a == 0) || (bmjVarA.c == 1 && bmjVarA.b == 0))) {
                throw new bmg(new StringBuilder(91).append("No acceptable module found. Local version is ").append(bmjVarA.a).append(" and remote version is ").append(bmjVarA.b).append(".").toString());
            }
            if (bmjVarA.c == -1) {
                DynamiteModule dynamiteModuleB = b(context, str);
                if (bmeVar2.a != null) {
                    bmeVar2.a.close();
                }
                i.set(bmeVar);
                return dynamiteModuleB;
            }
            if (bmjVarA.c != 1) {
                throw new bmg(new StringBuilder(47).append("VersionPolicy returned invalid code:").append(bmjVarA.c).toString());
            }
            try {
                DynamiteModule dynamiteModuleA = a(context, str, bmjVarA.b);
                if (bmeVar2.a != null) {
                    bmeVar2.a.close();
                }
                i.set(bmeVar);
                return dynamiteModuleA;
            } catch (bmg e2) {
                String strValueOf = String.valueOf(e2.getMessage());
                Log.w("DynamiteModule", strValueOf.length() != 0 ? "Failed to load remote module: ".concat(strValueOf) : new String("Failed to load remote module: "));
                if (bmjVarA.a == 0 || bmhVar.a(context, str, new bmf(bmjVarA.a, 0)).c != -1) {
                    throw new bmg("Remote load failed. No local fallback found.", e2);
                }
                DynamiteModule dynamiteModuleB2 = b(context, str);
                if (bmeVar2.a != null) {
                    bmeVar2.a.close();
                }
                i.set(bmeVar);
                return dynamiteModuleB2;
            }
        } catch (Throwable th) {
            if (bmeVar2.a != null) {
                bmeVar2.a.close();
            }
            i.set(bmeVar);
            throw th;
        }
    }

    public static int a(Context context, String str) {
        int i2;
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass(new StringBuilder(String.valueOf(str).length() + 61).append("com.google.android.gms.dynamite.descriptors.").append(str).append(".ModuleDescriptor").toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (!declaredField.get(null).equals(str)) {
                String strValueOf = String.valueOf(declaredField.get(null));
                Log.e("DynamiteModule", new StringBuilder(String.valueOf(strValueOf).length() + 51 + String.valueOf(str).length()).append("Module descriptor id '").append(strValueOf).append("' didn't match expected id '").append(str).append("'").toString());
                i2 = 0;
            } else {
                i2 = declaredField2.getInt(null);
            }
            return i2;
        } catch (ClassNotFoundException e2) {
            Log.w("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 45).append("Local module descriptor class for ").append(str).append(" not found.").toString());
            return 0;
        } catch (Exception e3) {
            String strValueOf2 = String.valueOf(e3.getMessage());
            Log.e("DynamiteModule", strValueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(strValueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static int a(Context context, String str, boolean z) {
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = d;
                if (bool == null) {
                    try {
                        Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                        Field declaredField = clsLoadClass.getDeclaredField("sClassLoader");
                        synchronized (clsLoadClass) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader != null) {
                                    if (classLoader == ClassLoader.getSystemClassLoader()) {
                                        bool = Boolean.FALSE;
                                    } else {
                                        try {
                                            a(classLoader);
                                        } catch (bmg e2) {
                                        }
                                        bool = Boolean.TRUE;
                                    }
                                } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                } else {
                                    try {
                                        int iC = c(context, str, z);
                                        if (g != null && !g.isEmpty()) {
                                            bmd bmdVar = new bmd(g, ClassLoader.getSystemClassLoader());
                                            a(bmdVar);
                                            declaredField.set(null, bmdVar);
                                            d = Boolean.TRUE;
                                            return iC;
                                        }
                                        return iC;
                                    } catch (bmg e3) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                                d = bool;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e4) {
                        String strValueOf = String.valueOf(e4);
                        Log.w("DynamiteModule", new StringBuilder(String.valueOf(strValueOf).length() + 30).append("Failed to load module via V2: ").append(strValueOf).toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return c(context, str, z);
                    } catch (bmg e5) {
                        String strValueOf2 = String.valueOf(e5.getMessage());
                        Log.w("DynamiteModule", strValueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(strValueOf2) : new String("Failed to retrieve remote module version: "));
                        return 0;
                    }
                }
                return b(context, str, z);
            }
        } catch (Throwable th2) {
            if (!bif.a()) {
                bii.a(context, th2);
            }
            throw th2;
        }
    }

    private static int b(Context context, String str, boolean z) {
        int iA;
        bmk bmkVarA = a(context);
        if (bmkVarA == null) {
            return 0;
        }
        try {
            if (bmkVarA.a() >= 2) {
                iA = bmkVarA.b(blt.a(context), str, z);
            } else {
                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                iA = bmkVarA.a(blt.a(context), str, z);
            }
            return iA;
        } catch (RemoteException e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            Log.w("DynamiteModule", strValueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(strValueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    private static int c(Context context, String str, boolean z) throws Throwable {
        Cursor cursor = null;
        try {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                String str2 = z ? "api_force_staging" : "api";
                Cursor cursorQuery = contentResolver.query(Uri.parse(new StringBuilder(String.valueOf(str2).length() + 42 + String.valueOf(str).length()).append("content://com.google.android.gms.chimera/").append(str2).append("/").append(str).toString()), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int i2 = cursorQuery.getInt(0);
                            if (i2 > 0) {
                                synchronized (DynamiteModule.class) {
                                    g = cursorQuery.getString(2);
                                    int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        h = cursorQuery.getInt(columnIndex);
                                    }
                                }
                                bme bmeVar = (bme) i.get();
                                if (bmeVar != null && bmeVar.a == null) {
                                    bmeVar.a = cursorQuery;
                                    cursorQuery = null;
                                }
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i2;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        if (e instanceof bmg) {
                            throw e;
                        }
                        throw new bmg("V2 version check failed", e);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new bmg("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e3) {
                e = e3;
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private static DynamiteModule b(Context context, String str) {
        String strValueOf = String.valueOf(str);
        if (strValueOf.length() != 0) {
            "Selected local version of ".concat(strValueOf);
        } else {
            new String("Selected local version of ");
        }
        return new DynamiteModule(context.getApplicationContext());
    }

    private static DynamiteModule a(Context context, String str, int i2) throws bmg {
        Boolean bool;
        blq blqVarA;
        try {
            synchronized (DynamiteModule.class) {
                bool = d;
            }
            if (bool == null) {
                throw new bmg("Failed to determine which loading route to use.");
            }
            if (bool.booleanValue()) {
                return b(context, str, i2);
            }
            new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i2);
            bmk bmkVarA = a(context);
            if (bmkVarA == null) {
                throw new bmg("Failed to create IDynamiteLoader.");
            }
            if (bmkVarA.a() >= 2) {
                blqVarA = bmkVarA.b(blt.a(context), str, i2);
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                blqVarA = bmkVarA.a(blt.a(context), str, i2);
            }
            if (blt.a(blqVarA) == null) {
                throw new bmg("Failed to load remote module.");
            }
            return new DynamiteModule((Context) blt.a(blqVarA));
        } catch (RemoteException e2) {
            throw new bmg("Failed to load remote module.", e2);
        } catch (bmg e3) {
            throw e3;
        } catch (Throwable th) {
            if (!bif.a()) {
                bii.a(context, th);
                throw new bmg("Failed to load remote module.", th);
            }
            throw th;
        }
    }

    private static bmk a(Context context) {
        synchronized (DynamiteModule.class) {
            if (e != null) {
                return e;
            }
            if (aqf.d.a(context) != 0) {
                return null;
            }
            try {
                bmk bmkVarA = bml.a((IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance());
                if (bmkVarA != null) {
                    e = bmkVarA;
                    return bmkVarA;
                }
            } catch (Exception e2) {
                String strValueOf = String.valueOf(e2.getMessage());
                Log.e("DynamiteModule", strValueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(strValueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    private static DynamiteModule b(Context context, String str, int i2) throws bmg {
        bmn bmnVar;
        blq blqVarA;
        new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i2);
        synchronized (DynamiteModule.class) {
            bmnVar = f;
        }
        if (bmnVar == null) {
            throw new bmg("DynamiteLoaderV2 was not cached.");
        }
        bme bmeVar = (bme) i.get();
        if (bmeVar == null || bmeVar.a == null) {
            throw new bmg("No result cursor");
        }
        Context applicationContext = context.getApplicationContext();
        Cursor cursor = bmeVar.a;
        blt.a((Object) null);
        if (a().booleanValue()) {
            blqVarA = bmnVar.b(blt.a(applicationContext), str, i2, blt.a(cursor));
        } else {
            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
            blqVarA = bmnVar.a(blt.a(applicationContext), str, i2, blt.a(cursor));
        }
        Context context2 = (Context) blt.a(blqVarA);
        if (context2 == null) {
            throw new bmg("Failed to get module context");
        }
        return new DynamiteModule(context2);
    }

    private static Boolean a() {
        Boolean boolValueOf;
        synchronized (DynamiteModule.class) {
            boolValueOf = Boolean.valueOf(h >= 2);
        }
        return boolValueOf;
    }

    private static void a(ClassLoader classLoader) throws bmg {
        try {
            f = bmo.a((IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new bmg("Failed to instantiate dynamite loader", e2);
        }
    }

    public final IBinder a(String str) throws bmg {
        try {
            return (IBinder) this.c.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String strValueOf = String.valueOf(str);
            throw new bmg(strValueOf.length() != 0 ? "Failed to instantiate module class: ".concat(strValueOf) : new String("Failed to instantiate module class: "), e2);
        }
    }

    private DynamiteModule(Context context) {
        this.c = (Context) bdi.checkNotNull(context);
    }

    static {
        new bly();
        new blz();
        b = new bma();
        new bmb();
        new bmc();
    }
}
