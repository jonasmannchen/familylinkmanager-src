package flm;

import android.content.DialogInterface;
import com.google.android.gms.kids.setup.fragment.AppSelectorFragment;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjg extends cgw {
    public final /* synthetic */ AppSelectorFragment a;

    public cjg(AppSelectorFragment appSelectorFragment) {
        this.a = appSelectorFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a() {
        if (!this.a.d) {
            this.a.i(3);
        } else {
            ((aje) this.a.c.b.a(aje.class)).a(true);
            this.a.c.b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cjh
            private final cjg a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.a.h();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        if (this.a.d) {
            ((aje) this.a.c.b.a(aje.class)).a(false);
            this.a.c.b(true);
        } else {
            this.a.j(3);
        }
        cjd cjdVar = this.a.a;
        cjdVar.a = list;
        cjdVar.notifyDataSetChanged();
    }
}
