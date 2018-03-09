package ro.pub.cs.systems.eim.lab03.phonedialer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class PhoneDialerActivity extends AppCompatActivity {

    private EditText phoneNumberEditText;
    private ImageButton callImageButton;
    private ImageButton hangupImageButton;
    private ImageButton backspaceImageButton;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonpound;
    private Button buttonstar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);
        phoneNumberEditText = findViewById(R.id.phone_number_edit_text);
        callImageButton = findViewById(R.id.buttoncall);
        hangupImageButton = findViewById(R.id.buttonhang);
        backspaceImageButton = findViewById(R.id.buttondelete);

        button0 = findViewById(R.id.button0);
        button0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick (View view){
                phoneNumberEditText.getText().insert(phoneNumberEditText.getSelectionStart(), "0");
            }
        });

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick (View view){
                phoneNumberEditText.getText().insert(phoneNumberEditText.getSelectionStart(), "1");
            }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick (View view){
                phoneNumberEditText.getText().insert(phoneNumberEditText.getSelectionStart(), "2");
            }
        });

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick (View view){
                phoneNumberEditText.getText().insert(phoneNumberEditText.getSelectionStart(), "3");
            }
        });

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick (View view){
                phoneNumberEditText.getText().insert(phoneNumberEditText.getSelectionStart(), "4");
            }
        });

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick (View view){
                phoneNumberEditText.getText().insert(phoneNumberEditText.getSelectionStart(), "5");
            }
        });

        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick (View view){
                phoneNumberEditText.getText().insert(phoneNumberEditText.getSelectionStart(), "6");
            }
        });

        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick (View view){
                phoneNumberEditText.getText().insert(phoneNumberEditText.getSelectionStart(), "7");
            }
        });

        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick (View view){
                phoneNumberEditText.getText().insert(phoneNumberEditText.getSelectionStart(), "8");
            }
        });

        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick (View view){
                phoneNumberEditText.getText().insert(phoneNumberEditText.getSelectionStart(), "9");
            }
        });

        buttonstar = findViewById(R.id.buttonstar);
        buttonstar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick (View view){
                phoneNumberEditText.getText().insert(phoneNumberEditText.getSelectionStart(), "*");
            }
        });

        buttonpound = findViewById(R.id.buttonpound);
        buttonpound.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick (View view){
                phoneNumberEditText.getText().insert(phoneNumberEditText.getSelectionStart(), "#");
            }
        });

        backspaceImageButton = findViewById(R.id.buttondelete);
        backspaceImageButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick (View view){
                phoneNumberEditText.getText().delete(phoneNumberEditText.getText().length() - 1 , phoneNumberEditText.getText().length() );
            }
        });

        callImageButton = findViewById(R.id.buttoncall);
        callImageButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:" + phoneNumberEditText.getText().toString()));
                startActivity(intent);
            }
        });



    }


}
