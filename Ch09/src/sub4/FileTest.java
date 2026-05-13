package sub4;

import java.io.File;
import java.io.IOException;

/*
 * 날짜 : 2026/05/13
 * 이름 : 양지웅
 * 내용 : 9장 자바 File 클래스 실습
 * */


public class FileTest {

	public static void main(String[] args) {
		String source = "C:\\Users\\GGG\\Desktop\\test3.txt";
		String target = "C:\\Users\\GGG\\Desktop\\test";
		
		
		// 파일 객체 생성
		File f1 = new File(source);
		File f2 = new File(target);
		
		try {
			// 파일 생성
			f1.createNewFile();
			f2.mkdir();
			
			// 파일 정보
			System.out.println("file1 존재 여부 : " + f1.exists());
			System.out.println("file2 존재 여부 : " + f2.exists());
			System.out.println("file1 파일 여부 : " + f1.isFile());
			System.out.println("file2 폴더 여부 : " + f2.isDirectory());
			System.out.println("file1 파일 이름 : " + f1.getName());
			System.out.println("file2 파일 이름 : " + f2.getName());
			System.out.println("file1 파일 경로 : " + f1.getPath());
			System.out.println("file2 파일 경로 : " + f2.getPath());
			System.out.println("file1 절대 경로 : " + f1.getAbsolutePath());
			System.out.println("file2 절대 경로 : " + f2.getAbsolutePath());
			
			// 파일 삭제
			f1.delete();
			f2.delete();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
