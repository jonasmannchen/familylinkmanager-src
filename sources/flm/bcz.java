package flm;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bcz {
    public final List mFieldStrings;
    public final Object mInstance;

    private bcz(Object obj) {
        this.mInstance = bdi.checkNotNull(obj);
        this.mFieldStrings = new ArrayList();
    }

    public final bcz add(String str, Object obj) {
        List list = this.mFieldStrings;
        String str2 = (String) bdi.checkNotNull(str);
        String strValueOf = String.valueOf(obj);
        list.add(new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(strValueOf).length()).append(str2).append("=").append(strValueOf).toString());
        return this;
    }

    public final bcz addValue(Object obj) {
        this.mFieldStrings.add(String.valueOf(obj));
        return this;
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder(100).append(this.mInstance.getClass().getSimpleName()).append('{');
        int size = this.mFieldStrings.size();
        for (int i = 0; i < size; i++) {
            sbAppend.append((String) this.mFieldStrings.get(i));
            if (i < size - 1) {
                sbAppend.append(", ");
            }
        }
        return sbAppend.append('}').toString();
    }
}
