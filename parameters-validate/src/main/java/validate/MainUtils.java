package validate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainUtils {
    @Test
    public void test1() throws IOException {
        String path = "config/validate.json";
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(path);
        BufferedReader in = new BufferedReader(new InputStreamReader(is));
        StringBuffer buffer = new StringBuffer();
        String line = "";
        while ((line = in.readLine()) != null){
            buffer.append(line);
        }
        String jsonStr = buffer.toString();
        JSONObject jsonObject = JSON.parseObject(jsonStr);
        System.out.println(jsonObject.toString());
    }
}
