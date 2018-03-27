package com.example.jjw920418.lab12;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText edit_name;
    public Button btn_print;
    public Button btn_clear;
    public TextView view_print;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    //Initiate.
    public void init() {
        edit_name = (EditText) findViewById(R.id.editText);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_print = (Button) findViewById(R.id.btn_print);
        view_print = (TextView) findViewById(R.id.textView);
    }
    //Clear make initiate.
    //View Textview contents
    public void clearClicked(View v) {
        edit_name.setText("");
        view_print.setText("contents");
    }

    //Click editText make storing text in String
    //View TextView Name
    public void printClicked(View v) {
        String text = edit_name.getText().toString();
        view_print.setText(text);
    }

}