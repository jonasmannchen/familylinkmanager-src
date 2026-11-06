package flm;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class biv extends File {
    public biv(File file, String str) {
        File file2 = new File(new File(file.getPath(), str).getPath());
        super(new File(file2.getParentFile(), String.format("%s_%s", bix.a(), file2.getName())).getPath());
    }
}
