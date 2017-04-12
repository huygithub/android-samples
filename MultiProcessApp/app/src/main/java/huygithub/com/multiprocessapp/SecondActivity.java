package huygithub.com.multiprocessapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    /** Called when the user wants to go back to the 1st activity */
    public void goBackToFirstActivity(View view) {
        finish();
    }
}
