package com.example.arundhatirajendran.flames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    EditText Name1;
    EditText Name2;
    Button Result;
    String name1="";
    String name2="";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name1= (EditText) findViewById(R.id.Name1);
        Name2= (EditText) findViewById(R.id.Name2);
        Result= (Button) findViewById(R.id.Result);

        Result.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                name1 = Name1.getText().toString();
                name2=  Name2.getText().toString();

                name1 = name1.toLowerCase();
                name2 = name2.toLowerCase();

                String s1 = name1;
                    String s2 = name2;
                    for (int i = 0; i < name1.length(); i++) {
                        for (int j = 0; j < name2.length(); j++) {
                            if (name1.charAt(i) == name2.charAt(j)) {
                                name1 = name1.replaceFirst(String.valueOf(name1.charAt(i)), "#");
                                name2 = name2.replaceFirst(String.valueOf(name2.charAt(j)), "#");
                            }
                        }
                    }
                    String result = name1 + name2;
                    result = result.replaceAll("#", "");
                    int resultLength = result.length();
                    String baseInput = "flames";
                    char relationIs = 0;
                    int temp = 0;
                    if (resultLength > 0) {
                        temp = resultLength % baseInput.length();
                    }
                    if (temp == 0 && resultLength >= 6) {
                        relationIs = 's';
                    } else {
                        int count = temp - 1;
                        if (count >= 0) {
                            relationIs = baseInput.charAt(count);

                        }
                    }
                    switch (relationIs) {
                        case 'f':
                            Toast.makeText(getBaseContext(), "Friends", Toast.LENGTH_SHORT).show();
                            //System.out.println("friendship");
                            break;
                        case 'l':
                            Toast.makeText(getBaseContext(), "Love", Toast.LENGTH_SHORT).show();
                            //System.out.println("Lovers");
                            break;
                        case 'a':
                            Toast.makeText(getBaseContext(), "Affection", Toast.LENGTH_SHORT).show();
                            //System.out.println("Affection");
                            break;
                        case 'm':
                            Toast.makeText(getBaseContext(), "Marriage", Toast.LENGTH_SHORT).show();
                            //System.out.println("Marriage");
                            break;
                        case 'e':
                            Toast.makeText(getBaseContext(), "Enemies", Toast.LENGTH_SHORT).show();
                            //System.out.println("Enemity");
                            break;
                        case 's':
                            Toast.makeText(getBaseContext(), "Sibilings", Toast.LENGTH_SHORT).show();
                            //System.out.println("Siblings");
                            break;
                        default:
                            Toast.makeText(getBaseContext(), "FLAME Test works only for different names", Toast.LENGTH_SHORT).show();
                            //System.out.println("FLAME Test works only for different names");
                            break;
                    }
                }
                /* name1 = Name1.getText().toString();
                name2=  Name2.getText().toString();

                name1 = name1.toLowerCase();
                name2 = name2.toLowerCase();

                StringBuilder sb1 = new StringBuilder(name1);
                StringBuilder sb2 = new StringBuilder(name2);

                int m=sb1.length();
                int n=sb2.length();
                for(int i=0; i<m;i++)
                {
                    for(int j=0; j<n;j++)
                    {
                        if(sb1.charAt(i) == sb2.charAt(j))
                        {
                            sb1.replace(i, i+1, "0");
                            sb2.replace(j,j+1,"0");
                        }
                    }
                }
                int x1=0;
                int y1=0;
                String s1="";
                String s2="";
                s1 = sb1.toString();
                s2 = sb2.toString();
                for(int i=0;i<s1.length();i++){ //length of string to remove 0 and find the length
                    if(s1.charAt(i)!='0'){

                        x1 +=1;

                    }
                }

                for(int i=0;i<s2.length();i++){
                    if(s2.charAt(i)!='0'){
                        y1 +=1;

                    }
                }


                int x = x1+y1; // total length of remaining characters in both the strings

                String flames = "flames";
                StringBuilder sb3 = new StringBuilder(flames);

                char flameResult = 0;

                while(sb3.length()!=1)
                {
                    int y = x%sb3.length();
                    String temp;

                    if(y!=0)
                    {
                        temp = sb3.substring(y)+sb3.substring(0, y-1); // taking substring (counting purpose)

                    }
                    else
                    {
                        temp = sb3.substring(0, sb3.length()-1); // taking substring (counting purpose)

                    }
                    sb3 = new StringBuilder(temp);


                }


                switch(flameResult)
                {
                    case 'f':
                        Toast.makeText(getBaseContext(), "Friends", Toast.LENGTH_LONG).show();
                        break;
                    case 'l':
                        Toast.makeText(getBaseContext(), "Love", Toast.LENGTH_LONG).show();
                        break;
                    case 'a':
                        Toast.makeText(getBaseContext(), "Affection", Toast.LENGTH_LONG).show();
                        break;
                    case 'm':
                        Toast.makeText(getBaseContext(), "Marriage", Toast.LENGTH_LONG).show();
                        break;
                    case 'e':
                        Toast.makeText(getBaseContext(), "Enemies", Toast.LENGTH_LONG).show();
                        break;
                    case 's':
                        Toast.makeText(getBaseContext(), "Sibiling", Toast.LENGTH_LONG).show();
                        break;

                }
            } */




        });

    }
}
