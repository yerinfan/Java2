package kr.ac.kopo.file.view;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class consoleView {

	Scanner sc;
	private String currentPath = "C:/"; // 기본 경로
	
	public consoleView() {
		sc = new Scanner(System.in);
	}
	
	public void viewRoute(String currentPath) {

		File dir = new File(currentPath); 
		File[] fileList = dir.listFiles();

		if (fileList != null) {
			System.out.printf("%-20s%-10s%-30s%-10s\n", "이름", "종류", "마지막 수정 시간", "크기");
			System.out.println("-----------------------------------------------------------");

			for (File file : fileList) {
				String type = file.isDirectory() ? "Dir" : "File";
				String lastModified = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified());
				long size = file.isFile() ? file.length() / (1024 * 1024) : 0; 

				System.out.printf("%-20s%-10s%-30s%-10s\n", file.getName(), type, lastModified, size + "MB");
			}

			System.out.println("-----------------------------------------------------------");

		} else {
			System.out.println("디렉터리를 읽을 수 없습니다.");

		}

		System.out.println("\n폴더이동(m), 이름변경(r), 파일 생성(n), 디렉토리 생성(mkdir), 파일삭제(rm), 종료(q): ");
		
		
	}

	public String move() {
		
		System.out.println("이동할 폴더 이름을 입력하세요: ");
		String folderName = sc.nextLine();
		File newDir = new File(currentPath + "/" + folderName);
		if (newDir.isDirectory()) {
			currentPath = newDir.getPath();
		} else {
			System.out.println("존재하지 않는 폴더입니다.");
		}
		
		return folderName;
	}

	public void remove() {
		System.out.println("삭제할 파일 이름을 입력하세요: ");
		String fileName = sc.nextLine();

		File fileToDelete = new File(currentPath + "/" + fileName);
		if (fileToDelete.isFile()) {
			if (fileToDelete.delete()) {
				System.out.println(fileName + " 삭제 완료");
			} else {
				System.out.println("파일 삭제에 실패했습니다.");
			}
		} else {
			System.out.println("해당 파일이 없습니다.");
		}
	}

	public void rename() {
		System.out.println("이름 변경할 파일을 입력하세요: ");
		String oldName = sc.nextLine();
		System.out.println("새 이름을 입력하세요: ");
		String newName = sc.nextLine();

		File oldFile = new File(currentPath + "/" + oldName);
		File newFile = new File(currentPath + "/" + newName);

		if (oldFile.renameTo(newFile)) {
			System.out.println(oldName + "이(가) " + newName + "으로 변경됨.");
		} else {
			System.out.println("이름 변경에 실패하였습니다.");
		}
	}

	public void newFile() {
		System.out.println("생성 할 파일의 이름을 설정하세요. : ");
		String fileName = sc.nextLine();
		
		 File newFile = new File(currentPath, fileName);
	        try {
	            if (newFile.createNewFile()) {
	                System.out.println("파일 생성 : " + newFile.getName());
	            } else {
	                System.out.println("파일이 이미 존재합니다.");
	            }
	        } catch (IOException e) {
	            System.out.println("파일 생성 중 오류 발생.");
	            e.printStackTrace();
	        }
		
	}
	
	public void mkdir() {
		System.out.print("생성 할 디렉토리명을 설정하세요. :");
		String dirName = sc.nextLine();
		
        File newDir = new File(currentPath, dirName);
        if (newDir.mkdir()) {
            System.out.println("생성된 디렉토리 : " + newDir.getName());
        } else {
            System.out.println("이미 존재하거나 생성할 수 없습니다.");
        }
    }

}
