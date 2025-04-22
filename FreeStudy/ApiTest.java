package FreeStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;

public class ApiTest {

	 public static void main(String[] args) {
	        try {
	            // 1. 가져올 API 주소 (무료 예제 API)
	        	 String apiKey = "fd1abdaa52eb35ca498665b4c6dba9e8";  // <-- 여기에 본인 키 입력!
	             String query = URLEncoder.encode("카카오", "UTF-8");
	        	
	             //uri 생성
	             URI uri = new URI(
	                     "https", 
	                     "dapi.kakao.com", 
	                     "/v2/search/web", 
	                     "query=" + query, 
	                     null
	                 );

	            // 2. 주소로 접속
	            
	        	URL url = uri.toURL();
	            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

	            // 3. 요청 방식은 GET
	            conn.setRequestMethod("GET");
	            conn.setRequestProperty("Authorization", "KakaoAK " + apiKey);

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
