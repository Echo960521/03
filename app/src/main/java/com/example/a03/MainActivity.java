package com.example.a03;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button button = (Button) findViewById(R.id.button1);

        final EditText editText = (EditText) findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("your name");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
        public void onRadioButtonClicked(View view) {
            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();
            TextView textView=(TextView)findViewById(R.id.textView);

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.radioButtonMale:
                    if (checked)
                        textView.setText("您的性别为男");
                    break;
                case R.id.radioButtonFemale:
                    if (checked)
                        textView.setText("您的性别为女");
                    break;
            }
        }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        TextView textView=(TextView)findViewById(R.id.textView);

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBoxC:
                if(checked){
                    Toast.makeText(this,"选择C语言",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"取消选择C语言",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.checkBoxJava:
                if(checked){
                    Toast.makeText(this,"选择Java语言",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"取消选择Java语言", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.checkBoxPython:
                if(checked){
                    Toast.makeText(this,"选择Python语言",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"取消选择Python语言",Toast.LENGTH_LONG).show();
                }

        }
    }


}

