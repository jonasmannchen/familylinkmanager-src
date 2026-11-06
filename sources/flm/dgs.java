package flm;

import android.content.Intent;
import android.os.Debug;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgs implements Runnable {
    private final File a;
    private final gpm b;
    private final Float c;
    private final Long d;
    private final Long e;
    private final /* synthetic */ dgr f;

    dgs(dgr dgrVar, File file, gpm gpmVar, Float f, Long l, Long l2) {
        this.f = dgrVar;
        this.a = file;
        this.b = gpmVar;
        this.c = f;
        this.d = l;
        this.e = l2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.f.c.set(false);
        Debug.stopMethodTracing();
        Long lValueOf = Long.valueOf(this.f.j.a());
        if (lValueOf.longValue() >= this.d.longValue() + ((long) this.f.h)) {
            this.f.g();
            dkm.a(5, "CpuProfilingService", "Missed sample window by %d ms", Long.valueOf(lValueOf.longValue() - this.d.longValue()));
            return;
        }
        Intent intentRegisterReceiver = this.f.a.registerReceiver(null, this.f.i);
        gpm gpmVar = this.b;
        fio fioVar = (fio) gpmVar.a(dp.au, (Object) null);
        fioVar.a((fin) gpmVar);
        gpn gpnVar = (gpn) fioVar;
        gpo gpoVarA = this.f.a(intentRegisterReceiver);
        gpnVar.c();
        gpm gpmVar2 = (gpm) gpnVar.a;
        if (gpoVarA == null) {
            throw new NullPointerException();
        }
        gpmVar2.c = gpoVarA;
        gpmVar2.a |= 2;
        float fFloatValue = this.c.floatValue();
        dgr dgrVar = this.f;
        float intExtra = fFloatValue - (intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1));
        gpnVar.c();
        gpm gpmVar3 = (gpm) gpnVar.a;
        gpmVar3.a |= 4;
        gpmVar3.d = intExtra;
        gpm gpmVar4 = (gpm) ((fin) gpnVar.h());
        gpl gplVar = (gpl) ((fio) gpk.i.a(dp.au, (Object) null));
        gplVar.c();
        gpk gpkVar = (gpk) gplVar.a;
        if (gpmVar4 == null) {
            throw new NullPointerException();
        }
        gpkVar.c = gpmVar4;
        gpkVar.a |= 2;
        if (this.a != null && this.a.exists()) {
            try {
                byte[] bArrA = dgr.a(this.a, this.f.d);
                Deflater deflater = new Deflater(9);
                deflater.setInput(bArrA);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArrA.length);
                deflater.finish();
                byte[] bArr = new byte[1024];
                while (!deflater.finished()) {
                    byteArrayOutputStream.write(bArr, 0, deflater.deflate(bArr));
                }
                byteArrayOutputStream.close();
                fgy fgyVarA = fgy.a(byteArrayOutputStream.toByteArray());
                gplVar.c();
                gpk gpkVar2 = (gpk) gplVar.a;
                if (fgyVarA == null) {
                    throw new NullPointerException();
                }
                gpkVar2.a |= 1;
                gpkVar2.b = fgyVarA;
                this.f.i();
            } catch (IOException e) {
                String strValueOf = String.valueOf(this.a);
                dkm.c("CpuProfilingService", new StringBuilder(String.valueOf(strValueOf).length() + 20).append("Unable to read file ").append(strValueOf).toString(), e, new Object[0]);
            }
        } else {
            dkm.a("CpuProfilingService", "Missing trace file", new Object[0]);
        }
        double d = this.f.g;
        gplVar.c();
        gpk gpkVar3 = (gpk) gplVar.a;
        gpkVar3.a |= 4;
        gpkVar3.d = d;
        int i = this.f.e;
        gplVar.c();
        gpk gpkVar4 = (gpk) gplVar.a;
        gpkVar4.a |= 32;
        gpkVar4.g = i;
        if (lValueOf.longValue() - this.e.longValue() < 2147483647L) {
            gplVar.a((int) (lValueOf.longValue() - this.e.longValue()));
        } else {
            gplVar.a(-1);
        }
        int i2 = this.f.f;
        gplVar.c();
        gpk gpkVar5 = (gpk) gplVar.a;
        gpkVar5.a |= 8;
        gpkVar5.e = i2;
        int i3 = this.f.d;
        gplVar.c();
        gpk gpkVar6 = (gpk) gplVar.a;
        gpkVar6.a |= 64;
        gpkVar6.h = i3;
        if (((gpk) gplVar.a).b.b() > 0) {
            gts gtsVar = (gts) ((fio) gtr.y.a(dp.au, (Object) null));
            gtsVar.c();
            gtr gtrVar = (gtr) gtsVar.a;
            gtrVar.s = (gpk) ((fin) gplVar.h());
            gtrVar.a |= 262144;
            this.f.a((gtr) ((fin) gtsVar.h()));
        }
        this.f.g();
    }
}
