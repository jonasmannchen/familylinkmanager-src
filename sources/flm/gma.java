package flm;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gma {
    private static final Logger b = Logger.getLogger(gma.class.getName());
    public static final gmb a = a(gmb.class.getClassLoader());

    private gma() {
    }

    private static gmb a(ClassLoader classLoader) {
        try {
            return (gmb) gkv.a(Class.forName("io.opencensus.impl.tags.TagsComponentImpl", true, classLoader), gmb.class);
        } catch (ClassNotFoundException e) {
            b.logp(Level.FINE, "io.opencensus.tags.Tags", "loadTagsComponent", "Couldn't load full implementation for TagsComponent, now trying to load lite implementation.", (Throwable) e);
            try {
                return (gmb) gkv.a(Class.forName("io.opencensus.impllite.tags.TagsComponentImplLite", true, classLoader), gmb.class);
            } catch (ClassNotFoundException e2) {
                b.logp(Level.FINE, "io.opencensus.tags.Tags", "loadTagsComponent", "Couldn't load lite implementation for TagsComponent, now using default implementation for TagsComponent.", (Throwable) e2);
                return new glt();
            }
        }
    }
}
