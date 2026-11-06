package flm;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dpd {
    public final File a;
    private final List b;
    private final int c;
    private final List d;

    dpd(File file, List list, int i, Pattern... patternArr) {
        this.a = file;
        this.c = i;
        this.d = list;
        this.b = patternArr.length == 0 ? Collections.emptyList() : Arrays.asList(patternArr);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0118  */
    final long a(dpe dpeVar) {
        long jA;
        String string;
        boolean z;
        long jA2 = 0;
        gsw gswVarA = ((gsw) ((fio) gsv.e.a(dp.au, (Object) null))).a(dpeVar.a);
        try {
            File[] fileArrListFiles = new File(dpeVar.c.a, dpeVar.a).listFiles();
            if (dpeVar.b >= this.c || this.d.size() >= 512) {
                jA2 = dpc.a(fileArrListFiles);
            } else {
                int length = fileArrListFiles.length;
                int i = 0;
                while (i < length) {
                    File file = fileArrListFiles[i];
                    if (dpc.a(file)) {
                        jA = jA2;
                    } else if (file.isFile()) {
                        String name = file.getName();
                        if (dpeVar.b == 0) {
                            string = name;
                        } else {
                            String str = dpeVar.a;
                            string = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length()).append(str).append('/').append(name).toString();
                        }
                        Iterator it = this.b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((Pattern) it.next()).matcher(string).matches()) {
                                    z = true;
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        if (z && this.d.size() < 512) {
                            this.d.add((gsv) ((fin) ((gsw) ((fio) gsv.e.a(dp.au, (Object) null))).a(string).a(file.length()).h()));
                        }
                        jA = file.length() + jA2;
                    } else if (file.isDirectory()) {
                        jA = a(new dpe(this, dpeVar, file.getName())) + jA2;
                    } else {
                        jA = jA2;
                    }
                    i++;
                    jA2 = jA;
                }
            }
        } catch (IOException | SecurityException e) {
            dkm.a("DirStatsCapture", "exception while collecting DirStats for dir %s", e, dpeVar.a);
        }
        gswVarA.a(jA2);
        this.d.add((gsv) ((fin) gswVarA.h()));
        return jA2;
    }
}
