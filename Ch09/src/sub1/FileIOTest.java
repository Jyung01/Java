package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2026/05/13
 * 이름 : 양지웅
 * 내용 : 9장 자바 파일 입출력 실습
 * */

public class FileIOTest {

	public static void main(String[] args) {
		String source = "C:\\Users\\GGG\\Desktop\\test1.txt";
		String target = "C:\\Users\\GGG\\Desktop\\test2.txt";
		
		// 스트림 생성
		
		try {
			// 입력스트림
			FileInputStream fis = new FileInputStream(source); 
			// 출력스트림
			FileOutputStream fos = new FileOutputStream(target); 
			
			while (true) {
				int data = fis.read();
				
				if(data == -1) { // 파일 내용이 없음
					break;
				}
				
				// 임시 출력
				//char c = (char) data;
				//System.out.print(c);
				
				// 파일 쓰기
				fos.write(data);
				
			}
			
			// 스트림 연결 해제
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
