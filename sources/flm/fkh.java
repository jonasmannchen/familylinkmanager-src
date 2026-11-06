package flm;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fkh {
    static void a(fke fkeVar, StringBuilder sb, int i) {
        boolean zBooleanValue;
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : fkeVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strReplaceFirst = str.replaceFirst("get", "");
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList") && !strReplaceFirst.equals("List")) {
                String strValueOf = String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strReplaceFirst.substring(1, strReplaceFirst.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb, i, a(strConcat), fin.a(method2, fkeVar, new Object[0]));
                }
            }
            if (strReplaceFirst.endsWith("Map") && !strReplaceFirst.equals("Map")) {
                String strValueOf3 = String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strReplaceFirst.substring(1, strReplaceFirst.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb, i, a(strConcat2), fin.a(method3, fkeVar, new Object[0]));
                }
            }
            String strValueOf5 = String.valueOf(strReplaceFirst);
            if (((Method) map2.get(strValueOf5.length() != 0 ? "set".concat(strValueOf5) : new String("set"))) != null) {
                if (strReplaceFirst.endsWith("Bytes")) {
                    String strValueOf6 = String.valueOf(strReplaceFirst.substring(0, strReplaceFirst.length() - 5));
                    if (!map.containsKey(strValueOf6.length() != 0 ? "get".concat(strValueOf6) : new String("get"))) {
                    }
                }
                String strValueOf7 = String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
                String strValueOf8 = String.valueOf(strReplaceFirst.substring(1));
                String strConcat3 = strValueOf8.length() != 0 ? strValueOf7.concat(strValueOf8) : new String(strValueOf7);
                String strValueOf9 = String.valueOf(strReplaceFirst);
                Method method4 = (Method) map.get(strValueOf9.length() != 0 ? "get".concat(strValueOf9) : new String("get"));
                String strValueOf10 = String.valueOf(strReplaceFirst);
                Method method5 = (Method) map.get(strValueOf10.length() != 0 ? "has".concat(strValueOf10) : new String("has"));
                if (method4 != null) {
                    Object objA = fin.a(method4, fkeVar, new Object[0]);
                    if (method5 == null) {
                        if (objA instanceof Boolean) {
                            zEquals = !((Boolean) objA).booleanValue();
                        } else if (objA instanceof Integer) {
                            zEquals = ((Integer) objA).intValue() == 0;
                        } else if (objA instanceof Float) {
                            zEquals = ((Float) objA).floatValue() == 0.0f;
                        } else if (objA instanceof Double) {
                            zEquals = ((Double) objA).doubleValue() == 0.0d;
                        } else if (objA instanceof String) {
                            zEquals = objA.equals("");
                        } else if (objA instanceof fgy) {
                            zEquals = objA.equals(fgy.a);
                        } else if (objA instanceof fke) {
                            zEquals = objA == ((fke) objA).m();
                        } else {
                            zEquals = (objA instanceof Enum) && ((Enum) objA).ordinal() == 0;
                        }
                        zBooleanValue = !zEquals;
                    } else {
                        zBooleanValue = ((Boolean) fin.a(method5, fkeVar, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        a(sb, i, a(strConcat3), objA);
                    }
                }
            }
        }
        if (fkeVar instanceof fir) {
            Iterator itB = ((fir) fkeVar).f.b();
            if (itB.hasNext()) {
                throw new NoSuchMethodError();
            }
        }
        if (((fin) fkeVar).E != null) {
            flr flrVar = ((fin) fkeVar).E;
            for (int i2 = 0; i2 < flrVar.b; i2++) {
                a(sb, i, String.valueOf(flrVar.c[i2] >>> 3), flrVar.d[i2]);
            }
        }
    }

    static final void a(StringBuilder sb, int i, String str, Object obj) {
        int i2 = 0;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"").append(flm.a(fgy.a((String) obj))).append('\"');
            return;
        }
        if (obj instanceof fgy) {
            sb.append(": \"").append(flm.a((fgy) obj)).append('\"');
            return;
        }
        if (obj instanceof fin) {
            sb.append(" {");
            a((fin) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            a(sb, i + 2, "key", entry.getKey());
            a(sb, i + 2, "value", entry.getValue());
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        sb.append(": ").append(obj.toString());
    }

    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }
}
