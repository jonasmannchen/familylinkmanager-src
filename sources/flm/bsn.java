package flm;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.chimera.Fragment;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.database.SupervisionDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsn extends Fragment implements View.OnClickListener {
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.kids_debug_layout, viewGroup, false);
        viewInflate.findViewById(R.id.kids_debug_report).setOnClickListener(this);
        viewInflate.findViewById(R.id.kids_debug_sync).setOnClickListener(this);
        viewInflate.findViewById(R.id.kids_debug_reset_policy_level).setOnClickListener(this);
        return viewInflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        btv.c("Debug", "onClick", new Object[0]);
        final int id = view.getId();
        final Context applicationContext = getActivity().getApplicationContext();
        final cqr cqrVar = new cqr();
        bur.a.execute(new Runnable(this, id, cqrVar, applicationContext) { // from class: flm.bso
            private final bsn a;
            private final int b;
            private final Handler c;
            private final Context d;

            {
                this.a = this;
                this.b = id;
                this.c = cqrVar;
                this.d = applicationContext;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bsn bsnVar = this.a;
                int i = this.b;
                Handler handler = this.c;
                Context context = this.d;
                try {
                    if (i == R.id.kids_debug_report) {
                        bxn.a(true, euz.FORCED_SYNC, false);
                        bsn.a(handler, context, "Finished report");
                    } else if (i == R.id.kids_debug_sync) {
                        cav.b(euz.UNKNOWN_SYNC_TRIGGER);
                        bsn.a(handler, context, "Finished sync and apply");
                    } else {
                        if (i != R.id.kids_debug_reset_policy_level) {
                            return;
                        }
                        SupervisionDatabase.h().k().a("key_policy_level", (String) null);
                        bsn.a(handler, context, "Finished reset");
                    }
                } catch (Throwable th) {
                    btv.c("Debug", th, "KidsDebugFragment execution error", new Object[0]);
                    bsn.a(handler, context, "Error");
                }
            }
        });
    }

    static void a(Handler handler, final Context context, final String str) {
        handler.post(new Runnable(context, str) { // from class: flm.bsp
            private final Context a;
            private final String b;

            {
                this.a = context;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(this.a, this.b, 0).show();
            }
        });
    }
}
