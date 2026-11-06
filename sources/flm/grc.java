package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum grc implements fiy {
    ROOT_TAG_DEFAULT(0),
    UNKNOWN(255),
    JNI_GLOBAL(1),
    JNI_LOCAL(2),
    JAVA_LOCAL(3),
    NATIVE_STACK(4),
    STICKY_CLASS(5),
    THREAD_BLOCK(6),
    MONITOR_USED(7),
    THREAD_OBJECT(8),
    INTERNED_STRING(137),
    FINALIZING(138),
    DEBUGGER(139),
    REFERENCE_CLEANUP(140),
    VM_INTERNAL(141),
    JNI_MONITOR(142),
    UNREACHABLE(144);

    public final int a;

    @Override // flm.fiy
    public final int a() {
        return this.a;
    }

    public static grc a(int i) {
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return ROOT_TAG_DEFAULT;
            case 1:
                return JNI_GLOBAL;
            case 2:
                return JNI_LOCAL;
            case 3:
                return JAVA_LOCAL;
            case 4:
                return NATIVE_STACK;
            case 5:
                return STICKY_CLASS;
            case 6:
                return THREAD_BLOCK;
            case 7:
                return MONITOR_USED;
            case 8:
                return THREAD_OBJECT;
            case 137:
                return INTERNED_STRING;
            case 138:
                return FINALIZING;
            case 139:
                return DEBUGGER;
            case 140:
                return REFERENCE_CLEANUP;
            case 141:
                return VM_INTERNAL;
            case 142:
                return JNI_MONITOR;
            case 144:
                return UNREACHABLE;
            case 255:
                return UNKNOWN;
            default:
                return null;
        }
    }

    public static fiz b() {
        return grd.a;
    }

    grc(int i) {
        this.a = i;
    }
}
