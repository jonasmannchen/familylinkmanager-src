package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class cgw implements at {
    public void a() {
    }

    public void b(Object obj) {
    }

    public void a(Exception exc) {
    }

    @Override // flm.at
    public final /* synthetic */ void a(Object obj) {
        cgu cguVar = (cgu) obj;
        if (cguVar != null) {
            switch (cguVar.a.ordinal()) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    a();
                    return;
                case 1:
                    dvl.b(cguVar.a == cgv.STARTED, "Cannot get progress when the state is not started: current state = %s.", cguVar.a);
                    float f = cguVar.b;
                    return;
                case 2:
                    if (cguVar.a != cgv.SUCCESSFUL) {
                        throw new IllegalStateException(String.format("Cannot get result when the state is not successful: current state = %s.", cguVar.a), cguVar.d);
                    }
                    b(cguVar.c);
                    return;
                case 3:
                    dvl.b(cguVar.a == cgv.FAILED, "Cannot get exception when the state is not failed: current state = %s.", cguVar.a);
                    a(cguVar.d);
                    return;
                default:
                    return;
            }
        }
    }
}
