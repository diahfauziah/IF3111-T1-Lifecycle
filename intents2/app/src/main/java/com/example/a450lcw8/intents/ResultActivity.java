package com.example.a450lcw8.intents;

/**
 * Created by A450LC W8 on 07/02/2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class ResultActivity extends Activity {

        @Override
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(R.layout.activity_result);
            Bundle extras = getIntent().getExtras();
            String inputString = extras.getString("value");
            TextView view = (TextView) findViewById(R.id.displayintentextra);
            view.setText(inputString);
        }

    @Override
    public void finish() {

        // TODO 1 create new Intent
        // Intent intent = new Intent();
        Intent intent = new Intent();
        // TODO 2 read the data of the EditText field
        // with the id returnValue
        EditText editText= (EditText) findViewById(R.id.returnValue);
        // TODO 3 put the text from EditText
        // as String extra into the intent
        // use editText.getText().toString();
        String string = editText.getText().toString();
        // TODO 4 use setResult(RESULT_OK, intent);
        // to return the Intent to the application
        intent.putExtra("return_key", string);
        setResult(RESULT_OK, intent);

        super.finish();
    }
}



