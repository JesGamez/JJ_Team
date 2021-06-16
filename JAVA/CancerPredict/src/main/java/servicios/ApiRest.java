package servicios;

import modelo.Cancer;
import com.google.gson.Gson;
import java.io.IOException;
import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ApiRest {
    public static JSONObject datosAPI(Cancer cancer) throws IOException, JSONException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\r\n  \"Inputs\": {\r\n    "
                + "\"input1\": [\r\n      {\r\n        "
                + "\"ct\": "+ cancer.getCt()+ ",\r\n        "
                + "\"ucz\": "+ cancer.getUcz()+ ",\r\n        "
                + "\"ucs\": "+ cancer.getUcs()+ ",\r\n        "
                + "\"ma\": "+ cancer.getMa()+ ",\r\n        "
                + "\"secs\": "+ cancer.getSecs()+ ",\r\n        "
                + "\"bn\": "+ cancer.getBn()+ ",\r\n       "
                + " \"bc\": "+ cancer.getBc()+ ",\r\n        "
                + "\"nn\": "+ cancer.getNn()+ ",\r\n        "
                + "\"mitosis\": "+ cancer.getMitosis()+ ",\r\n        "
                + "\"cancer_type\": '' \r\n      }\r\n    ]\r\n  },\r\n  \"GlobalParameters\": {}\r\n}");
        Request request = new Request.Builder()
                .url("https://ussouthcentral.services.azureml.net/workspaces/89e4437dcb544097abc1c89c901b435a/services/e1bb08d605034ba19b05b0e91cf3ed92//execute?api-version=2.0&format=swagger")
                .method("POST", body)
                .addHeader("Authorization", "Bearer 9w9N0tuRG43LMpddgsnmZ/zmmxk4dFCGiSzBwfbHcQop+y7OF+1iAXg+vUKFVWexkvgDaWA8EEevm9ojmZcn/Q==")
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) {
            throw new IOException("Unexpected code " + response);
        }
        // Convierte la cadena body en un objeto jsonObject
        JSONObject jsonObject = new JSONObject(response.body().string());
        JSONObject cadenaJson = jsonObject.getJSONObject("Results")
                .getJSONArray("output1")
                .getJSONObject(0);
        return cadenaJson;
    }

//    public static JSONObject datosAPI(Cancer cancer) throws IOException, JSONException {
//        OkHttpClient client = new OkHttpClient().newBuilder()
//                .build();
//        MediaType mediaType = MediaType.parse("application/json");
//        RequestBody body = RequestBody.create(mediaType, "{\r\n    \"Inputs\": {\r\n"
//                + " \"input1\": [\r\n  {\r\n "
//                + "\"ct\":" + cancer.getCt() + ",\r\n "
//                + "\"ucz\":" + cancer.getUcz() + ",\r\n "
//                + " \"ucs\":" + cancer.getUcs() + ",\r\n "
//                + " \"ma\":" + cancer.getMa() + ",\r\n "
//                + "\"secs\":" + cancer.getSecs() + ",\r\n "
//                + "\"bn\":" + cancer.getBn() + ",\r\n "
//                + "\"bc\":" + cancer.getBc() + ",\r\n "
//                + "\"nn\":" + cancer.getNn() + ",\r\n  "
//                + "\"mitosis\":" + cancer.getMitosis() + ",\r\n "
//                + "\"cancer_type\": " + cancer.getCancer_type() + "\"\"r\n  }\r\n]"
//                + "\r\n  },\r\n  "
//                + "\"GlobalParameters\": {}\r\n}");
//        Request request = new Request.Builder()
//                .url("https://ussouthcentral.services.azureml.net/workspaces/89e4437dcb544097abc1c89c901b435a/services/e1bb08d605034ba19b05b0e91cf3ed92/execute?api-version=2.0&details=true")
//                .method("POST", body)
//                .addHeader("Authorization", "Bearer 9w9N0tuRG43LMpddgsnmZ/zmmxk4dFCGiSzBwfbHcQop+y7OF+1iAXg+vUKFVWexkvgDaWA8EEevm9ojmZcn/Q==")
//                .addHeader("Content-Type", "application/json")
//                .build();
//        Response response = client.newCall(request).execute();
//        if (!response.isSuccessful()) {
//            throw new IOException("Unexpected code " + response);
//        }
//        
//        // Convierte la cadena body en un objeto jsonObject
//        JSONObject jsonObject = new JSONObject(response.body().string());
//        JSONObject cadenaJson = jsonObject.getJSONObject("Results")
//                .getJSONArray("output1")
//                .getJSONObject(0);
//        return cadenaJson;
//    }
//     public static JSONObject datosAPI(Cancer cancer) throws IOException, JSONException {
//        
//        
////        private int ct,ucz,ucs,ma, secs, bn, bc, nn, mitosis, cancer_type;
//
//        OkHttpClient client = new OkHttpClient().newBuilder()
//                .build();
//        MediaType mediaType = MediaType.parse("application/json");
//        RequestBody body = RequestBody.create(mediaType, "{\r\n    \"Inputs\": {\r\n        "
//                + "\"input1\":[\r\n  {\r\n  "
//                + "\"ColumnNames\": [\r\n  "
//                + " \"ct\":" + cancer.getCt() + " ,\r\n  "
//                + "\"ucz\":" + cancer.getUcz() + " ,\r\n  "
//                + "\"ucs\":" + cancer.getUcs() + " ,\r\n "
//                + "\"ma\":" + cancer.getMa() +  " ,\r\n "
//                + "\"secs\":" + cancer.getSecs()+ " ,\r\n "
//                + "\"bn\":" + cancer.getBn() +  " ,\r\n "
//                + "\"bc\":" + cancer.getBc() +  " ,\r\n "
//                + "\"nn\":" + cancer.getNn() +  " ,\r\n "
//                + "\"mitosis\":" + cancer.getMitosis() + ",\r\n "
//                + "\"cancer_type\":" + cancer.getCancer_type() + "\r\n  }\r\n] \r\n] "
//                + " },\r\n    \"GlobalParameters\": {}\r\n}");
//        Request request = new Request.Builder()
//                .url("https://ussouthcentral.services.azureml.net/workspaces/89e4437dcb544097abc1c89c901b435a/services/e1bb08d605034ba19b05b0e91cf3ed92/execute?api-version=2.0&details=true")
//                .method("POST", body)
//                .addHeader("Authorization", "Bearer 9w9N0tuRG43LMpddgsnmZ/zmmxk4dFCGiSzBwfbHcQop+y7OF+1iAXg+vUKFVWexkvgDaWA8EEevm9ojmZcn/Q==")
//                .addHeader("Content-Type", "application/json")
//                .build();
//        Response response = client.newCall(request).execute();
//        
//        if (!response.isSuccessful()) {
//            throw new IOException("Unexpected code " + response);
//        }
//        Gson gson = new Gson();
//        // Convierte la cadena body en un objeto jsonObject
//        JSONObject jsonObject = new JSONObject(response.body().string());
//        JSONObject cadenaJson = jsonObject.getJSONObject("Results")
//                .getJSONArray("output1")
//                .getJSONObject(0);
//        return cadenaJson;
//    }
}
