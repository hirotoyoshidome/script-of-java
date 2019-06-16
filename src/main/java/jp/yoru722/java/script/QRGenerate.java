package jp.yoru722.java.script;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class QRGenerate {
	public static void main(String[] args) {
		// 変換対象のURLを設定する
		String url = "https://github.com/";
		// 出力サイズを設定する(ピクセル)
		int size = 100;
		// ファイルの出力先を設定する
		String output_path = "files/code.png";

		System.out.println("QRコードを生成します");
		generateQRCode(url, size, output_path);
		System.out.println("QRコードを生成しました");
	}

	private static void generateQRCode(String url, int size, String path) {
		String encoding = "UTF-8";
		int margin = 0;

		ConcurrentHashMap hints = new ConcurrentHashMap();
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
		hints.put(EncodeHintType.CHARACTER_SET, encoding);
		hints.put(EncodeHintType.MARGIN, margin);
		QRCodeWriter writer = new QRCodeWriter();
		try {
			BitMatrix bitMatrix = writer.encode(url, BarcodeFormat.QR_CODE, size, size, hints);
			BufferedImage image = MatrixToImageWriter.toBufferedImage(bitMatrix);
			ImageIO.write(image, "png", new File(path));
		} catch (WriterException e) {
			System.out.println("生成に失敗しました");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("予期せぬエラーが発生しました");
		} finally {
			System.out.println("終了します");
		}
	}
}
