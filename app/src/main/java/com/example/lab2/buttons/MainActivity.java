package com.example.lab2.buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup androidRadio, webProgramming, desktopProgram;
    private RadioButton android,web,desktoptext;
    private Button submit;
    int count = 0;
    String[] str = new String[3];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* Initialize Radio Group and attach click handler */
        str[0] = "Java";
        str[1] = "php";
        str[2] = "Dot Net";

        androidRadio = (RadioGroup) findViewById(R.id.android);
        webProgramming = (RadioGroup) findViewById(R.id.web);
        desktopProgram = (RadioGroup) findViewById(R.id.desktopPro);


      /*  csharp = (RadioButton) findViewById(R.id.csharp);
        cplus = (RadioButton) findViewById(R.id.cplus);
        java = (RadioButton) findViewById(R.id.java);*/
        androidRadio.clearCheck();
        webProgramming.clearCheck();
        desktopProgram.clearCheck();
        addListenerOnButton();




    }
    public void addListenerOnButton() {

        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                //  Do database operation
                try{

                int androidCheck = androidRadio.getCheckedRadioButtonId();
                int webCheck = webProgramming.getCheckedRadioButtonId();
                int desktopCheck = desktopProgram.getCheckedRadioButtonId();


                android = (RadioButton) findViewById(androidCheck);
                web = (RadioButton) findViewById(webCheck);
                desktoptext = (RadioButton) findViewById(desktopCheck);

                String selection = (String) android.getText();
                String selection2 = (String) web.getText();
                String selection3 = (String) desktoptext.getText();


                    if (androidCheck == -1 && webCheck == -1 && desktopCheck == -1) {
                        // No item selected
                        Toast.makeText(MainActivity.this, "No Item Selected", Toast.LENGTH_SHORT).show();
                    }
                    else{


                    if (selection.equals(str[0])) {
                        // Toast.makeText(MainActivity.this, selection +"&" +selection2 + " is true", Toast.LENGTH_SHORT).show();
                        count++;
                    }
                    if (selection2.equals(str[1])) {
                        //Toast.makeText(MainActivity.this, selection +"&" +selection2 + " is true", Toast.LENGTH_SHORT).show();
                        count++;
                    }
                    if (selection3.equals(str[2])) {
                        //Toast.makeText(MainActivity.this, selection +"&" +selection2 + " is true", Toast.LENGTH_SHORT).show();
                        count++;
                    }

                    Toast.makeText(MainActivity.this, "Total correct aswers: " + count, Toast.LENGTH_SHORT).show();

                        if (count == 3)
                        {
                            Toast.makeText(MainActivity.this, "Congrats", Toast.LENGTH_SHORT).show();
                            androidRadio.clearCheck();
                            webProgramming.clearCheck();
                            desktopProgram.clearCheck();
                        }
                        count = 0;

                }

            }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "Select all values first.", Toast.LENGTH_SHORT).show();
                }
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
                    {w
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

        });

    }


}
