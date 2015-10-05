package edu.uw.tacoma.mmuppa.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button sendAgainButton;
    public static final String MESSAGE = "message";
    public static final String TAG = "Stuart";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate method");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendAgainButton = (Button)
                findViewById(R.id.btn_send_again);
        sendAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext()
                        , "You clicked me again!", Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }

    // Send button event handler
    public void sendData(View v) {
        Toast.makeText(this, "You clicked me!", Toast.LENGTH_SHORT)
                .show();
        EditText msgText = (EditText) findViewById(R.id.txt_hello);
        String msg = msgText.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(MESSAGE, msg);
        startActivity(intent);

    }
}
