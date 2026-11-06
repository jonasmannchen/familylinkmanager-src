package com.google.android.gms.kids.setup.compat;

import android.os.Bundle;
import flm.af;
import flm.ag;
import flm.akr;
import flm.cim;
import flm.x;
import flm.y;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LifecycleActivity extends akr implements af {
    private final ag a = new ag(this);

    @Override // flm.akx, flm.af
    public x getLifecycle() {
        return this.a;
    }

    @Override // flm.akr, flm.akx
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getViewModelHolderFragment() == null) {
            getSupportFragmentManager().beginTransaction().add(new cim(), "ViewModelHolderFragment").commitNow();
        }
        this.a.a(y.ON_CREATE);
    }

    @Override // flm.akr, flm.akx
    public void onStart() {
        super.onStart();
        this.a.a(y.ON_START);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akx
    public void onResume() {
        super.onResume();
        this.a.a(y.ON_RESUME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akx
    public void onPause() {
        this.a.a(y.ON_PAUSE);
        super.onPause();
    }

    @Override // flm.akr, flm.akx
    public void onSaveInstanceState(Bundle bundle) {
        this.a.a(y.ON_STOP);
        super.onSaveInstanceState(bundle);
    }

    @Override // flm.akr, flm.akx
    public void onStop() {
        this.a.a(y.ON_STOP);
        super.onStop();
    }

    @Override // flm.akr, flm.akx
    public void onDestroy() {
        this.a.a(y.ON_DESTROY);
        super.onDestroy();
    }

    public cim getViewModelHolderFragment() {
        return (cim) getSupportFragmentManager().findFragmentByTag("ViewModelHolderFragment");
    }
}
