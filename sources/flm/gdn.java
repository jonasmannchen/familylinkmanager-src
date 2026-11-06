package flm;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gdn extends fto {
    public ftm a;
    public final fui b;
    public final /* synthetic */ gda c;

    gdn(gda gdaVar, fui fuiVar) {
        this.c = gdaVar;
        this.b = (fui) dvl.a(fuiVar, "NameResolver");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.fto
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fwv a(List list, frd frdVar) {
        dvl.a(list, "addressGroups");
        dvl.a(frdVar, "attrs");
        dvl.b(!this.c.E, "Channel is terminated");
        gdx gdxVar = new gdx(this.c, frdVar);
        fym fymVar = null;
        long jA = this.c.i.a();
        if (this.c.j > 0) {
            fymVar = new fym(this.c.j, jA, "Subchannel");
        }
        gcb gcbVar = new gcb(list, this.c.a(), this.c.s, this.c.r, this.c.e, this.c.e.a(), this.c.o, this.c.k, new gdp(this, gdxVar), this.c.J, this.c.G.a(), fymVar, this.c.i);
        if (this.c.I != null) {
            fym fymVar2 = this.c.I;
            ftb ftbVar = new ftb();
            ftbVar.a = "Child channel created";
            ftbVar.b = ftc.CT_INFO;
            ftb ftbVarA = ftbVar.a(jA);
            ftbVarA.c = gcbVar;
            fymVar2.a(ftbVarA.a());
        }
        fsz.a(this.c.J.d, gcbVar);
        gdxVar.a = gcbVar;
        gda.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImpl$LbHelperImpl", "createSubchannel", "[{0}] {1} created for {2}", new Object[]{this.c.d, gcbVar.b, list});
        a(new gdo(this, gcbVar));
        return gdxVar;
    }

    @Override // flm.fto
    public final void a(fsa fsaVar, fts ftsVar) {
        dvl.a(fsaVar, "newState");
        dvl.a(ftsVar, "newPicker");
        a(new gdq(this, ftsVar, fsaVar));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    @Override // flm.fto
    public final void a(ftr ftrVar, List list) {
        gec gecVar;
        boolean z = true;
        dvl.a(ftrVar instanceof gdx, "subchannel must have been returned from createSubchannel");
        gcb gcbVar = ((gdx) ftrVar).a;
        dvl.a(list, "newAddressGroups");
        gcb.a(list, "newAddressGroups contains null entry");
        dvl.a(!list.isEmpty(), "newAddressGroups is empty");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        try {
            synchronized (gcbVar.g) {
                try {
                    SocketAddress socketAddressB = gcbVar.i.b();
                    gcl gclVar = gcbVar.i;
                    gclVar.a = listUnmodifiableList;
                    gclVar.a();
                    if (gcbVar.r.a == fsa.READY || gcbVar.r.a == fsa.CONNECTING) {
                        gcl gclVar2 = gcbVar.i;
                        int i = 0;
                        while (true) {
                            if (i >= gclVar2.a.size()) {
                                z = false;
                                break;
                            }
                            int iIndexOf = ((fss) gclVar2.a.get(i)).a.indexOf(socketAddressB);
                            if (iIndexOf != -1) {
                                gclVar2.b = i;
                                gclVar2.c = iIndexOf;
                                break;
                            }
                            i++;
                        }
                        if (z) {
                            gecVar = null;
                        } else if (gcbVar.r.a == fsa.READY) {
                            gecVar = gcbVar.q;
                            gcbVar.q = null;
                            gcbVar.i.a();
                            gcbVar.a(fsa.IDLE);
                        } else {
                            gecVar = gcbVar.p;
                            gcbVar.p = null;
                            gcbVar.i.a();
                            gcbVar.c();
                        }
                    } else {
                        gecVar = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            gcbVar.h.a();
            if (gecVar != null) {
                gecVar.a(fvc.j.a("InternalSubchannel closed transport due to address change"));
            }
        } catch (Throwable th2) {
            gcbVar.h.a();
            throw th2;
        }
    }

    public final void a(Runnable runnable) {
        this.c.k.a(runnable).a();
    }
}
