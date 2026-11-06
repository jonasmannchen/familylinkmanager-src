package flm;

import java.net.URI;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gav extends ful {
    @Override // flm.fuj
    public final String a() {
        return "dns";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ful
    public final boolean b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ful
    public final int c() {
        return 5;
    }

    @Override // flm.fuj
    public final /* synthetic */ fui a(URI uri, frd frdVar) {
        ges gesVar;
        if ("dns".equals(uri.getScheme())) {
            String str = (String) dvl.a(uri.getPath(), "targetPath");
            dvl.a(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
            String strSubstring = str.substring(1);
            uri.getAuthority();
            gha ghaVar = gbh.m;
            if (gbh.a) {
                gesVar = gbh.l;
            } else {
                gesVar = gbh.k;
            }
            return new gao(strSubstring, frdVar, ghaVar, gesVar, new dvw(), fuz.a(getClass().getClassLoader()));
        }
        return null;
    }
}
