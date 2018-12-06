package jerad.reyes.com.reyesjeradpe2;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedpreferences;
    TextView fullname;
    TextView age;
    TextView gender;
    public static final String mypreference = "mypref";
    public static final String Fullname = "namekey";
    public static final String Age = "agekey";
    public static final String Gender = "genkey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fullname = (TextView) findViewById(R.id.fname);
        age = (TextView) findViewById(R.id.et_age);
        gender = (TextView) findViewById(R.id.et_gen);
        sharedpreferences = getSharedPreferences(mypreference, Context.MODE_PRIVATE);
        if(sharedpreferences.contains(Fullname)){
            fullname.setText(sharedpreferences.getString(Fullname,""));
        }
        if(sharedpreferences.contains(Age)){
            age.setText(sharedpreferences.getString(Age,""));
        }
        if(sharedpreferences.contains(Gender)){
            gender.setText(sharedpreferences.getString(Gender,""));
        }
    }
    public void Save(View view){
            String fn = fullname.getText().toString();
            String a = age.getText().toString();
            String g = gender.getText().toString();
            SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putString(Fullname, fn);
            editor.putString(Age, a);
            editor.putString(Gender, g);
            editor.commit();
    }

    public void Get(View view){
        fullname = (TextView)findViewById(R.id.get_name);
        age = (TextView) findViewById(R.id.get_age);
        gender = (TextView)findViewById(R.id.get_gen);
        sharedpreferences = getSharedPreferences(mypreference,Context.MODE_PRIVATE);

        if(sharedpreferences.contains(Fullname)){
            fullname.setText(sharedpreferences.getString(Fullname,""));
        }
        if(sharedpreferences.contains(Age)){
            age.setText(sharedpreferences.getString(Age,""));
        }
        if(sharedpreferences.contains(Gender)){
            gender.setText(sharedpreferences.getString(Gender,""));
        }
    }


}
