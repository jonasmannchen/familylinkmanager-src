package flm;

import com.google.android.gms.kids.setup.KidSetupChimeraActivity;
import com.google.android.gms.kids.setup.sentinel.StartFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class coc extends cgw {
    private final /* synthetic */ StartFragment a;

    public coc(StartFragment startFragment) {
        this.a = startFragment;
    }

    @Override // flm.cgw
    public final void a(Exception exc) {
        b(cia.ABORT_WITH_RESULT_CANCELED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.cgw
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(final cia ciaVar) {
        final cid cidVar;
        cid cidVarA = cid.a(this.a.e.d().c);
        cid cidVar2 = cidVarA == null ? cid.UNDEFINED : cidVarA;
        switch (ciaVar.ordinal()) {
            case 8:
                cidVar = cid.SUPERVISEE;
                break;
            case 9:
                cidVar = cid.SUPERVISEE_EXIT;
                break;
            default:
                if (!chz.a(ciaVar)) {
                    cidVar = cidVar2;
                    break;
                } else {
                    switch (cidVar2.ordinal()) {
                        case 1:
                            cidVar = cid.SUW_MATERIAL_BLUE;
                            break;
                        case 2:
                            cidVar = cid.SUW_GLIF;
                            break;
                        case 3:
                            cidVar = cid.SUW_GLIF_V2;
                            break;
                        case 4:
                            cidVar = cid.SUW_GLIF_V3;
                            break;
                        default:
                            cidVar = cidVar2;
                            break;
                    }
                }
                break;
        }
        this.a.e.a(new coy(ciaVar, cidVar) { // from class: flm.cod
            private final cia a;
            private final cid b;

            {
                this.a = ciaVar;
                this.b = cidVar;
            }

            @Override // flm.coy
            public final Object a(Object obj) {
                cia ciaVar2 = this.a;
                cid cidVar3 = this.b;
                cij cijVar = (cij) obj;
                fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
                fioVar.a((fin) cijVar);
                return (cij) ((fin) ((cik) fioVar).a(ciaVar2).a(cidVar3).h());
            }
        });
        KidSetupChimeraActivity activity = this.a.getActivity();
        if (activity instanceof KidSetupChimeraActivity) {
            activity.updateTheme();
            if (cif.b(cidVar2) != cif.b(cidVar)) {
                activity.recreate();
            }
        }
    }
}
