package flm;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fnc {
    public static String a(fnb fnbVar) {
        if (fnbVar == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            a(null, fnbVar, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            String strValueOf = String.valueOf(e.getMessage());
            return strValueOf.length() != 0 ? "Error printing proto: ".concat(strValueOf) : new String("Error printing proto: ");
        } catch (InvocationTargetException e2) {
            String strValueOf2 = String.valueOf(e2.getMessage());
            return strValueOf2.length() != 0 ? "Error printing proto: ".concat(strValueOf2) : new String("Error printing proto: ");
        }
    }

    private static void a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException {
        if (obj != null) {
            if (obj instanceof fnb) {
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer).append(a(str)).append(" <\n");
                    stringBuffer.append("  ");
                }
                Class<?> cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                        Class<?> type = field.getType();
                        Object obj2 = field.get(obj);
                        if (type.isArray()) {
                            if (type.getComponentType() == Byte.TYPE) {
                                a(name, obj2, stringBuffer, stringBuffer2);
                            } else {
                                int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                                for (int i = 0; i < length2; i++) {
                                    a(name, Array.get(obj2, i), stringBuffer, stringBuffer2);
                                }
                            }
                        } else {
                            a(name, obj2, stringBuffer, stringBuffer2);
                        }
                    }
                }
                for (Method method : cls.getMethods()) {
                    String name2 = method.getName();
                    if (name2.startsWith("set")) {
                        String strSubstring = name2.substring(3);
                        try {
                            String strValueOf = String.valueOf(strSubstring);
                            if (((Boolean) cls.getMethod(strValueOf.length() != 0 ? "has".concat(strValueOf) : new String("has"), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                                try {
                                    String strValueOf2 = String.valueOf(strSubstring);
                                    a(strSubstring, cls.getMethod(strValueOf2.length() != 0 ? "get".concat(strValueOf2) : new String("get"), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                                } catch (NoSuchMethodException e) {
                                }
                            }
                        } catch (NoSuchMethodException e2) {
                        }
                    }
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer).append(">\n");
                    return;
                }
                return;
            }
            stringBuffer2.append(stringBuffer).append(a(str)).append(": ");
            if (obj instanceof String) {
                String strConcat = (String) obj;
                if (!strConcat.startsWith("http") && strConcat.length() > 200) {
                    strConcat = String.valueOf(strConcat.substring(0, bbx.LOG_WTF_CONNECTIONS_THRESHOLD)).concat("[...]");
                }
                int length3 = strConcat.length();
                StringBuilder sb = new StringBuilder(length3);
                for (int i2 = 0; i2 < length3; i2++) {
                    char cCharAt = strConcat.charAt(i2);
                    if (cCharAt >= ' ' && cCharAt <= '~' && cCharAt != '\"' && cCharAt != '\'') {
                        sb.append(cCharAt);
                    } else {
                        sb.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                    }
                }
                stringBuffer2.append("\"").append(sb.toString()).append("\"");
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (bArr == null) {
                    stringBuffer2.append("\"\"");
                } else {
                    stringBuffer2.append('\"');
                    for (byte b : bArr) {
                        int i3 = b & 255;
                        if (i3 == 92 || i3 == 34) {
                            stringBuffer2.append('\\').append((char) i3);
                        } else if (i3 >= 32 && i3 < 127) {
                            stringBuffer2.append((char) i3);
                        } else {
                            stringBuffer2.append(String.format("\\%03o", Integer.valueOf(i3)));
                        }
                    }
                    stringBuffer2.append('\"');
                }
            } else {
                stringBuffer2.append(obj);
            }
            stringBuffer2.append("\n");
        }
    }

    private static String a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(cCharAt));
            } else if (Character.isUpperCase(cCharAt)) {
                stringBuffer.append('_').append(Character.toLowerCase(cCharAt));
            } else {
                stringBuffer.append(cCharAt);
            }
        }
        return stringBuffer.toString();
    }
}
