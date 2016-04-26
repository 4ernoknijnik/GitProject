package taro;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class TestFrame {

	public static void saveImage() throws Exception {

		Robot robot = new Robot();
		System.out.println("blya");
		BufferedImage screenShot = robot.createScreenCapture(new Rectangle(
				Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(screenShot, "JPG", new File("screenShot.jpg"));
		

		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
		Transferable contents = clip.getContents(null);
		System.out.println("1");

		if (contents.isDataFlavorSupported(DataFlavor.imageFlavor)) {
			BufferedImage image = (BufferedImage) contents
					.getTransferData(DataFlavor.imageFlavor);
			System.out.println("2");

			// save in PNG
			File f = new File("C:\\screenShot.jpg");
			ImageIO.write(image, "JPG", f);
			// read
			Image img = ImageIO.read(f);
			BufferedImage bufferedImage = new BufferedImage(img.getWidth(null),
					img.getHeight(null), BufferedImage.TYPE_INT_RGB);
			Graphics2D g = bufferedImage.createGraphics();
			g.drawImage(img, null, null);
			// write in JPG
			ImageIO.write(bufferedImage, "JPG", new File("C:\\screenShot.jpg"));
			// f.delete();
			System.out.println("ch to za");
		}
	}

	public static void main(String[] args) {
		TestFrame tf = new TestFrame();
		try {
			tf.saveImage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
