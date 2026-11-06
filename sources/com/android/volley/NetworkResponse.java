package com.android.volley;

import flm.bbx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NetworkResponse {
    public final List allHeaders;
    public final byte[] data;
    public final Map headers;
    public final long networkTimeMs;
    public final boolean notModified;
    public final int statusCode;

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public NetworkResponse(int i, byte[] bArr, Map map, boolean z, long j) {
        List arrayList;
        if (map == null) {
            arrayList = null;
        } else if (map.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new Header((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(i, bArr, map, arrayList, z, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkResponse(int i, byte[] bArr, boolean z, long j, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Header header = (Header) it.next();
                treeMap.put(header.getName(), header.getValue());
            }
        }
        this(i, bArr, treeMap, list, z, j);
    }

    @Deprecated
    public NetworkResponse(byte[] bArr, Map map) {
        this(bbx.LOG_WTF_CONNECTIONS_THRESHOLD, bArr, map, false, 0L);
    }

    private NetworkResponse(int i, byte[] bArr, Map map, List list, boolean z, long j) {
        this.statusCode = i;
        this.data = bArr;
        this.headers = map;
        if (list == null) {
            this.allHeaders = null;
        } else {
            this.allHeaders = Collections.unmodifiableList(list);
        }
        this.notModified = z;
        this.networkTimeMs = j;
    }
}
