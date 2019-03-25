/**
 * 
 */
package swing;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * @author rutpatel
 *
 */
public class ScrollableTable {

	public static void main(String[] args) {

		JFrame jFrame = new JFrame("Scrollable Table");
		jFrame.setLayout(new BorderLayout());

		JButton b1 = new JButton("B1");
		JButton b2 = new JButton("B2");

		String[] columnNames = { "Name", "Roll Number", "Department", "School Name", "City Name" };
		String[][] data = { { "Kundan Kumar Jha", "4031", "CSE", "BVM", "New Jersey" },
				{ "Anand Jha", "6014", "IT", "BVM", "New Jersey" } };

		JTable t1 = new JTable(data, columnNames);

		JScrollPane jsp = new JScrollPane(t1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		t1.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getPoint());

			}
		});

		JButton b4 = new JButton("B4");
		JButton b5 = new JButton("B5");

		jFrame.add(b1, BorderLayout.NORTH);
		jFrame.add(b2, BorderLayout.SOUTH);

		jFrame.add(jsp, BorderLayout.CENTER);

		jFrame.add(b4, BorderLayout.EAST);
		jFrame.add(b5, BorderLayout.WEST);

		jFrame.setSize(500, 300);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}
}
