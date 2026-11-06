package flm;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class avn implements daz {
    private final /* synthetic */ avm a;

    avn(avm avmVar) {
        this.a = avmVar;
    }

    @Override // flm.daz
    public final void a(dbh dbhVar) {
        apx apxVar;
        int i;
        apx apxVar2;
        int i2;
        this.a.d.lock();
        try {
            if (this.a.j) {
                if (dbhVar.b()) {
                    this.a.k = new rt(this.a.a.size());
                    Iterator it = this.a.a.values().iterator();
                    while (it.hasNext()) {
                        this.a.k.put(((avl) it.next()).b, apx.a);
                    }
                } else if (dbhVar.e() instanceof atk) {
                    atk atkVar = (atk) dbhVar.e();
                    if (this.a.i) {
                        this.a.k = new rt(this.a.a.size());
                        for (avl avlVar : this.a.a.values()) {
                            aup aupVar = avlVar.b;
                            aup aupVar2 = avlVar.b;
                            bdi.checkArgument(atkVar.a.get(aupVar2) != null, "The given API was not part of the availability request.");
                            apx apxVar3 = (apx) atkVar.a.get(aupVar2);
                            avm avmVar = this.a;
                            if (!apxVar3.b() && !apxVar3.a() && ((Boolean) avmVar.b.get(avlVar.a)).booleanValue() && avlVar.g.requiresGooglePlayServices() && avmVar.e.a(apxVar3.c)) {
                                this.a.k.put(aupVar, new apx(16));
                            } else {
                                this.a.k.put(aupVar, apxVar3);
                            }
                        }
                    } else {
                        this.a.k = atkVar.a;
                    }
                    avm avmVar2 = this.a;
                    avm avmVar3 = this.a;
                    apx apxVar4 = null;
                    int i3 = 0;
                    apx apxVar5 = null;
                    int i4 = 0;
                    for (avl avlVar2 : avmVar3.a.values()) {
                        asw aswVar = avlVar2.a;
                        apx apxVar6 = (apx) avmVar3.k.get(avlVar2.b);
                        if (!apxVar6.b() && (!((Boolean) avmVar3.b.get(aswVar)).booleanValue() || apxVar6.a() || avmVar3.e.a(apxVar6.c))) {
                            if (apxVar6.c == 4 && avmVar3.h) {
                                int priority = aswVar.a().getPriority();
                                if (apxVar5 == null || i4 > priority) {
                                    i4 = priority;
                                    apxVar5 = apxVar6;
                                }
                            } else {
                                int priority2 = aswVar.a().getPriority();
                                if (apxVar4 == null || i3 > priority2) {
                                    apxVar = apxVar6;
                                    i = priority2;
                                } else {
                                    i = i3;
                                    apxVar = apxVar4;
                                }
                                i3 = i;
                                apxVar4 = apxVar;
                            }
                        }
                    }
                    if (apxVar4 != null && apxVar5 != null && i3 > i4) {
                        apxVar4 = apxVar5;
                    }
                    avmVar2.m = apxVar4;
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", dbhVar.e());
                    this.a.k = Collections.emptyMap();
                    this.a.m = new apx(8);
                }
                if (this.a.l != null) {
                    this.a.k.putAll(this.a.l);
                    avm avmVar4 = this.a;
                    avm avmVar5 = this.a;
                    apx apxVar7 = null;
                    int i5 = 0;
                    apx apxVar8 = null;
                    int i6 = 0;
                    for (avl avlVar3 : avmVar5.a.values()) {
                        asw aswVar2 = avlVar3.a;
                        apx apxVar9 = (apx) avmVar5.k.get(avlVar3.b);
                        if (!apxVar9.b() && (!((Boolean) avmVar5.b.get(aswVar2)).booleanValue() || apxVar9.a() || avmVar5.e.a(apxVar9.c))) {
                            if (apxVar9.c == 4 && avmVar5.h) {
                                int priority3 = aswVar2.a().getPriority();
                                if (apxVar8 == null || i6 > priority3) {
                                    i6 = priority3;
                                    apxVar8 = apxVar9;
                                }
                            } else {
                                int priority4 = aswVar2.a().getPriority();
                                if (apxVar7 == null || i5 > priority4) {
                                    apxVar2 = apxVar9;
                                    i2 = priority4;
                                } else {
                                    i2 = i5;
                                    apxVar2 = apxVar7;
                                }
                                i5 = i2;
                                apxVar7 = apxVar2;
                            }
                        }
                    }
                    if (apxVar7 != null && apxVar8 != null && i5 > i6) {
                        apxVar7 = apxVar8;
                    }
                    avmVar4.m = apxVar7;
                }
                if (this.a.m == null) {
                    avm avmVar6 = this.a;
                    if (avmVar6.g == null) {
                        avmVar6.c.e = Collections.emptySet();
                    } else {
                        HashSet hashSet = new HashSet(avmVar6.g.getRequiredScopes());
                        Map optionalApiSettings = avmVar6.g.getOptionalApiSettings();
                        for (asw aswVar3 : optionalApiSettings.keySet()) {
                            apx apxVarA = avmVar6.a(aswVar3.c());
                            if (apxVarA != null && apxVarA.b()) {
                                hashSet.addAll(((bbc) optionalApiSettings.get(aswVar3)).mScopes);
                            }
                        }
                        avmVar6.c.e = hashSet;
                    }
                    this.a.f();
                } else {
                    this.a.j = false;
                    this.a.c.a(this.a.m);
                }
                this.a.f.signalAll();
            }
        } finally {
            this.a.d.unlock();
        }
    }
}
