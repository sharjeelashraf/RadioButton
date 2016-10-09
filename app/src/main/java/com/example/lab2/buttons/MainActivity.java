package com.example.lab2.buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup androidRadio, webProgramming, desktopPro;
    private RadioButton android,cplus,java;
    private Button submit;
    int count = 0;


    String[] thisIsAStringArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* Initialize Radio Group and attach click handler */


        androidRadio = (RadioGroup) findViewById(R.id.android);
        webProgramming = (RadioGroup) findViewById(R.id.web);
        desktopPro = (RadioGroup) findViewById(R.id.desktopPro);


      /*  csharp = (RadioButton) findViewById(R.id.csharp);
        cplus = (RadioButton) findViewById(R.id.cplus);
        java = (RadioButton) findViewById(R.id.java);*/
        androidRadio.clearCheck();
        webProgramming.clearCheck();
        desktopPro.clearCheck();
        addListenerOnButton();




    }
    public void addListenerOnButton() {

        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                int androidCheck = androidRadio.getCheckedRadioButtonId();
                int webCheck = webProgramming.getCheckedRadioButtonId();
                int desktopCheck = desktopPro.getCheckedRadioButtonId();


                android = (RadioButton) findViewById(androidCheck);

                String selection = (String) android.getText();
                if (selection == "Java")
                {
                    Toast.makeText(MainActivity.this, selection + " is true", Toast.LENGTH_SHORT).show();
                }



              /*  if (androidCheck == -1 && webCheck == -1 && desktopCheck == -1) {
                    // No item selected
                    Toast.makeText(MainActivity.this, "No Item Selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    if (androidCheck == R.id.java && webCheck == R.id.javascript && desktopCheck == R.id.dotnet ) {
                        // Do something with the button
                        Toast.makeText(MainActivity.this, "True", Toast.LENGTH_SHORT).show();
                        count=3;
                        Toast.makeText(MainActivity.this, "Your score is = " + Integer.toString(count), Toast.LENGTH_SHORT).show();
                    }

                    else
                    {
                        Toast.makeText(MainActivity.this, "False", Toast.LENGTH_SHORT).show();
                    }
                }
*/

              /*if(java.isSelected()==true)
              {
                  Toast.makeText(MainActivity.this, "True", Toast.LENGTH_SHORT).show();
              }
                else if(csharp.isSelected() || cplus.isSelected())
              {
                  Toast.makeText(MainActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
              }
*/
            }

        });

    }


}
