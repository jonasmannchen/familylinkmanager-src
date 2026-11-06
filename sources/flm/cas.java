package flm;

import android.database.CursorWindow;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cas {
    public static CursorWindow a(fke fkeVar) {
        List<fke> listSingletonList = Collections.singletonList(fkeVar);
        CursorWindow cursorWindow = new CursorWindow("ProtoCursorWindow");
        cursorWindow.setStartPosition(0);
        cursorWindow.setNumColumns(1);
        int i = 0;
        for (fke fkeVar2 : listSingletonList) {
            if (!cursorWindow.allocRow()) {
                cursorWindow.close();
                throw new RuntimeException("Cannot allocate shared memory for cursor window.");
            }
            cursorWindow.putBlob(fkeVar2.b(), i, 0);
            i++;
        }
        return cursorWindow;
    }
}
