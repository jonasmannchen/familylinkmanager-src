package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahz {
    public final rt a = new rt();
    public final sa b = new sa();

    public final void a() {
        this.a.clear();
        this.b.d();
    }

    public final void a(agm agmVar, aft aftVar) {
        aia aiaVarA = (aia) this.a.get(agmVar);
        if (aiaVarA == null) {
            aiaVarA = aia.a();
            this.a.put(agmVar, aiaVarA);
        }
        aiaVarA.b = aftVar;
        aiaVarA.a |= 4;
    }

    public final boolean a(agm agmVar) {
        aia aiaVar = (aia) this.a.get(agmVar);
        return (aiaVar == null || (aiaVar.a & 1) == 0) ? false : true;
    }

    public final aft a(agm agmVar, int i) {
        aia aiaVar;
        aft aftVar = null;
        int iA = this.a.a(agmVar);
        if (iA >= 0 && (aiaVar = (aia) this.a.c(iA)) != null && (aiaVar.a & i) != 0) {
            aiaVar.a &= i ^ (-1);
            if (i == 4) {
                aftVar = aiaVar.b;
            } else if (i == 8) {
                aftVar = aiaVar.c;
            } else {
                throw new IllegalArgumentException("Must provide flag PRE or POST");
            }
            if ((aiaVar.a & 12) == 0) {
                this.a.d(iA);
                aia.a(aiaVar);
            }
        }
        return aftVar;
    }

    public final void a(long j, agm agmVar) {
        this.b.b(j, agmVar);
    }

    public final void b(agm agmVar, aft aftVar) {
        aia aiaVarA = (aia) this.a.get(agmVar);
        if (aiaVarA == null) {
            aiaVarA = aia.a();
            this.a.put(agmVar, aiaVarA);
        }
        aiaVarA.c = aftVar;
        aiaVarA.a |= 8;
    }

    final void b(agm agmVar) {
        aia aiaVarA = (aia) this.a.get(agmVar);
        if (aiaVarA == null) {
            aiaVarA = aia.a();
            this.a.put(agmVar, aiaVarA);
        }
        aiaVarA.a |= 1;
    }

    final void c(agm agmVar) {
        aia aiaVar = (aia) this.a.get(agmVar);
        if (aiaVar != null) {
            aiaVar.a &= -2;
        }
    }

    final void d(agm agmVar) {
        for (int iC = this.b.c() - 1; iC >= 0; iC--) {
            if (agmVar == this.b.b(iC)) {
                sa saVar = this.b;
                if (saVar.d[iC] == sa.a) {
                    break;
                }
                saVar.d[iC] = sa.a;
                saVar.b = true;
                break;
            }
        }
        aia aiaVar = (aia) this.a.remove(agmVar);
        if (aiaVar != null) {
            aia.a(aiaVar);
        }
    }
}
