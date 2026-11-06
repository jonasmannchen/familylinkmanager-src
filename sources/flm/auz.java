package flm;

import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class auz implements Runnable {
    public final /* synthetic */ aux a;
    private final auy b;

    auz(aux auxVar, auy auyVar) {
        this.a = auxVar;
        this.b = auyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.b) {
            apx apxVar = this.b.b;
            if (apxVar.a()) {
                this.a.f.startActivityForResult(GoogleApiActivity.a(this.a.f(), apxVar.d, this.b.a, false), 1);
                return;
            }
            if (this.a.d.a(apxVar.c)) {
                this.a.d.a(this.a.f(), this.a.f, apxVar.c, 2, this.a);
            } else if (apxVar.c == 18) {
                this.a.d.a(this.a.f().getApplicationContext(), new ava(this, this.a.d.a(this.a.f(), this.a)));
            } else {
                this.a.a(apxVar, this.b.a);
            }
        }
    }
}
