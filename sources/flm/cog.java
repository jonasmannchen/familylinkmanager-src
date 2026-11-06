package flm;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cog implements egr {
    private final /* synthetic */ Context a;
    private final /* synthetic */ String b;
    private final /* synthetic */ ejs c;
    private final /* synthetic */ List d;

    public cog(Context context, String str, ejs ejsVar, List list) {
        this.a = context;
        this.b = str;
        this.c = ejsVar;
        this.d = list;
    }

    @Override // flm.egr
    public final void a(Throwable th) {
        btv.c("MemberSpvsn", th, "Error while retrieving account id for audit logging", new Object[0]);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // flm.egr
    public final /* synthetic */ void a(Object obj) {
        String string;
        String str = (String) obj;
        Context context = this.a;
        String str2 = this.b;
        ejs ejsVar = this.c;
        Context context2 = this.a;
        List list = this.d;
        btv.b("MemberSpvsn", "Creating member supervision optin audit record", new Object[0]);
        ejr ejrVarA = ((ejr) ((fio) ejq.e.a(dp.au, (Object) null))).a(coe.a(eka.ACTOR, str)).a(coe.a(eka.TARGET, str));
        ekd ekdVar = (ekd) ((fio) ekc.d.a(dp.au, (Object) null));
        ejk ejkVar = ejk.FAMILYLINK_SUPERVISION_CHANGE;
        ekdVar.c();
        ekc ekcVar = (ekc) ekdVar.a;
        if (ejkVar == null) {
            throw new NullPointerException();
        }
        ekcVar.a |= 1;
        ekcVar.b = ejkVar.b;
        ekf ekfVar = (ekf) ((fio) eke.d.a(dp.au, (Object) null));
        ekh ekhVar = (ekh) ((fio) ekg.c.a(dp.au, (Object) null));
        ekl eklVar = (ekl) ((fio) ekk.c.a(dp.au, (Object) null));
        ekm ekmVar = ekm.ENABLED;
        eklVar.c();
        ekk ekkVar = (ekk) eklVar.a;
        if (ekmVar == null) {
            throw new NullPointerException();
        }
        ekkVar.a |= 1;
        ekkVar.b = ekmVar.b;
        ekhVar.c();
        ekg ekgVar = (ekg) ekhVar.a;
        ekgVar.b = (ekk) ((fin) eklVar.h());
        ekgVar.a |= 1;
        ekfVar.c();
        eke ekeVar = (eke) ekfVar.a;
        ekeVar.c = (ekg) ((fin) ekhVar.h());
        ekeVar.a |= 1024;
        ekdVar.c();
        ekc ekcVar2 = (ekc) ekdVar.a;
        ekcVar2.c = (eke) ((fin) ekfVar.h());
        ekcVar2.a |= 2;
        ejrVarA.c();
        ejq ejqVar = (ejq) ejrVarA.a;
        ejqVar.c = (ekc) ((fin) ekdVar.h());
        ejqVar.a |= 1;
        ekp ekpVar = (ekp) ((fio) eko.e.a(dp.au, (Object) null));
        eji ejiVar = eji.FAMILYLINK_ANDROID_KIDS_MODULE_SUPERVISION_OPTIN_UI;
        ekpVar.c();
        eko ekoVar = (eko) ekpVar.a;
        if (ejiVar == null) {
            throw new NullPointerException();
        }
        ekoVar.a |= 1;
        ekoVar.b = ejiVar.b;
        Locale localeA = qm.a(context2.getResources().getConfiguration()).a(0);
        if (localeA == null || TextUtils.isEmpty(localeA.toString())) {
            string = "";
        } else {
            string = localeA.toString();
        }
        ekpVar.c();
        eko ekoVar2 = (eko) ekpVar.a;
        if (string == null) {
            throw new NullPointerException();
        }
        ekoVar2.a |= 2;
        ekoVar2.c = string;
        ekj ekjVar = (ekj) ((fio) eki.c.a(dp.au, (Object) null));
        ejp ejpVar = (ejp) ((fio) ejo.b.a(dp.au, (Object) null));
        ejpVar.c();
        ejo ejoVar = (ejo) ejpVar.a;
        if (!ejoVar.a.a()) {
            ejoVar.a = fin.a(ejoVar.a);
        }
        List list2 = ejoVar.a;
        fiv.a(list);
        if (list instanceof fjo) {
            List listD = ((fjo) list).d();
            fjo fjoVar = (fjo) list2;
            int size = list2.size();
            for (Object obj2 : listD) {
                if (obj2 == null) {
                    String string2 = new StringBuilder(37).append("Element at index ").append(fjoVar.size() - size).append(" is null.").toString();
                    for (int size2 = fjoVar.size() - 1; size2 >= size; size2--) {
                        fjoVar.remove(size2);
                    }
                    throw new NullPointerException(string2);
                }
                if (obj2 instanceof fgy) {
                    fjoVar.a((fgy) obj2);
                } else {
                    fjoVar.add((String) obj2);
                }
            }
        } else if (list instanceof fkp) {
            list2.addAll(list);
        } else {
            if ((list2 instanceof ArrayList) && (list instanceof Collection)) {
                ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
            }
            int size3 = list2.size();
            for (Object obj3 : list) {
                if (obj3 == null) {
                    String string3 = new StringBuilder(37).append("Element at index ").append(list2.size() - size3).append(" is null.").toString();
                    for (int size4 = list2.size() - 1; size4 >= size3; size4--) {
                        list2.remove(size4);
                    }
                    throw new NullPointerException(string3);
                }
                list2.add(obj3);
            }
        }
        ekjVar.c();
        eki ekiVar = (eki) ekjVar.a;
        ekiVar.b = (ejo) ((fin) ejpVar.h());
        ekiVar.a |= 128;
        ekpVar.c();
        eko ekoVar3 = (eko) ekpVar.a;
        ekoVar3.d = (eki) ((fin) ekjVar.h());
        ekoVar3.a |= 8;
        ejrVarA.c();
        ejq ejqVar2 = (ejq) ejrVarA.a;
        ejqVar2.d = (eko) ((fin) ekpVar.h());
        ejqVar2.a |= 2;
        ejq ejqVar3 = (ejq) ((fin) ejrVarA.h());
        btv.b("MemberSpvsn", "Logging audit record, token: %s, record %s", ejsVar, ejqVar3);
        alh alhVar = new alh(context);
        alm almVar = new alm();
        almVar.c = str2;
        almVar.b = 91;
        almVar.a = 2;
        almVar.e.add(ejqVar3.b());
        almVar.d = ejsVar.b();
        if (almVar.a != 1 && almVar.a != 2) {
            throw new IllegalStateException("Invalid WriteMode.");
        }
        if (almVar.e.isEmpty()) {
            throw new IllegalStateException("Must specify at least one audit record.");
        }
        if (almVar.b == 0) {
            throw new IllegalStateException("Invalid componentId.");
        }
        alhVar.a(1, new alj(new all(almVar.a, almVar.b, almVar.c, (byte[][]) almVar.e.toArray(new byte[0][]), null, almVar.d)));
    }
}
