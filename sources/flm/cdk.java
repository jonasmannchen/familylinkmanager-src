package flm;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdk extends cdc {
    private final bxr a = bxr.a();

    @Override // flm.cdc
    public final int a(bwg bwgVar, cdb cdbVar) {
        fag fagVar;
        final fag fagVar2;
        if (bwgVar.a == fdc.TYPE_LOCATION_REFRESH) {
            btv.c("Location", "Processing location refresh policy", new Object[0]);
            fbu fbuVar = (fbu) fin.b(fbu.c, bwgVar.f);
            if (fbuVar.b == null) {
                fagVar = fag.l;
            } else {
                fagVar = fbuVar.b;
            }
            btt.b(fagVar.b);
            final bxr bxrVar = this.a;
            if (fbuVar.b == null) {
                fagVar2 = fag.l;
            } else {
                fagVar2 = fbuVar.b;
            }
            if (bxrVar.d == null || bxrVar.d.isDone() || bxrVar.d.isCancelled()) {
                bxrVar.d = bxrVar.c.submit(new Runnable(bxrVar, fagVar2) { // from class: flm.bxs
                    private final bxr a;
                    private final fag b;

                    {
                        this.a = bxrVar;
                        this.b = fagVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bxr bxrVar2 = this.a;
                        fag fagVar3 = this.b;
                        btv.c("Location", "[%s] Location refresh started, session id %s", "LocationRefresher", fagVar3.b);
                        btt.c(fagVar3.b);
                        bxo.a("Refresh started");
                        bxt bxtVar = bxrVar2.a;
                        apx apxVarA = bxtVar.a.a(10L, TimeUnit.SECONDS);
                        if (apxVarA.b()) {
                            btv.c("Location", "[%s] Google API client connected", "LocationReporter");
                            try {
                                boolean zA = bxtVar.a(fagVar3);
                                if (zA) {
                                    btt.f(fagVar3.b);
                                    zA = true;
                                } else {
                                    int i = 0;
                                    while (!zA && i < fagVar3.i) {
                                        btv.c("Location", "[%s] Force syncing ULR settings, attempt %s of %s with delay of %s millis", "LocationReporter", Integer.valueOf(i), Integer.valueOf(fagVar3.i), Integer.valueOf(fagVar3.j));
                                        i++;
                                        zA = bxtVar.b(fagVar3);
                                    }
                                    if (zA) {
                                        btt.f(fagVar3.b);
                                        btv.c("Location", "[%s] Reporting ready after force sync", "LocationReporter");
                                    } else {
                                        btt.g(fagVar3.b);
                                        btv.d("Location", "[%s] Reporting not ready, all force sync attempts exhausted", "LocationReporter");
                                    }
                                }
                                if (zA) {
                                    btv.c("Location", "[%s] Requesting continuous upload with latency %s for duration %s", "LocationReporter", Integer.valueOf(fagVar3.e), Integer.valueOf(fagVar3.d));
                                    long jB = bxtVar.c.k().b("key_location_upload_request_id");
                                    if (jB != 0) {
                                        btv.c("Location", "[%s] Cancelling previous upload request id: %s", "LocationReporter", Long.valueOf(jB));
                                        Status status = (Status) bxtVar.b.a(bxtVar.a, jB).await(10L, TimeUnit.SECONDS);
                                        if (!status.a()) {
                                            btv.d("Location", "[%s] Failed to cancel previous upload: %s", "LocationReporter", status);
                                        }
                                    } else {
                                        btv.c("Location", "[%s] No previous request id found", "LocationReporter");
                                    }
                                    cto ctoVarA = ctn.a(bts.c(), String.format("LoggingId: %s | Continuous upload for location refresh from kids module", fagVar3.b), fagVar3.d);
                                    ctoVarA.d = fagVar3.e;
                                    ctoVarA.e = fagVar3.e;
                                    ctoVarA.f = "KidsLocationRefresh";
                                    ctg ctgVar = (ctg) bxtVar.b.a(bxtVar.a, new ctn(ctoVarA)).await(10L, TimeUnit.SECONDS);
                                    if (ctgVar.b().a()) {
                                        btt.i(fagVar3.b);
                                        long jA = ctgVar.a();
                                        btv.c("Location", "[%s] Recording upload request id: %s", "LocationReporter", Long.valueOf(jA));
                                        bxtVar.c.k().a("key_location_upload_request_id", jA);
                                        bxo.a("Requested upload");
                                    } else {
                                        btt.b(fagVar3.b, ctgVar.b());
                                        btv.e("Location", "[%s] Error while requesting upload: %s", "LocationReporter", ctgVar.b());
                                    }
                                }
                                bxtVar.a.d();
                                btv.c("Location", "[%s] Google API client disconnected", "LocationReporter");
                            } catch (Throwable th) {
                                bxtVar.a.d();
                                btv.c("Location", "[%s] Google API client disconnected", "LocationReporter");
                                throw th;
                            }
                        } else {
                            btt.a(fagVar3.b, apxVarA);
                            btv.e("Location", "[%s] Error connecting to Google API client", "LocationReporter");
                        }
                        bxp bxpVar = bxrVar2.b;
                        HandlerThread handlerThread = new HandlerThread("LocationFixer handler");
                        btv.a("Location", "[%s] Starting location fixes for refresh session %s", "LocationFixer", fagVar3.b);
                        CountDownLatch countDownLatch = new CountDownLatch(fagVar3.c);
                        bxq bxqVar = new bxq(countDownLatch, fagVar3);
                        try {
                            try {
                                try {
                                    btv.c("Location", "[%s] Requesting %s high accuracy location fixes", "LocationFixer", Integer.valueOf(fagVar3.c));
                                    handlerThread.start();
                                    cre creVar = bxpVar.a;
                                    LocationRequest locationRequest = new LocationRequest();
                                    int i2 = fagVar3.c;
                                    if (i2 <= 0) {
                                        throw new IllegalArgumentException(new StringBuilder(31).append("invalid numUpdates: ").append(i2).toString());
                                    }
                                    locationRequest.f = i2;
                                    long j = fagVar3.f;
                                    LocationRequest.a(j);
                                    locationRequest.b = j;
                                    if (!locationRequest.d) {
                                        locationRequest.c = (long) (locationRequest.b / 6.0d);
                                    }
                                    long j2 = fagVar3.g;
                                    LocationRequest.a(j2);
                                    locationRequest.d = true;
                                    locationRequest.c = j2;
                                    LocationRequest.a(100);
                                    locationRequest.a = 100;
                                    Looper looper = handlerThread.getLooper();
                                    csx csxVarA = csx.a(locationRequest);
                                    if (looper == null) {
                                        bdi.checkState(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
                                        looper = Looper.myLooper();
                                    }
                                    String simpleName = crt.class.getSimpleName();
                                    bdi.checkNotNull(bxqVar, "Listener must not be null");
                                    bdi.checkNotNull(looper, "Looper must not be null");
                                    bdi.checkNotNull(simpleName, "Listener type must not be null");
                                    axp axpVar = new axp(looper, bxqVar, simpleName);
                                    crf crfVar = new crf(axpVar, csxVarA, axpVar);
                                    crg crgVar = new crg(creVar, axpVar.b);
                                    bdi.checkNotNull(crfVar);
                                    bdi.checkNotNull(crgVar);
                                    bdi.checkNotNull(crfVar.a.b, "Listener has already been released.");
                                    bdi.checkNotNull(crgVar.a, "Listener has already been released.");
                                    bdi.checkArgument(crfVar.a.b.equals(crgVar.a), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
                                    awt awtVar = creVar.f;
                                    dbk dbkVar = new dbk();
                                    awtVar.o.sendMessage(awtVar.o.obtainMessage(8, new axu(new aul(new axw(crfVar, crgVar), dbkVar), awtVar.k.get(), creVar)));
                                    dbp.a(dbkVar.a, 10000L, TimeUnit.MILLISECONDS);
                                    if (countDownLatch.await(fagVar3.k, TimeUnit.MILLISECONDS)) {
                                        btv.c("Location", "[%s] Successfully got all location fixes", "LocationFixer");
                                        btt.h(fagVar3.b);
                                    } else {
                                        btt.a(fagVar3.b, (Throwable) new TimeoutException("Timed out waiting for location fixes"));
                                        btv.e("Location", "[%s] Timed out while waiting for location updates", "LocationFixer");
                                    }
                                    handlerThread.quitSafely();
                                    btv.c("Location", "[%s] Location fixes finished, removing location callbacks", "LocationFixer");
                                    bxpVar.a.a(bxqVar);
                                    btv.b("Location", "[%s] Location refresh finished", "LocationRefresher");
                                } catch (InterruptedException e) {
                                    btt.a(fagVar3.b, (Throwable) e);
                                    btv.c("Location", e, "[%s] Interrupted while waiting for location updates", "LocationFixer");
                                    handlerThread.quitSafely();
                                    btv.c("Location", "[%s] Location fixes finished, removing location callbacks", "LocationFixer");
                                    bxpVar.a.a(bxqVar);
                                } catch (TimeoutException e2) {
                                    btt.a(fagVar3.b, (Throwable) e2);
                                    btv.c("Location", e2, "[%s] Timed out while requesting location fixes", "LocationFixer");
                                    handlerThread.quitSafely();
                                    btv.c("Location", "[%s] Location fixes finished, removing location callbacks", "LocationFixer");
                                    bxpVar.a.a(bxqVar);
                                }
                            } catch (ExecutionException e3) {
                                btt.a(fagVar3.b, (Throwable) e3);
                                btv.c("Location", e3.getCause(), "[%s] Failed to request location updates.", "LocationFixer");
                                handlerThread.quitSafely();
                                btv.c("Location", "[%s] Location fixes finished, removing location callbacks", "LocationFixer");
                                bxpVar.a.a(bxqVar);
                            }
                        } catch (Throwable th2) {
                            handlerThread.quitSafely();
                            btv.c("Location", "[%s] Location fixes finished, removing location callbacks", "LocationFixer");
                            bxpVar.a.a(bxqVar);
                            throw th2;
                        }
                    }
                });
            } else {
                btv.d("Location", "[%s] Location refresh is already in progress. Refresh suppressed, session id %s", "LocationRefresher", fagVar2.b);
                btt.d(fagVar2.b);
                bxo.a("Another location refresh is already in progress.");
            }
        }
        return 2;
    }

    @Override // flm.cdc
    public final void a(bwg bwgVar) {
    }
}
