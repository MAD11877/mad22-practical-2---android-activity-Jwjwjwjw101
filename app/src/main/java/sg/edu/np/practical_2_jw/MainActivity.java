package sg.edu.np.practical_2_jw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void follow(View view) {
        //  TextView txt = findViewById(R.id.world);
        //txt.getText();
        //txt.setText("Hello there!");
        User user = new User();
        Button button = findViewById(R.id.following);
        button.setEnabled(false);

        if(user.followed == false) {
            button.setEnabled(true);
            button.setText("Unfollow");

        }
        else {
            button.setText("Follow");
            button.setEnabled(false);

        }

    }

}