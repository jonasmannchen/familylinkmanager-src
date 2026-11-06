package flm;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fwb extends BidirectionalStream.Callback {
    private List a;
    private final /* synthetic */ fwa b;

    fwb(fwa fwaVar) {
        this.b = fwaVar;
    }

    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        synchronized (this.b.n.a) {
            this.b.n.a();
            this.b.n.c = true;
            fwe fweVar = this.b.n;
            for (fwc fwcVar : fweVar.b) {
                fwa fwaVar = fweVar.h;
                ByteBuffer byteBuffer = fwcVar.a;
                boolean z = fwcVar.b;
                boolean z2 = fwcVar.c;
                fwaVar.j.write(byteBuffer, z);
                if (z2) {
                    fwaVar.j.flush();
                }
            }
            fweVar.b.clear();
        }
    }

    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        a(urlResponseInfo.getAllHeadersAsList(), false);
        bidirectionalStream.read(ByteBuffer.allocateDirect(4096));
    }

    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        byteBuffer.flip();
        synchronized (this.b.n.a) {
            this.b.n.f = z;
            if (byteBuffer.remaining() != 0) {
                this.b.n.a(byteBuffer, false);
            }
        }
        if (z && this.a != null) {
            a(this.a, true);
        }
    }

    public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        synchronized (this.b.n.a) {
            if (!this.b.n.g) {
                this.b.n.g = true;
                ghd ghdVar = this.b.d;
            }
            this.b.n.d(byteBuffer.position());
        }
    }

    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        boolean z;
        List asList = headerBlock.getAsList();
        this.a = asList;
        synchronized (this.b.n.a) {
            z = this.b.n.f;
        }
        if (z) {
            a(asList, true);
        }
    }

    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        if (!a()) {
            if (this.a != null) {
                a(this.a, true);
            } else if (urlResponseInfo != null) {
                a(urlResponseInfo.getAllHeadersAsList(), true);
            } else {
                throw new AssertionError("No response header or trailer");
            }
        }
        this.b.a(gbh.a(urlResponseInfo.getHttpStatusCode()));
    }

    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.b.a(fvc.j.b((Throwable) cronetException));
    }

    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        fvc fvcVarA;
        synchronized (this.b.n.a) {
            if (this.b.n.e != null) {
                fvcVarA = this.b.n.e;
            } else if (urlResponseInfo != null) {
                fvcVarA = gbh.a(urlResponseInfo.getHttpStatusCode());
            } else {
                fvcVarA = fvc.c.a("stream cancelled without reason");
            }
        }
        this.b.a(fvcVarA);
    }

    private final void a(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add((String) entry.getKey());
            arrayList.add((String) entry.getValue());
        }
        byte[][] bArr = new byte[arrayList.size()][];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= arrayList.size()) {
                break;
            }
            bArr[i2] = ((String) arrayList.get(i2)).getBytes(Charset.forName("UTF-8"));
            bArr[i2 + 1] = ((String) arrayList.get(i2 + 1)).getBytes(Charset.forName("UTF-8"));
            i = i2 + 2;
        }
        ftv ftvVarA = fth.a(ghj.a(bArr));
        synchronized (this.b.n.a) {
            fwe fweVar = this.b.n;
            if (z) {
                fweVar.b(ftvVarA);
            } else {
                fweVar.a(ftvVarA);
            }
        }
    }

    private final boolean a() {
        boolean z;
        synchronized (this.b.n.a) {
            z = this.a != null && this.b.n.f;
        }
        return z;
    }
}
