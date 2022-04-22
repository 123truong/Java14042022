

import java.util.Scanner;

public class catChuoiTheoYC {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	
    	scan.useDelimiter("\\Z");
    	//gán s bằng chuoi nhan vao da bỏ het khoảng trang truoc va sau
    	String s = scan.next().trim();
    	
    	//Ktra độ dài đầu vào của chuỗi
    	if (s.length() > 0) {
    		//Loại bỏ cá kí hiệu và đưa chuỗi s vào tokens
    		String[] tokens = s.split("[!,?._'@\\s]+");
    		//Trả về độ dài của chuỗi
    		System.out.println(tokens.length);
    		// Xuất ra từng phần tử trong mảng token
    		for(String token : tokens) {
    			System.out.println(token);
    		}
    	} else {
    		System.out.println(0);
    	}
    	scan.close();
    }
}
