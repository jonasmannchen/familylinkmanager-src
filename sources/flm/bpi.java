package flm;

import android.util.Log;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bpi {
    public final FileOutputStream a = a(new biv(bhq.b(ayt.a()).getDir("tracing", 0), "cpu_aggregates"));
    public final DataOutputStream b = new DataOutputStream(this.a);

    private static FileOutputStream a(File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            if (((fpu) fpt.a.a()).f()) {
                fileOutputStream.getChannel().force(true);
            }
            return fileOutputStream;
        } catch (FileNotFoundException e) {
            Log.e("TracingFileWriter", "Couldn't open stats file for appending", e);
            return null;
        } catch (IOException e2) {
            Log.w("TracingFileWriter", "Couldn't set force on the output channel.");
            return null;
        }
    }

    final FileLock a() throws IOException {
        try {
            return this.a.getChannel().lock();
        } catch (OverlappingFileLockException e) {
            throw new IOException("Unable to lock file exclusively", e);
        }
    }
}
