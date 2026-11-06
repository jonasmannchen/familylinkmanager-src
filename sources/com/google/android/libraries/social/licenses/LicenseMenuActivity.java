package com.google.android.libraries.social.licenses;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.chimeraresources.R;
import flm.drs;
import flm.drw;
import flm.dry;
import flm.lu;
import flm.vy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class LicenseMenuActivity extends vy implements dry {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.vy, flm.ln, flm.oj, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity);
        if (e().a() != null) {
            e().a().b(true);
        }
        lu luVarC = c();
        if (luVarC.a(R.id.license_menu_fragment_container) instanceof drw) {
            return;
        }
        drw drwVar = new drw();
        if (getIntent().hasExtra("pluginLicensePaths")) {
            drwVar.e(getIntent().getBundleExtra("pluginLicensePaths"));
        }
        luVarC.a().a(R.id.license_menu_fragment_container, drwVar).c();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // flm.dry
    public final void a(drs drsVar) {
        Intent intent = new Intent(this, (Class<?>) LicenseActivity.class);
        intent.putExtra("license", drsVar);
        startActivity(intent);
    }
}
