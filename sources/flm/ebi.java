package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ebi {
    private final ebj a;
    private final String b;

    ebi(ebj ebjVar, String str) {
        this.a = (ebj) eel.a(ebjVar, "log site");
        this.b = (String) eel.a(str, "log site key");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ebi)) {
            return false;
        }
        ebi ebiVar = (ebi) obj;
        return this.a.equals(ebiVar.a) && this.b.equals(ebiVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String str = this.b;
        return new StringBuilder(String.valueOf(strValueOf).length() + 46 + String.valueOf(str).length()).append("SpecializedLogSiteKey{ logSite=").append(strValueOf).append(", extraKey='").append(str).append("' }").toString();
    }
}
