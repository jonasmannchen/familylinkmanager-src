package flm;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Base64;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class col {
    public static void a(Context context, cij cijVar) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("kid_setup_view_model", 0).edit();
        editorEdit.putString("setup_state", Base64.encodeToString(cijVar.b(), 2));
        editorEdit.commit();
    }

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
    public static dvi a(Context context) {
        boolean zD;
        String string = context.getSharedPreferences("kid_setup_view_model", 0).getString("setup_state", null);
        if (string != null) {
            try {
                fin finVarA = fin.a(cij.C, Base64.decode(string, 2));
                if (finVarA != null) {
                    boolean zBooleanValue = Boolean.TRUE.booleanValue();
                    byte bByteValue = ((Byte) finVarA.a(dp.aq, (Object) null)).byteValue();
                    if (bByteValue == 1) {
                        zD = true;
                    } else if (bByteValue == 0) {
                        zD = false;
                    } else {
                        zD = fkq.a.a(finVarA).d(finVarA);
                        if (zBooleanValue) {
                            finVarA.a(dp.ar, zD ? finVarA : null);
                        }
                    }
                    if (!zD) {
                        fjg fjgVarA = new flp().a();
                        if (fjgVarA == null) {
                            throw null;
                        }
                        throw fjgVarA;
                    }
                }
                return dvi.b((cij) finVarA);
            } catch (fjg e) {
                btv.b("KidSetup", e, "Failed to restore setup state from shared preferences.", new Object[0]);
            }
        }
        return dur.a;
    }

    public static boolean b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.deleteSharedPreferences("kid_setup_view_model");
        }
        return context.getSharedPreferences("kid_setup_view_model", 0).edit().clear().commit();
    }
}
