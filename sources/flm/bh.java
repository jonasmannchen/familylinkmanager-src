package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bh {
    private final bj a;
    private final bl b;

    public bh(bl blVar, bj bjVar) {
        this.a = bjVar;
        this.b = blVar;
    }

    public final bg a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String str = "android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName;
        bg bgVar = (bg) this.b.a.get(str);
        if (!cls.isInstance(bgVar)) {
            bg bgVarA = this.a.a(cls);
            bg bgVar2 = (bg) this.b.a.put(str, bgVarA);
            if (bgVar2 != null) {
                bgVar2.a();
            }
            return bgVarA;
        }
        return bgVar;
    }
}
