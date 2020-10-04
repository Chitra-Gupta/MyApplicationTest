package chitra.helloworld.fragmentcalcheckbx;

import androidx.appcompat.app.AppCompatActivity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Fragment fragment=null;
    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        Toast.makeText(this, "Awesome", Toast.LENGTH_SHORT).show();

    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.button1:
                fragment=new Calculator();
                loadFragment(fragment);
                break;
            case R.id.button2:
                fragment=new Checkboxprj();
                loadFragment(fragment);
                break;
        }
    }
    private void loadFragment(Fragment fragment){
        FragmentManager manager=getFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.remove(fragment);
        transaction.replace(R.id.fragment,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}