package com.android.volley;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface Cache {
    Entry get(String str);

    void initialize();

    void put(String str, Entry entry);

    /* JADX INFO: compiled from: PG */
    public class Entry {
        public List allResponseHeaders;
        public byte[] data;
        public String etag;
        public long lastModified;
        public Map responseHeaders = Collections.emptyMap();
        public long serverDate;
        public long softTtl;
        public long ttl;

        public boolean isExpired() {
            return this.ttl < System.currentTimeMillis();
        }

        public boolean refreshNeeded() {
            return this.softTtl < System.currentTimeMillis();
        }
    }
}
