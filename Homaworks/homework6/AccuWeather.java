package homework6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AccuWeather {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .readTimeout(10, TimeUnit.SECONDS)
                .build();

        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegments("/forecasts/v1/daily/1day/295212")
                .addQueryParameter("spb", "4HipPLTRWR9WYvVLspkIkJj1HgrFalym")
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .get()
                .build();

        Response response = okHttpClient.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(response.body().string());

    URL url = new URL("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?4HipPLTRWR9WYvVLspkIkJj1HgrFalym");

        System.out.println(url.getProtocol());
        System.out.println(url.getAuthority());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
        System.out.println(url.getQuery());

    URL url1 = new URL("http", "dataservice.accuweather.com",  "/forecasts/v1/daily/5day/295212/");
    }
}
