package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import flm.amc;
import flm.bbz;
import flm.bdi;
import flm.bdv;
import flm.bdy;
import flm.big;
import flm.bij;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInAccount extends bdv implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new amc();
    private static big m = bij.a;
    public final int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Uri f;
    public String g;
    public long h;
    public String i;
    public List j;
    public String k;
    public String l;
    private Set n = new HashSet();

    public static GoogleSignInAccount a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl", null);
        Uri uri = TextUtils.isEmpty(strOptString) ? null : Uri.parse(strOptString);
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString(bbz.MARKET_URI_PARAM_ID);
        String strOptString3 = jSONObject.optString("tokenId", null);
        String strOptString4 = jSONObject.optString("email", null);
        String strOptString5 = jSONObject.optString("displayName", null);
        String strOptString6 = jSONObject.optString("givenName", null);
        String strOptString7 = jSONObject.optString("familyName", null);
        Long lValueOf = Long.valueOf(j);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, (lValueOf == null ? Long.valueOf(m.a() / 1000) : lValueOf).longValue(), bdi.checkNotEmpty(jSONObject.getString("obfuscatedIdentifier")), new ArrayList((Collection) bdi.checkNotNull(hashSet)), strOptString6, strOptString7);
        googleSignInAccount.g = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccount;
    }

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uri;
        this.g = str5;
        this.h = j;
        this.i = str6;
        this.j = list;
        this.k = str7;
        this.l = str8;
    }

    public final Set a() {
        HashSet hashSet = new HashSet(this.j);
        hashSet.addAll(this.n);
        return hashSet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, this.a);
        bdy.writeString(parcel, 2, this.b, false);
        bdy.writeString(parcel, 3, this.c, false);
        bdy.writeString(parcel, 4, this.d, false);
        bdy.writeString(parcel, 5, this.e, false);
        bdy.writeParcelable(parcel, 6, this.f, i, false);
        bdy.writeString(parcel, 7, this.g, false);
        bdy.writeLong(parcel, 8, this.h);
        bdy.writeString(parcel, 9, this.i, false);
        bdy.writeTypedList(parcel, 10, this.j, false);
        bdy.writeString(parcel, 11, this.k, false);
        bdy.writeString(parcel, 12, this.l, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public int hashCode() {
        return ((this.i.hashCode() + 527) * 31) + a().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.i.equals(this.i) && googleSignInAccount.a().equals(a());
    }
}
