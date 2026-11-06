package flm;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cq extends bq {
    private cf b;
    private final cr c;
    private final String d;
    private final String e;

    public cq(cf cfVar, cr crVar, String str, String str2) {
        super(crVar.a);
        this.b = cfVar;
        this.c = crVar;
        this.d = str;
        this.e = str2;
    }

    @Override // flm.bq
    public final void a(bo boVar) {
        c(boVar);
        this.c.b(boVar);
        this.c.d(boVar);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076 A[LOOP:1: B:18:0x0033->B:40:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:61:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e0 A[SYNTHETIC] */
    @Override // flm.bq
    public final void a(bo boVar, int i, int i2) {
        boolean z;
        List listEmptyList;
        sp spVar;
        int iC;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int iA;
        if (this.b == null) {
            z = false;
        } else {
            cp cpVar = this.b.d;
            if (i == i2) {
                listEmptyList = Collections.emptyList();
            } else {
                boolean z3 = i2 > i;
                ArrayList arrayList = new ArrayList();
                int i6 = z3 ? -1 : 1;
                int i7 = i;
                while (true) {
                    if (z3) {
                        if (i7 >= i2) {
                            listEmptyList = arrayList;
                            break;
                        }
                        spVar = (sp) cpVar.a.a(i7, null);
                        if (spVar == null) {
                            listEmptyList = null;
                            break;
                        }
                        iC = spVar.c();
                        if (z3) {
                            i3 = iC - 1;
                            iC = -1;
                        } else {
                            i3 = 0;
                        }
                        i4 = i3;
                        while (true) {
                            if (i4 == iC) {
                                z2 = false;
                                i5 = i7;
                                break;
                            }
                            iA = spVar.a(i4);
                            if (iA > i2 && iA > i7) {
                                arrayList.add(spVar.b(i4));
                                z2 = true;
                                i5 = iA;
                                break;
                            }
                            i4 += i6;
                        }
                        if (!z2) {
                            listEmptyList = null;
                            break;
                        }
                        i7 = i5;
                    } else {
                        if (i7 <= i2) {
                            listEmptyList = arrayList;
                            break;
                        }
                        spVar = (sp) cpVar.a.a(i7, null);
                        if (spVar == null) {
                            listEmptyList = null;
                            break;
                        }
                        iC = spVar.c();
                        if (z3) {
                            i3 = iC - 1;
                            iC = -1;
                        } else {
                            i3 = 0;
                        }
                        i4 = i3;
                        while (true) {
                            if (i4 == iC) {
                                z2 = false;
                                i5 = i7;
                                break;
                            } else {
                                iA = spVar.a(i4);
                                if (iA > i2) {
                                }
                                i4 += i6;
                            }
                        }
                        if (!z2) {
                            listEmptyList = null;
                            break;
                        }
                        i7 = i5;
                    }
                }
            }
            if (listEmptyList == null) {
                z = false;
            } else {
                Iterator it = listEmptyList.iterator();
                while (it.hasNext()) {
                    ((cu) it.next()).a(boVar);
                }
                this.c.e(boVar);
                c(boVar);
                z = true;
            }
        }
        if (!z) {
            if (this.b != null) {
                cf cfVar = this.b;
                if (!(cfVar.g && (cfVar.h == null || !cfVar.h.contains(Integer.valueOf(i))))) {
                    this.c.a(boVar);
                    this.c.b(boVar);
                    return;
                }
            }
            throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
    }

    @Override // flm.bq
    public final void b(bo boVar, int i, int i2) {
        a(boVar, i, i2);
    }

    @Override // flm.bq
    public final void b(bo boVar) {
        super.b(boVar);
        d(boVar);
        String string = "";
        Cursor cursorA = boVar.a(new bn("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            if (cursorA.moveToFirst()) {
                string = cursorA.getString(0);
            }
            cursorA.close();
            if (!this.d.equals(string) && !this.e.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
            this.c.c(boVar);
            this.b = null;
        } catch (Throwable th) {
            cursorA.close();
            throw th;
        }
    }

    private final void c(bo boVar) {
        d(boVar);
        boVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"" + this.d + "\")");
    }

    private static void d(bo boVar) {
        boVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }
}
