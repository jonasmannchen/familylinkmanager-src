package flm;

import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cpr extends cqg {
    private final /* synthetic */ cpp a;

    cpr(cpp cppVar) {
        this.a = cppVar;
    }

    @Override // flm.cqg
    public final CharSequence a() {
        int iA;
        cij cijVarD = this.a.a.d();
        exj exjVar = cijVarD.h == null ? exj.g : cijVarD.h;
        exm exmVar = exjVar.d == null ? exm.h : exjVar.d;
        if (this.a.b.isChecked()) {
            exo exoVarA = exo.a(exmVar.g);
            if (exoVarA == null) {
                exoVarA = exo.UNKNOWN_GENDER;
            }
            iA = coi.a(exoVarA, R.string.kidsetup_app_detail_google_search_on_dialog_body_male, R.string.kidsetup_app_detail_google_search_on_dialog_body_female, R.string.kidsetup_app_detail_google_search_on_dialog_body_other);
        } else {
            exo exoVarA2 = exo.a(exmVar.g);
            if (exoVarA2 == null) {
                exoVarA2 = exo.UNKNOWN_GENDER;
            }
            iA = coi.a(exoVarA2, R.string.kidsetup_app_detail_google_search_off_dialog_body_male, R.string.kidsetup_app_detail_google_search_off_dialog_body_female, R.string.kidsetup_app_detail_google_search_off_dialog_body_other);
        }
        return this.a.getString(iA, new Object[]{exmVar.c});
    }

    @Override // flm.cqg
    public final void b() {
        this.a.a().a(this.a.b.isChecked());
    }

    @Override // flm.cqg
    public final void c() {
        this.a.b.toggle();
    }

    @Override // flm.cqg
    public final void d() {
        this.a.b.toggle();
    }
}
