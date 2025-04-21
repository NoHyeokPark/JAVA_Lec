package FreeStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class ApiTest {

	 public static void main(String[] args) {
	        try {
	            // 1. 가져올 API 주소 (무료 예제 API)
	        	URI uri = new URI("https", "jsonplaceholder.typicode.com", "/posts/1", null);
	            URL url = uri.toURL();

	            // 2. 주소로 접속
	            
	            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

	            // 3. 요청 방식은 GET
	            conn.setRequestMethod("GET");

	            // 4. 결과를 읽기
	            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	            String line;
	            StringBuilder response = new StringBuilder();

	            while ((line = reader.readLine()) != null) {
	                response.append(line);
	            }

	            reader.close();

	            // 5. 결과 출력
	            System.out.println("서버에서 받은 데이터:");
	            System.out.println(response.toString());

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
