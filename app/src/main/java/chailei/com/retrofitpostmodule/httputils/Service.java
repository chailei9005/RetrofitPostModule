package chailei.com.retrofitpostmodule.httputils;

import chailei.com.retrofitpostmodule.entitys.DaJiaWenEntity;
import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.http.Body;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by Administrator on 16-1-22.
 */
public class Service {
    //http://mm.mfniu.com/newfind/index_ask

    public interface QYService{
        @FormUrlEncoded
        @POST("/newfind/index_ask")
        Call<DaJiaWenEntity> getDaJia(@Field("page") int page,
        @Field("pageSize") int size,
        @Field("tokenMark") long tokenMark,
        @Field("token") String token
        );
    }
    private static QYService qyService;
    static {
        qyService = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://mm.mfniu.com").build().create(QYService.class);
    }

    public static QYService getQyService() {
        return qyService;
    }
}
