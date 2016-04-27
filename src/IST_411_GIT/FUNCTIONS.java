/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IST_411_GIT;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import javax.swing.JPanel;

/**
 *
 * @author Steven
 */
public class FUNCTIONS {
    public static String INTERFACE_REQUEST(String request_key, String... request_parameters){
        try{
            
            String link="http://www.pennstatedev.com/ist_411/interface.php";
            
            String post_data = "interface_request=" + request_key;
            if(request_parameters.length > 0){
                post_data += "&";
            }
            for(int array_index = 0; array_index < request_parameters.length; array_index += 2) {
                String post_element = request_parameters[array_index];
                if(array_index == 0){
                    post_data += URLEncoder.encode(request_parameters[array_index], "UTF-8") + "=" + URLEncoder.encode(request_parameters[array_index + 1], "UTF-8");
                }else{
                    post_data += "&" + URLEncoder.encode(request_parameters[array_index], "UTF-8") + "=" + URLEncoder.encode(request_parameters[array_index + 1], "UTF-8");
                }
            }
            
            URL url = new URL(link);
            URLConnection conn = url.openConnection();

            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());

            wr.write(post_data);
            wr.flush();

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            StringBuilder sb = new StringBuilder();
            String line = null;

            // Read Server Response
            while((line = reader.readLine()) != null)
            {
                sb.append(line);
                break;
            }
            return sb.toString();
        }
        catch(Exception e){
            return new String("Exception: " + e.getMessage());
        }
    }
}
