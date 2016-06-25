package app.com.example.karas.karasapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_popular_movies = (Button)findViewById(R.id.btn_popular_movies);//获取按钮资源
        btn_popular_movies.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my popular movie app!",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

        Button btn_stock_hawk = (Button)findViewById(R.id.btn_stock_hawk);//获取按钮资源
        btn_stock_hawk.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my stock hawk app!",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

        Button btn_build_it_bigger = (Button)findViewById(R.id.btn_build_it_bigger);//获取按钮资源
        btn_build_it_bigger.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my build it bigger app!",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

        Button btn_make_your_app_material = (Button)findViewById(R.id.btn_make_your_app_material);//获取按钮资源
        btn_make_your_app_material.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my make your app material app!",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

        Button btn_go_ubiquitous = (Button)findViewById(R.id.btn_go_ubiquitous);//获取按钮资源
        btn_go_ubiquitous.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my go ubiquitous app!",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

        Button btn_capstone = (Button)findViewById(R.id.btn_capstone);//获取按钮资源
        btn_capstone.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my capstone app!",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
    }
}
