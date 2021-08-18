import com.alibaba.fastjson.JSONObject;
import utils.OkHttpApi;

import java.io.IOException;

public class GetHitokoto {

    public String getHitokoto() throws IOException {
        OkHttpApi api = new OkHttpApi();

        String run = api.run("https://v1.hitokoto.cn");
        var jsonObject = JSONObject.parseObject(run);
        String content = jsonObject.getString("hitokoto");

        return content;
    }

    public static void main(String[] args) throws IOException {
        var object = new GetHitokoto();

        for(int i = 0;i < 3;i++){
            System.out.println(object.getHitokoto());
        }
    }
}
