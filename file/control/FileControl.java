package kr.ac.kopo.file.control;

import java.io.IOException;
import java.util.Scanner;

import kr.ac.kopo.file.view.consoleView;

public class FileControl {

	private String currentPath = "C:/";
	
	public void start() throws IOException {
		Scanner sc = new Scanner(System.in);
		consoleView view = new consoleView();
		String s;

		while (true) {
			view.viewRoute(currentPath);
			s = sc.nextLine();
			
			switch (s) {
			case ("q"):
				return;
			case ("m"):
				currentPath += view.move();
				break;
			case ("rm"):
				view.remove();
				break;
			case ("r"):
				view.rename();
				break;
			case ("n") :
				view.newFile();
				break;
			case ("mkdir") :
				view.mkdir();
				break;
			}

		}

	}

}
