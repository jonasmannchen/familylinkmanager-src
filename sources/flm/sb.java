package flm;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class sb {
    public int createCount;
    public int evictionCount;
    public int hitCount;
    public final LinkedHashMap map;
    public int maxSize;
    public int missCount;
    public int putCount;
    public int size;

    public sb(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = i;
        this.map = new LinkedHashMap(0, 0.75f, true);
    }

    public void resize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.maxSize = i;
        }
        trimToSize(i);
    }

    public final Object get(Object obj) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Object obj2 = this.map.get(obj);
            if (obj2 != null) {
                this.hitCount++;
                return obj2;
            }
            this.missCount++;
            Object objCreate = create(obj);
            if (objCreate == null) {
                return null;
            }
            synchronized (this) {
                this.createCount++;
                objPut = this.map.put(obj, objCreate);
                if (objPut != null) {
                    this.map.put(obj, objPut);
                } else {
                    this.size += safeSizeOf(obj, objCreate);
                }
            }
            if (objPut != null) {
                entryRemoved(false, obj, objCreate, objPut);
                return objPut;
            }
            trimToSize(this.maxSize);
            return objCreate;
        }
    }

    public final Object put(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.putCount++;
            this.size += safeSizeOf(obj, obj2);
            objPut = this.map.put(obj, obj2);
            if (objPut != null) {
                this.size -= safeSizeOf(obj, objPut);
            }
        }
        if (objPut != null) {
            entryRemoved(false, obj, objPut, obj2);
        }
        trimToSize(this.maxSize);
        return objPut;
    }

    public void trimToSize(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this) {
                if (this.size < 0 || (this.map.isEmpty() && this.size != 0)) {
                    break;
                }
                if (this.size <= i || this.map.isEmpty()) {
                    return;
                }
                Map.Entry entry = (Map.Entry) this.map.entrySet().iterator().next();
                key = entry.getKey();
                value = entry.getValue();
                this.map.remove(key);
                this.size -= safeSizeOf(key, value);
                this.evictionCount++;
            }
            entryRemoved(true, key, value, null);
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final Object remove(Object obj) {
        Object objRemove;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            objRemove = this.map.remove(obj);
            if (objRemove != null) {
                this.size -= safeSizeOf(obj, objRemove);
            }
        }
        if (objRemove != null) {
            entryRemoved(false, obj, objRemove, null);
        }
        return objRemove;
    }

    protected void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
    }

    protected Object create(Object obj) {
        return null;
    }

    private int safeSizeOf(Object obj, Object obj2) {
        int iSizeOf = sizeOf(obj, obj2);
        if (iSizeOf < 0) {
            throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
        }
        return iSizeOf;
    }

    public int sizeOf(Object obj, Object obj2) {
        return 1;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int size() {
        return this.size;
    }

    public final synchronized int maxSize() {
        return this.maxSize;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final synchronized int missCount() {
        return this.missCount;
    }

    public final synchronized int createCount() {
        return this.createCount;
    }

    public final synchronized int putCount() {
        return this.putCount;
    }

    public final synchronized int evictionCount() {
        return this.evictionCount;
    }

    public final synchronized Map snapshot() {
        return new LinkedHashMap(this.map);
    }

    public final synchronized String toString() {
        String str;
        synchronized (this) {
            int i = this.hitCount + this.missCount;
            str = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i != 0 ? (this.hitCount * 100) / i : 0));
        }
        return str;
    }
}
