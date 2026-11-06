package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyt extends fio implements fkg {
    eyt() {
        super(eys.d);
    }

    public final eyt a(String str) {
        c();
        eys eysVar = (eys) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        eysVar.a |= 2;
        eysVar.b = str;
        return this;
    }

    public final eyt b(String str) {
        c();
        eys eysVar = (eys) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        eysVar.a |= 4;
        eysVar.c = str;
        return this;
    }
}
