package chailei.com.retrofitpostmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import chailei.com.retrofitpostmodule.entitys.DaJiaWenEntity;
import chailei.com.retrofitpostmodule.httputils.Service;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity implements Callback<DaJiaWenEntity> {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.txt);
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();

//        Service.getQyService().getDaJia(1,6,2266409,"GRFPzQhvuV").enqueue(this);

    }

    @Override
    public void onResponse(Response<DaJiaWenEntity> response, Retrofit retrofit) {
        textView.setText(response.body().toString());
        Toast.makeText(this,"成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(Throwable t) {
        t.printStackTrace();
        Toast.makeText(this,"失败",Toast.LENGTH_SHORT).show();
    }
}
