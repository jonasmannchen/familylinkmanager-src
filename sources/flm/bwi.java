package flm;

import com.google.android.gms.kids.database.SupervisionDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwi extends cr {
    private final /* synthetic */ SupervisionDatabase_Impl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwi(SupervisionDatabase_Impl supervisionDatabase_Impl, int i) {
        super(16);
        this.b = supervisionDatabase_Impl;
    }

    @Override // flm.cr
    public final void b(bo boVar) {
        boVar.c("CREATE TABLE IF NOT EXISTS `ActivitySampleEntity` (`key` INTEGER NOT NULL, `activityRecognitionResult` BLOB NOT NULL, PRIMARY KEY(`key`))");
        boVar.c("CREATE TABLE IF NOT EXISTS `AppPendingDisableEntity` (`packageName` TEXT NOT NULL, `pendingTimestamp` INTEGER NOT NULL, PRIMARY KEY(`packageName`))");
        boVar.c("CREATE TABLE IF NOT EXISTS `AppStateEntity` (`packageName` TEXT NOT NULL, `flags` INTEGER NOT NULL, PRIMARY KEY(`packageName`))");
        boVar.c("CREATE TABLE IF NOT EXISTS `ConsentStatusEntity` (`secondaryAccountEmail` TEXT NOT NULL, `isValid` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`secondaryAccountEmail`))");
        boVar.c("CREATE TABLE IF NOT EXISTS `DeviceEventEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` INTEGER NOT NULL, `timestampMillis` INTEGER NOT NULL, `packageName` TEXT, `value` BLOB)");
        boVar.c("CREATE TABLE IF NOT EXISTS `GeonotificationStateEntity` (`key` INTEGER NOT NULL, `state` BLOB NOT NULL, PRIMARY KEY(`key`))");
        boVar.c("CREATE TABLE IF NOT EXISTS `KeyValue` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
        boVar.c("CREATE TABLE IF NOT EXISTS `KidsModuleInfo` (`key` INTEGER NOT NULL, `apkPackageName` TEXT, `apkVersionCode` INTEGER NOT NULL, `moduleVersion` INTEGER NOT NULL, PRIMARY KEY(`key`))");
        boVar.c("CREATE TABLE IF NOT EXISTS `LocationSampleEntity` (`key` INTEGER NOT NULL, `location` BLOB NOT NULL, PRIMARY KEY(`key`))");
        boVar.c("CREATE TABLE IF NOT EXISTS `PartialConsentForSecondaryAccountSignIn` (`key` INTEGER NOT NULL, `parentObfuscatedGaiaId` TEXT NOT NULL, `reauthProofToken` TEXT NOT NULL, `consentTextVersion` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`key`))");
        boVar.c("CREATE TABLE IF NOT EXISTS `PolicyEntity` (`type` INTEGER NOT NULL, `subKey` TEXT NOT NULL, `generation` INTEGER NOT NULL, `version` TEXT, `status` INTEGER NOT NULL, `value` BLOB, PRIMARY KEY(`type`, `subKey`))");
        boVar.c("CREATE TABLE IF NOT EXISTS `TimeLimitKeyValueEntity` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
        boVar.c("CREATE TABLE IF NOT EXISTS `TimeLimitLocalOverrideEntity` (`uuid` TEXT NOT NULL, `action` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `entryVersion` INTEGER NOT NULL, `entryId` TEXT NOT NULL, PRIMARY KEY(`uuid`))");
        boVar.c("CREATE TABLE IF NOT EXISTS `TrackedPlace` (`familyPlaceId` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, PRIMARY KEY(`familyPlaceId`))");
        boVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        boVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"a7719730905a8ef358258285b082de24\")");
    }

    @Override // flm.cr
    public final void a(bo boVar) {
        boVar.c("DROP TABLE IF EXISTS `ActivitySampleEntity`");
        boVar.c("DROP TABLE IF EXISTS `AppPendingDisableEntity`");
        boVar.c("DROP TABLE IF EXISTS `AppStateEntity`");
        boVar.c("DROP TABLE IF EXISTS `ConsentStatusEntity`");
        boVar.c("DROP TABLE IF EXISTS `DeviceEventEntity`");
        boVar.c("DROP TABLE IF EXISTS `GeonotificationStateEntity`");
        boVar.c("DROP TABLE IF EXISTS `KeyValue`");
        boVar.c("DROP TABLE IF EXISTS `KidsModuleInfo`");
        boVar.c("DROP TABLE IF EXISTS `LocationSampleEntity`");
        boVar.c("DROP TABLE IF EXISTS `PartialConsentForSecondaryAccountSignIn`");
        boVar.c("DROP TABLE IF EXISTS `PolicyEntity`");
        boVar.c("DROP TABLE IF EXISTS `TimeLimitKeyValueEntity`");
        boVar.c("DROP TABLE IF EXISTS `TimeLimitLocalOverrideEntity`");
        boVar.c("DROP TABLE IF EXISTS `TrackedPlace`");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cr
    public final void d(bo boVar) {
        if (this.b.d != null) {
            int size = this.b.d.size();
            for (int i = 0; i < size; i++) {
                this.b.d.get(i);
            }
        }
    }

    @Override // flm.cr
    public final void c(bo boVar) {
        this.b.a = boVar;
        this.b.a(boVar);
        if (this.b.d != null) {
            int size = this.b.d.size();
            for (int i = 0; i < size; i++) {
                this.b.d.get(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cr
    public final void e(bo boVar) {
        HashMap map = new HashMap(2);
        map.put("key", new cx("key", "INTEGER", true, 1));
        map.put("activityRecognitionResult", new cx("activityRecognitionResult", "BLOB", true, 0));
        cw cwVar = new cw("ActivitySampleEntity", map, new HashSet(0), new HashSet(0));
        cw cwVarA = cw.a(boVar, "ActivitySampleEntity");
        if (!cwVar.equals(cwVarA)) {
            String strValueOf = String.valueOf(cwVar);
            String strValueOf2 = String.valueOf(cwVarA);
            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf).length() + 134 + String.valueOf(strValueOf2).length()).append("Migration didn't properly handle ActivitySampleEntity(com.google.android.gms.kids.database.ActivitySampleEntity).\n Expected:\n").append(strValueOf).append("\n Found:\n").append(strValueOf2).toString());
        }
        HashMap map2 = new HashMap(2);
        map2.put("packageName", new cx("packageName", "TEXT", true, 1));
        map2.put("pendingTimestamp", new cx("pendingTimestamp", "INTEGER", true, 0));
        cw cwVar2 = new cw("AppPendingDisableEntity", map2, new HashSet(0), new HashSet(0));
        cw cwVarA2 = cw.a(boVar, "AppPendingDisableEntity");
        if (!cwVar2.equals(cwVarA2)) {
            String strValueOf3 = String.valueOf(cwVar2);
            String strValueOf4 = String.valueOf(cwVarA2);
            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf3).length() + 140 + String.valueOf(strValueOf4).length()).append("Migration didn't properly handle AppPendingDisableEntity(com.google.android.gms.kids.database.AppPendingDisableEntity).\n Expected:\n").append(strValueOf3).append("\n Found:\n").append(strValueOf4).toString());
        }
        HashMap map3 = new HashMap(2);
        map3.put("packageName", new cx("packageName", "TEXT", true, 1));
        map3.put("flags", new cx("flags", "INTEGER", true, 0));
        cw cwVar3 = new cw("AppStateEntity", map3, new HashSet(0), new HashSet(0));
        cw cwVarA3 = cw.a(boVar, "AppStateEntity");
        if (!cwVar3.equals(cwVarA3)) {
            String strValueOf5 = String.valueOf(cwVar3);
            String strValueOf6 = String.valueOf(cwVarA3);
            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf5).length() + 122 + String.valueOf(strValueOf6).length()).append("Migration didn't properly handle AppStateEntity(com.google.android.gms.kids.database.AppStateEntity).\n Expected:\n").append(strValueOf5).append("\n Found:\n").append(strValueOf6).toString());
        }
        HashMap map4 = new HashMap(3);
        map4.put("secondaryAccountEmail", new cx("secondaryAccountEmail", "TEXT", true, 1));
        map4.put("isValid", new cx("isValid", "INTEGER", true, 0));
        map4.put("timestamp", new cx("timestamp", "INTEGER", true, 0));
        cw cwVar4 = new cw("ConsentStatusEntity", map4, new HashSet(0), new HashSet(0));
        cw cwVarA4 = cw.a(boVar, "ConsentStatusEntity");
        if (!cwVar4.equals(cwVarA4)) {
            String strValueOf7 = String.valueOf(cwVar4);
            String strValueOf8 = String.valueOf(cwVarA4);
            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf7).length() + 132 + String.valueOf(strValueOf8).length()).append("Migration didn't properly handle ConsentStatusEntity(com.google.android.gms.kids.database.ConsentStatusEntity).\n Expected:\n").append(strValueOf7).append("\n Found:\n").append(strValueOf8).toString());
        }
        HashMap map5 = new HashMap(5);
        map5.put(bbz.MARKET_URI_PARAM_ID, new cx(bbz.MARKET_URI_PARAM_ID, "INTEGER", true, 1));
        map5.put("type", new cx("type", "INTEGER", true, 0));
        map5.put("timestampMillis", new cx("timestampMillis", "INTEGER", true, 0));
        map5.put("packageName", new cx("packageName", "TEXT", false, 0));
        map5.put("value", new cx("value", "BLOB", false, 0));
        cw cwVar5 = new cw("DeviceEventEntity", map5, new HashSet(0), new HashSet(0));
        cw cwVarA5 = cw.a(boVar, "DeviceEventEntity");
        if (!cwVar5.equals(cwVarA5)) {
            String strValueOf9 = String.valueOf(cwVar5);
            String strValueOf10 = String.valueOf(cwVarA5);
            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf9).length() + 128 + String.valueOf(strValueOf10).length()).append("Migration didn't properly handle DeviceEventEntity(com.google.android.gms.kids.database.DeviceEventEntity).\n Expected:\n").append(strValueOf9).append("\n Found:\n").append(strValueOf10).toString());
        }
        HashMap map6 = new HashMap(2);
        map6.put("key", new cx("key", "INTEGER", true, 1));
        map6.put("state", new cx("state", "BLOB", true, 0));
        cw cwVar6 = new cw("GeonotificationStateEntity", map6, new HashSet(0), new HashSet(0));
        cw cwVarA6 = cw.a(boVar, "GeonotificationStateEntity");
        if (!cwVar6.equals(cwVarA6)) {
            String strValueOf11 = String.valueOf(cwVar6);
            String strValueOf12 = String.valueOf(cwVarA6);
            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf11).length() + 146 + String.valueOf(strValueOf12).length()).append("Migration didn't properly handle GeonotificationStateEntity(com.google.android.gms.kids.database.GeonotificationStateEntity).\n Expected:\n").append(strValueOf11).append("\n Found:\n").append(strValueOf12).toString());
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new cx("key", "TEXT", true, 1));
        map7.put("value", new cx("value", "TEXT", false, 0));
        cw cwVar7 = new cw("KeyValue", map7, new HashSet(0), new HashSet(0));
        cw cwVarA7 = cw.a(boVar, "KeyValue");
        if (!cwVar7.equals(cwVarA7)) {
            String strValueOf13 = String.valueOf(cwVar7);
            String strValueOf14 = String.valueOf(cwVarA7);
            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf13).length() + 110 + String.valueOf(strValueOf14).length()).append("Migration didn't properly handle KeyValue(com.google.android.gms.kids.database.KeyValue).\n Expected:\n").append(strValueOf13).append("\n Found:\n").append(strValueOf14).toString());
        }
        HashMap map8 = new HashMap(4);
        map8.put("key", new cx("key", "INTEGER", true, 1));
        map8.put("apkPackageName", new cx("apkPackageName", "TEXT", false, 0));
        map8.put("apkVersionCode", new cx("apkVersionCode", "INTEGER", true, 0));
        map8.put("moduleVersion", new cx("moduleVersion", "INTEGER", true, 0));
        cw cwVar8 = new cw("KidsModuleInfo", map8, new HashSet(0), new HashSet(0));
        cw cwVarA8 = cw.a(boVar, "KidsModuleInfo");
        if (!cwVar8.equals(cwVarA8)) {
            String strValueOf15 = String.valueOf(cwVar8);
            String strValueOf16 = String.valueOf(cwVarA8);
            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf15).length() + 122 + String.valueOf(strValueOf16).length()).append("Migration didn't properly handle KidsModuleInfo(com.google.android.gms.kids.database.KidsModuleInfo).\n Expected:\n").append(strValueOf15).append("\n Found:\n").append(strValueOf16).toString());
        }
        HashMap map9 = new HashMap(2);
        map9.put("key", new cx("key", "INTEGER", true, 1));
        map9.put("location", new cx("location", "BLOB", true, 0));
        cw cwVar9 = new cw("LocationSampleEntity", map9, new HashSet(0), new HashSet(0));
        cw cwVarA9 = cw.a(boVar, "LocationSampleEntity");
        if (!cwVar9.equals(cwVarA9)) {
            String strValueOf17 = String.valueOf(cwVar9);
            String strValueOf18 = String.valueOf(cwVarA9);
            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf17).length() + 134 + String.valueOf(strValueOf18).length()).append("Migration didn't properly handle LocationSampleEntity(com.google.android.gms.kids.database.LocationSampleEntity).\n Expected:\n").append(strValueOf17).append("\n Found:\n").append(strValueOf18).toString());
        }
        HashMap map10 = new HashMap(5);
        map10.put("key", new cx("key", "INTEGER", true, 1));
        map10.put("parentObfuscatedGaiaId", new cx("parentObfuscatedGaiaId", "TEXT", true, 0));
        map10.put("reauthProofToken", new cx("reauthProofToken", "TEXT", true, 0));
        map10.put("consentTextVersion", new cx("consentTextVersion", "TEXT", true, 0));
        map10.put("timestamp", new cx("timestamp", "INTEGER", true, 0));
        cw cwVar10 = new cw("PartialConsentForSecondaryAccountSignIn", map10, new HashSet(0), new HashSet(0));
        cw cwVarA10 = cw.a(boVar, "PartialConsentForSecondaryAccountSignIn");
        if (!cwVar10.equals(cwVarA10)) {
            String strValueOf19 = String.valueOf(cwVar10);
            String strValueOf20 = String.valueOf(cwVarA10);
            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf19).length() + 172 + String.valueOf(strValueOf20).length()).append("Migration didn't properly handle PartialConsentForSecondaryAccountSignIn(com.google.android.gms.kids.database.PartialConsentForSecondaryAccountSignIn).\n Expected:\n").append(strValueOf19).append("\n Found:\n").append(strValueOf20).toString());
        }
        HashMap map11 = new HashMap(6);
        map11.put("type", new cx("type", "INTEGER", true, 1));
        map11.put("subKey", new cx("subKey", "TEXT", true, 2));
        map11.put("generation", new cx("generation", "INTEGER", true, 0));
        map11.put("version", new cx("version", "TEXT", false, 0));
        map11.put("status", new cx("status", "INTEGER", true, 0));
        map11.put("value", new cx("value", "BLOB", false, 0));
        cw cwVar11 = new cw("PolicyEntity", map11, new HashSet(0), new HashSet(0));
        cw cwVarA11 = cw.a(boVar, "PolicyEntity");
        if (!cwVar11.equals(cwVarA11)) {
            String strValueOf21 = String.valueOf(cwVar11);
            String strValueOf22 = String.valueOf(cwVarA11);
            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf21).length() + 118 + String.valueOf(strValueOf22).length()).append("Migration didn't properly handle PolicyEntity(com.google.android.gms.kids.database.PolicyEntity).\n Expected:\n").append(strValueOf21).append("\n Found:\n").append(strValueOf22).toString());
        }
        HashMap map12 = new HashMap(2);
        map12.put("key", new cx("key", "TEXT", true, 1));
        map12.put("value", new cx("value", "TEXT", false, 0));
        cw cwVar12 = new cw("TimeLimitKeyValueEntity", map12, new HashSet(0), new HashSet(0));
        cw cwVarA12 = cw.a(boVar, "TimeLimitKeyValueEntity");
        if (!cwVar12.equals(cwVarA12)) {
            String strValueOf23 = String.valueOf(cwVar12);
            String strValueOf24 = String.valueOf(cwVarA12);
            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf23).length() + 140 + String.valueOf(strValueOf24).length()).append("Migration didn't properly handle TimeLimitKeyValueEntity(com.google.android.gms.kids.database.TimeLimitKeyValueEntity).\n Expected:\n").append(strValueOf23).append("\n Found:\n").append(strValueOf24).toString());
        }
        HashMap map13 = new HashMap(5);
        map13.put("uuid", new cx("uuid", "TEXT", true, 1));
        map13.put("action", new cx("action", "INTEGER", true, 0));
        map13.put("timestamp", new cx("timestamp", "INTEGER", true, 0));
        map13.put("entryVersion", new cx("entryVersion", "INTEGER", true, 0));
        map13.put("entryId", new cx("entryId", "TEXT", true, 0));
        cw cwVar13 = new cw("TimeLimitLocalOverrideEntity", map13, new HashSet(0), new HashSet(0));
        cw cwVarA13 = cw.a(boVar, "TimeLimitLocalOverrideEntity");
        if (!cwVar13.equals(cwVarA13)) {
            String strValueOf25 = String.valueOf(cwVar13);
            String strValueOf26 = String.valueOf(cwVarA13);
            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf25).length() + 150 + String.valueOf(strValueOf26).length()).append("Migration didn't properly handle TimeLimitLocalOverrideEntity(com.google.android.gms.kids.database.TimeLimitLocalOverrideEntity).\n Expected:\n").append(strValueOf25).append("\n Found:\n").append(strValueOf26).toString());
        }
        HashMap map14 = new HashMap(3);
        map14.put("familyPlaceId", new cx("familyPlaceId", "TEXT", true, 1));
        map14.put("latitude", new cx("latitude", "REAL", true, 0));
        map14.put("longitude", new cx("longitude", "REAL", true, 0));
        cw cwVar14 = new cw("TrackedPlace", map14, new HashSet(0), new HashSet(0));
        cw cwVarA14 = cw.a(boVar, "TrackedPlace");
        if (!cwVar14.equals(cwVarA14)) {
            String strValueOf27 = String.valueOf(cwVar14);
            String strValueOf28 = String.valueOf(cwVarA14);
            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf27).length() + 118 + String.valueOf(strValueOf28).length()).append("Migration didn't properly handle TrackedPlace(com.google.android.gms.kids.database.TrackedPlace).\n Expected:\n").append(strValueOf27).append("\n Found:\n").append(strValueOf28).toString());
        }
    }
}
