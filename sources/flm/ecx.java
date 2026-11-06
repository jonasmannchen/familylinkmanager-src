package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecx {
    public final eeh a;
    public final String b;

    public ecx(eeh eehVar, String str) {
        this.a = (eeh) eel.a(eehVar, "parser");
        this.b = (String) eel.a(str, "message");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ecx)) {
            return false;
        }
        ecx ecxVar = (ecx) obj;
        return this.a.equals(ecxVar.a) && this.b.equals(ecxVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
