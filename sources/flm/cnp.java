package flm;

import android.content.DialogInterface;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.geller.StopSupervisionWarningFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cnp extends cgw {
    public final /* synthetic */ StopSupervisionWarningFragment a;

    public cnp(StopSupervisionWarningFragment stopSupervisionWarningFragment) {
        this.a = stopSupervisionWarningFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cnq
            private final cnp a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.a.i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final /* synthetic */ void b(Object obj) {
        euu euuVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (ewd ewdVar : (List) obj) {
            if (ewdVar.c == null) {
                euuVar = euu.c;
            } else {
                euuVar = ewdVar.c;
            }
            fjc fjcVar = new fjc(euuVar.a, euu.b);
            if (fjcVar.contains(eus.CAPABILITY_PERMALOCK)) {
                arrayList.add(ewdVar);
            } else if (fjcVar.contains(eus.CAPABILITY_LOCK_WITH_DEADLINE)) {
                arrayList2.add(ewdVar);
            } else {
                arrayList3.add(ewdVar);
            }
        }
        this.a.g.findViewById(R.id.devices_list_progress_bar).setVisibility(8);
        if (!arrayList.isEmpty()) {
            this.a.a(R.id.stop_supervision_devices_will_lock_until_18, R.id.devices_lock_until_18_list, R.string.stop_supervision_device_will_lock_until_18_singular, R.string.stop_supervision_devices_will_lock_until_18_plural, arrayList);
        }
        if (!arrayList2.isEmpty()) {
            this.a.a(R.id.stop_supervision_devices_will_lock_for_24_hrs, R.id.devices_lock_for_24_hrs_list, R.string.stop_supervision_device_will_lock_for_24_hrs_singular, R.string.stop_supervision_devices_will_lock_for_24_hrs_plural, arrayList2);
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        this.a.a(R.id.stop_supervision_devices_wont_lock, R.id.devices_wont_lock_list, R.string.stop_supervision_device_will_not_lock_singular, R.string.stop_supervision_devices_will_not_lock_plural, arrayList3);
    }
}
