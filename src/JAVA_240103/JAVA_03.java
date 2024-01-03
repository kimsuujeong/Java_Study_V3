package JAVA_240103;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JAVA_03 {

	public static void main(String[] args) throws IOException {
		// Load the image

		int i = 0;
		while (i < 10) {
			
			i++;
			System.out.println("교수님을 개때립니다.");
			
		}
		System.out.println("아이고 종강(정강)이야!!");
		File file = new File(
				"C:\\Users\\theha\\OneDrive\\바탕 화면\\JAVA_STUDY_EX\\Java_Study_V3\\src\\JAVA_240103\\다운로드.jpg");
		BufferedImage bufferedImage = ImageIO.read(file);

		ImageIcon imageIcon = new ImageIcon(bufferedImage);
		JFrame jFrame = new JFrame();

		jFrame.setLayout(new FlowLayout());

		jFrame.setSize(500, 900);
		JLabel jLabel = new JLabel();

		jLabel.setIcon(imageIcon);
		jFrame.add(jLabel);
		jFrame.setVisible(true);

		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
