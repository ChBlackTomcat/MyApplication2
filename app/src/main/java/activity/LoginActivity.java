package activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.first.myapplication.R;

/**
 * Created by 小黑 on 2019/8/2.
 */

public class LoginActivity extends Activity implements View.OnClickListener{
    private Button bt_register;
    private ImageButton login_manager;
    private ImageButton login_user;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        bt_register = (Button) findViewById(R.id.register);
        login_manager = (ImageButton) findViewById(R.id.Login_manager);
        login_user = (ImageButton) findViewById(R.id.Login_user);
        bt_register.setOnClickListener(this);
        login_user.setOnClickListener(this);
        login_manager.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.register:
                Intent intent = new Intent(this, RegisterActivity.class);
                startActivity(intent);
                Toast.makeText(this,"注册",1).show();
                break;
            case R.id.Login_manager:
                Toast.makeText(this,"商户登录",1).show();
                break;
            case R.id.Login_user:
                Toast.makeText(this,"用户登录",1).show();
                break;
        }
    }


}
