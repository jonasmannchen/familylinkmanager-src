package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bda {
    public static final bdg DEFAULT_STATUS_CONVERTER = new bdb();

    public static dbh toTask(att attVar, bdf bdfVar, bdg bdgVar) {
        dbk dbkVar = new dbk();
        attVar.addStatusListener(new bdc(attVar, dbkVar, bdfVar, bdgVar));
        return dbkVar.a;
    }

    public static dbh toTask(att attVar, bdf bdfVar) {
        return toTask(attVar, bdfVar, DEFAULT_STATUS_CONVERTER);
    }

    public static dbh toResponseTask(att attVar, atx atxVar) {
        return toTask(attVar, new bdd(atxVar));
    }

    public static dbh toVoidTask(att attVar) {
        return toTask(attVar, new bde());
    }
}
