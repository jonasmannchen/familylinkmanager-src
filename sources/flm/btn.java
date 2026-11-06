package flm;

import android.annotation.TargetApi;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(23)
public final class btn {
    public static byte[] a(byte[] bArr) {
        try {
            SecretKey secretKeyA = a();
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            cipher.init(1, secretKeyA);
            byte[] bArr2 = new byte[bArr.length + 16];
            System.arraycopy(((IvParameterSpec) cipher.getParameters().getParameterSpec(IvParameterSpec.class)).getIV(), 0, bArr2, 0, 16);
            cipher.doFinal(bArr, 0, bArr.length, bArr2, 16);
            return bArr2;
        } catch (IOException | GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean a(SecretKey secretKey) {
        try {
            KeyInfo keyInfo = (KeyInfo) SecretKeyFactory.getInstance("AES", "AndroidKeyStore").getKeySpec(secretKey, KeyInfo.class);
            return Arrays.equals(keyInfo.getBlockModes(), new String[]{"CTR"}) && Arrays.equals(keyInfo.getEncryptionPaddings(), new String[]{"NoPadding"}) && keyInfo.getKeySize() == 128 && (keyInfo.getPurposes() & 3) == 3;
        } catch (InvalidKeySpecException e) {
            return false;
        }
    }

    private static SecretKey a() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        SecretKey secretKey = (SecretKey) keyStore.getKey("kids-key", null);
        if (secretKey == null || !a(secretKey)) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder("kids-key", 3).setBlockModes("CTR").setEncryptionPaddings("NoPadding").setKeySize(128).build(), new SecureRandom());
            return keyGenerator.generateKey();
        }
        return secretKey;
    }

    public static byte[] b(byte[] bArr) {
        try {
            SecretKey secretKeyA = a();
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            cipher.init(2, secretKeyA, new IvParameterSpec(bArr, 0, 16));
            return cipher.doFinal(bArr, 16, bArr.length - 16);
        } catch (IOException | GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }
}
