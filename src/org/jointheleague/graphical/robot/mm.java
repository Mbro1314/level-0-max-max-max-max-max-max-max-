package org.jointheleague.graphical.robot;

import javax.swing.JOptionPane;

public class mm {

	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {
		for (int i = 0; i < 1000000; i++) {

			String age = JOptionPane.showInputDialog("write some thing");
			speak(age);
		}
		// 2. ask the user for a sentence
		// 3. call the speak method below and send it the sentence
		// 4. repeat steps 2 and 3 a lot of times
	}

	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
