package flm;

import android.database.CursorWindow;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btc {
    public static CursorWindow a(fke fkeVar) {
        List<fke> listAsList = Arrays.asList(fkeVar);
        CursorWindow cursorWindow = new CursorWindow("ProtoCursorWindow");
        cursorWindow.setStartPosition(0);
        cursorWindow.setNumColumns(1);
        int i = 0;
        for (fke fkeVar2 : listAsList) {
            if (!cursorWindow.allocRow()) {
                cursorWindow.close();
                throw new RuntimeException("Cannot allocate shared memory for cursor window.");
            }
            cursorWindow.putBlob(fkeVar2.b(), i, 0);
            i++;
        }
        return cursorWindow;
    }

    public static fke a(CursorWindow cursorWindow, btd btdVar) {
        try {
            ArrayList arrayList = new ArrayList();
            int numRows = cursorWindow.getNumRows();
            for (int i = 0; i < numRows; i++) {
                dvl.b(cursorWindow.getType(i, 0) == 4);
                arrayList.add(cursorWindow.getBlob(i, 0));
            }
            dvl.b(arrayList.size() == 1);
            return btdVar.a((byte[]) arrayList.get(0));
        } finally {
            cursorWindow.close();
        }
    }
}
