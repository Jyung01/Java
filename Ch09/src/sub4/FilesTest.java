package sub4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*
 * 날짜 : 2026/05/13
 * 이름 : 양지웅
 * 내용 : 9장 자바 Files 클래스 실습 (File 클래스 개선)
 * */

public class FilesTest {

	public static void main(String[] args) {
		
		Path source = Paths.get("C:\\Users\\GGG\\Desktop\\source.txt");
		Path target = Paths.get("C:\\Users\\GGG\\Desktop\\target.txt");
		Path destination = Paths.get("C:\\Users\\GGG\\Desktop\\source.txt");
		
		try {
			// 파일 복사
			Files.copy(source, target);
			
			// 파일 이동
			Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
			
			
			// 파일 삭제
			Files.delete(target);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
