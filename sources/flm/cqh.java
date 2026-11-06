package flm;

import android.os.Bundle;
import com.google.android.chimera.FragmentManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cqh {
    public final Bundle a = new Bundle();
    private final FragmentManager b;

    public final cqh a(int i) {
        this.a.putInt("title_id", i);
        return this;
    }

    public final cqh b(int i) {
        this.a.putInt("message_id", i);
        return this;
    }

    public final cqh c(int i) {
        this.a.putInt("positive_button_text_id", i);
        return this;
    }

    public final cqh d(int i) {
        this.a.putInt("negative_button_text_id", i);
        return this;
    }

    public final cqh a(boolean z) {
        this.a.putBoolean("cancelable", z);
        return this;
    }

    public final void a() {
        cqd cqdVar = new cqd();
        cqdVar.setArguments(this.a);
        cqdVar.show(this.b, "AlertDialogFragment");
    }

    public cqh(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }
}
