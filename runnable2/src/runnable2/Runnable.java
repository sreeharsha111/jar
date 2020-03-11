package runnable2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpClient;


public class Runnable {

	public static void main(String[] args) throws IOException {
		try {

            URL url = new URL("http://localhost:8080/slot");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("DELETE");

            if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : "
                                   + conn.getResponseCode());
            }


            System.out.println("Output from Server .... \n deleted");
            

            conn.disconnect();

       } catch (MalformedURLException e) {

            e.printStackTrace();

       } catch (IOException e) {

            e.printStackTrace();

       }

     }

	
	
	

}
