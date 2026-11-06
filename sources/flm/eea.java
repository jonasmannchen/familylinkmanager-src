package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eea extends eeb {
    private final edz c;

    public eea(ebw ebwVar, int i, edz edzVar) {
        super(ebwVar, i);
        this.c = edzVar;
        ebwVar.a(new StringBuilder("%")).append(ebwVar.b() ? 'T' : 't').append(edzVar.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.eeb
    public final void a(eec eecVar, Object obj) {
        eecVar.a(obj, this.c, this.b);
    }
}
