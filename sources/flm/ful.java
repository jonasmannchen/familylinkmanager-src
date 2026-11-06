package flm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ful extends fuj {
    public static final fuj b;
    private static final Logger c = Logger.getLogger(ful.class.getName());
    private static final Iterable d = d();
    private static final List e;

    public abstract boolean b();

    public abstract int c();

    private static final List d() {
        try {
            return Collections.singletonList(Class.forName("flm.gav"));
        } catch (ClassNotFoundException e2) {
            c.logp(Level.FINE, "io.grpc.NameResolverProvider", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e2);
            return Collections.emptyList();
        }
    }

    static {
        Iterable iterableLoad;
        Iterable iterable = d;
        ClassLoader classLoader = ful.class.getClassLoader();
        fun funVar = new fun();
        if (fuz.a(classLoader)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(fuz.a(ful.class, (Class) it.next()));
            }
            iterableLoad = arrayList;
        } else {
            iterableLoad = ServiceLoader.load(ful.class, classLoader);
            if (!iterableLoad.iterator().hasNext()) {
                iterableLoad = ServiceLoader.load(ful.class);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterableLoad) {
            if (funVar.b(obj)) {
                arrayList2.add(obj);
            }
        }
        Collections.sort(arrayList2, Collections.reverseOrder(new fva(funVar)));
        e = Collections.unmodifiableList(arrayList2);
        b = new fum(e);
    }
}
