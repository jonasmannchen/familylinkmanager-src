package flm;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.util.LruCache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bow {
    public static final LruCache a = new LruCache(((Long) aze.f.b()).intValue());

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void a(bbn bbnVar, bod bodVar) {
        if (Binder.getCallingUid() == bhq.a) {
            return;
        }
        boc bocVar = (boc) ((fio) bob.g.a(dp.au, (Object) null));
        int clientLibraryVersion = bbnVar.getClientLibraryVersion();
        bocVar.c();
        bob bobVar = (bob) bocVar.a;
        bobVar.a |= 2;
        bobVar.c = clientLibraryVersion;
        bocVar.c();
        bob bobVar2 = (bob) bocVar.a;
        if (bodVar == null) {
            throw new NullPointerException();
        }
        bobVar2.a |= 16;
        bobVar2.f = bodVar.e;
        if (bodVar != bod.THIRD_PARTY) {
            String callingPackage = bbnVar.getCallingPackage();
            bocVar.c();
            bob bobVar3 = (bob) bocVar.a;
            if (callingPackage == null) {
                throw new NullPointerException();
            }
            bobVar3.a |= 1;
            bobVar3.b = callingPackage;
            try {
                PackageInfo packageInfoB = bjj.a.a((Context) ayt.a()).b(bocVar.a(), 0);
                if (packageInfoB != null) {
                    if (packageInfoB.versionName != null) {
                        String str = packageInfoB.versionName;
                        bocVar.c();
                        bob bobVar4 = (bob) bocVar.a;
                        if (str == null) {
                            throw new NullPointerException();
                        }
                        bobVar4.a |= 8;
                        bobVar4.e = str;
                    }
                    int i = packageInfoB.versionCode;
                    bocVar.c();
                    bob bobVar5 = (bob) bocVar.a;
                    bobVar5.a |= 4;
                    bobVar5.d = i;
                }
            } catch (PackageManager.NameNotFoundException e) {
                String strA = bocVar.a();
                new StringBuilder(String.valueOf(strA).length() + 34).append("Cannot get application info for [").append(strA).append("]");
            }
        }
        a.put(Integer.valueOf(Binder.getCallingUid()), (bob) ((fin) bocVar.h()));
    }
}
