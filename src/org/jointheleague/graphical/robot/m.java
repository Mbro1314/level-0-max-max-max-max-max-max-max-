package org.jointheleague.graphical.robot;

import java.util.Random;

import javax.swing.JOptionPane;

public class m {
	public static void main(String[] args) {
		int rand = new Random().nextInt(10);
		for (int i = 0; i < rand; i++) {

			JOptionPane.showMessageDialog(null,
					"one smart fellow; he felt smart\n  Two smart fellows; they felt smart\n Three smart fellows; they all felt smart.");
		}
	}
}