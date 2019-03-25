package swing;

import javax.swing.JFrame;

/**
 * @author rutpatel
 *
 */
public class MyFrame {

	public static void main(String[] args) {

		JFrame jFrame = null;
		jFrame = new JFrame("New Window");
		System.out.println(jFrame.hashCode());

		JFrame test = jFrame;
		System.out.println(test.hashCode());

		JFrame jf = null;
		jf = new JFrame("New Window");
		System.out.println(jf.hashCode());

		// jf.setSize(500,500);
		// jf.setVisible(true);
	}
}
