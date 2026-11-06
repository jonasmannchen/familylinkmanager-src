package flm;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbk implements bbm {
    public static final aqb[] EMPTY_FEATURES_ARRAY = new aqb[0];
    public static final String TAG = "FeatureCheckPreProcessor";
    public final Context context;

    public bbk(Context context) {
        this.context = context;
    }

    @Override // flm.bbm
    public final apx process(bbn bbnVar, bbe bbeVar) {
        aqb[] clientRequiredFeatures = bbnVar.getClientRequiredFeatures();
        aqb[] clientApiFeatures = bbnVar.getClientApiFeatures();
        int length = getLength(clientRequiredFeatures) + getLength(clientApiFeatures);
        if (length == 0) {
            bbeVar.setAvailableFeatures(EMPTY_FEATURES_ARRAY);
            return apx.a;
        }
        rv rvVar = new rv(length);
        extractFeatureNames(clientRequiredFeatures, rvVar);
        extractFeatureNames(clientApiFeatures, rvVar);
        aqb[] features = parseFeatures(ModuleManager.get(this.context).fetchFeatures((String[]) rvVar.toArray(new String[rvVar.size()])));
        if (features == null) {
            return new apx(1);
        }
        apx apxVarCheckRequiredFeatures = checkRequiredFeatures(clientRequiredFeatures, features);
        if (apxVarCheckRequiredFeatures.b()) {
            bbeVar.setAvailableFeatures(features);
            return apxVarCheckRequiredFeatures;
        }
        return apxVarCheckRequiredFeatures;
    }

    public static int getLength(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    private static void extractFeatureNames(aqb[] aqbVarArr, Set set) {
        if (aqbVarArr != null) {
            for (aqb aqbVar : aqbVarArr) {
                set.add(aqbVar.a);
            }
        }
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
    private static aqb[] parseFeatures(ModuleManager.FeatureList featureList) {
        byte[] protoBytes;
        boolean zD;
        if (featureList != null && (protoBytes = featureList.getProtoBytes()) != null) {
            if (protoBytes.length == 0) {
                return new aqb[0];
            }
            try {
                fin finVarA = fin.a(akv.b, protoBytes);
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
                fjf<akt> fjfVar = ((akv) finVarA).a;
                aqb[] aqbVarArr = new aqb[fjfVar.size()];
                int i = 0;
                for (akt aktVar : fjfVar) {
                    aqbVarArr[i] = new aqb(aktVar.b, aktVar.c);
                    i++;
                }
                return aqbVarArr;
            } catch (fjg e) {
                Log.e(TAG, e.getMessage());
                return null;
            }
        }
        return null;
    }

    private static apx checkRequiredFeatures(aqb[] aqbVarArr, aqb[] aqbVarArr2) {
        boolean z;
        if (aqbVarArr == null) {
            return apx.a;
        }
        rt rtVar = new rt(aqbVarArr2.length);
        for (aqb aqbVar : aqbVarArr2) {
            rtVar.put(aqbVar.a, aqbVar);
        }
        int length = aqbVarArr.length;
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            aqb aqbVar2 = aqbVarArr[i];
            aqb aqbVar3 = (aqb) rtVar.get(aqbVar2.a);
            if (aqbVar3 == null) {
                z = true;
                break;
            }
            i++;
            z2 = aqbVar3.a() < aqbVar2.a() ? true : z2;
        }
        if (z) {
            return new apx(1);
        }
        if (z2) {
            return new apx(21);
        }
        return apx.a;
    }
}
