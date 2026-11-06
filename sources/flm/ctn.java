package flm;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ctn extends bdv {
    public static final Parcelable.Creator CREATOR = new ctp();
    public final Account a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;

    public static cto a(Account account, String str, long j) {
        return new cto(account, str, j);
    }

    public ctn(Account account, String str, long j, long j2, long j3, String str2) {
        this.a = account;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str2;
    }

    public ctn(cto ctoVar) {
        this.a = ctoVar.a;
        this.b = ctoVar.b;
        this.c = ctoVar.c;
        this.d = ctoVar.d;
        this.e = ctoVar.e;
        this.f = ctoVar.f;
    }

    public final String toString() {
        String string;
        Account account = this.a;
        if (account == null) {
            string = "null";
        } else {
            string = new StringBuilder(20).append("account#").append(account.name.hashCode() % 20).append("#").toString();
        }
        String str = this.b;
        long j = this.c;
        long j2 = this.d;
        long j3 = this.e;
        String str2 = this.f;
        return new StringBuilder(String.valueOf(string).length() + 186 + String.valueOf(str).length() + String.valueOf(str2).length()).append("UploadRequest{, mAccount=").append(string).append(", mReason='").append(str).append('\'').append(", mDurationMillis=").append(j).append(", mMovingLatencyMillis=").append(j2).append(", mStationaryLatencyMillis=").append(j3).append(", mAppSpecificKey='").append(str2).append('\'').append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctn)) {
            return false;
        }
        ctn ctnVar = (ctn) obj;
        return this.a.equals(ctnVar.a) && this.b.equals(ctnVar.b) && bcx.equal(Long.valueOf(this.c), Long.valueOf(ctnVar.c)) && this.d == ctnVar.d && this.e == ctnVar.e && bcx.equal(this.f, ctnVar.f);
    }

    public final int hashCode() {
        return bcx.hashCode(this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeParcelable(parcel, 2, this.a, i, false);
        bdy.writeString(parcel, 3, this.b, false);
        bdy.writeLong(parcel, 4, this.c);
        bdy.writeLong(parcel, 5, this.d);
        bdy.writeLong(parcel, 6, this.e);
        bdy.writeString(parcel, 7, this.f, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
