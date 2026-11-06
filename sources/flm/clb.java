package flm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.ParentPickerFragment;
import com.google.android.gms.kids.setup.widget.AccountView;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class clb extends afm {
    public List c = Collections.emptyList();
    public final /* synthetic */ ParentPickerFragment d;

    public clb(ParentPickerFragment parentPickerFragment) {
        this.d = parentPickerFragment;
    }

    @Override // flm.afm
    public final int a() {
        return this.c.size();
    }

    @Override // flm.afm
    public final /* synthetic */ void a(agm agmVar, int i) {
        exm exmVar;
        String str;
        final clc clcVar = (clc) agmVar;
        final exj exjVar = (exj) this.c.get(i);
        if (exjVar.d == null) {
            exmVar = exm.h;
        } else {
            exmVar = exjVar.d;
        }
        AccountView accountView = (AccountView) clcVar.p.findViewById(R.id.parent_account_view);
        String str2 = exmVar.f;
        String str3 = exmVar.b;
        if (!exmVar.d.isEmpty()) {
            str = exmVar.d;
        } else {
            str = exmVar.e;
        }
        accountView.a(str2, str3, str);
        clcVar.p.setOnClickListener(new View.OnClickListener(clcVar, exjVar) { // from class: flm.cld
            private final clc a;
            private final exj b;

            {
                this.a = clcVar;
                this.b = exjVar;
            }

            /* JADX WARN: Code duplicated, block: B:12:0x0024  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z;
                clc clcVar2 = this.a;
                exj exjVar2 = this.b;
                ParentPickerFragment parentPickerFragment = clcVar2.q.d;
                exq exqVarA = exq.a(exjVar2.c);
                if (exqVarA == null) {
                    exqVarA = exq.UNKNOWN_FAMILY_ROLE;
                }
                if (exqVarA == exq.HEAD_OF_HOUSEHOLD) {
                    z = true;
                } else {
                    exq exqVarA2 = exq.a(exjVar2.c);
                    if (exqVarA2 == null) {
                        exqVarA2 = exq.UNKNOWN_FAMILY_ROLE;
                    }
                    if (exqVarA2 == exq.PARENT) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                dvl.a(z);
                Bundle bundle = new Bundle();
                bundle.putByteArray("parent", exjVar2.b());
                parentPickerFragment.a(bundle);
            }
        });
    }

    @Override // flm.afm
    public final /* synthetic */ agm a(ViewGroup viewGroup, int i) {
        int i2;
        if (this.d.d) {
            if (this.d.c.d) {
                i2 = R.layout.view_parent_picker_item_glif;
            } else {
                i2 = R.layout.view_parent_picker_item_material;
            }
        } else {
            i2 = R.layout.view_parent_picker_item;
        }
        return new clc(this, LayoutInflater.from(this.d.getActivity()).inflate(i2, viewGroup, false));
    }
}
