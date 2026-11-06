package flm;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gjr implements InvocationHandler {
    public boolean a;
    public String b;
    private final List c;

    public gjr(List list) {
        this.c = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = gju.a;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return true;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.a = true;
            return null;
        }
        if (name.equals("protocols") && objArr.length == 0) {
            return this.c;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
            List list = (List) objArr[0];
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (this.c.contains(list.get(i))) {
                    String str = (String) list.get(i);
                    this.b = str;
                    return str;
                }
            }
            String str2 = (String) this.c.get(0);
            this.b = str2;
            return str2;
        }
        if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
            this.b = (String) objArr[0];
            return null;
        }
        return method.invoke(this, objArr);
    }
}
