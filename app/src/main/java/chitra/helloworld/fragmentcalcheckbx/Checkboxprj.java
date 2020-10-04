package chitra.helloworld.fragmentcalcheckbx;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.Nullable;
import android.app.Fragment;
import android.view.ViewGroup;
import android.view.LayoutInflater;

public class Checkboxprj extends Fragment {
    Button btn;
    TextView textView;
    CheckBox checkBox1, checkBox2, checkBox3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.checkboxprg, container, false);

        checkBox1 = (CheckBox) view.findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) view.findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) view.findViewById(R.id.checkBox3);
        textView = (TextView) view.findViewById(R.id.textView);
        btn = (Button) view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox1.isChecked() == true && checkBox2.isChecked() == true && checkBox3.isChecked() == true) {
                    textView.setText("You like to purchase all the devices!");
                } else if (checkBox1.isChecked() == true && checkBox2.isChecked() == true) {
                    //textView.setText("You like to purchase printer and keyboard the devices!");
                    textView.setText("You like to purchase printer and keyboard the devices!" + checkBox1.getText().toString() + "and" + checkBox2.getText().toString());
                } else if (checkBox1.isChecked() == true && checkBox3.isChecked() == true) {
                    // textView.setText("You like to purchase printer and scanner the devices!");
                    textView.setText("You like to purchase printer and scanner the devices!" + checkBox1.getText().toString() + "and" + checkBox3.getText().toString());
                } else if (checkBox2.isChecked() == true && checkBox3.isChecked() == true) {
                    //textView.setText("You like to purchase keyboard and scanner the devices!");
                    textView.setText("You like to purchase keyboard and scanner the devices!" + checkBox2.getText().toString() + "and" + checkBox3.getText().toString());
                } else if (checkBox1.isChecked() == true) {
                    //textView.setText("You like to purchase printer the devices!");
                    textView.setText("You like to purchase printer the devices!" + checkBox1.getText().toString());
                } else if (checkBox2.isChecked() == true) {
                    //textView.setText("You like to purchase keyboard the devices!");
                    textView.setText("You like to purchase keyboard the devices!" + checkBox2.getText().toString());
                } else if (checkBox3.isChecked() == true) {
                    //textView.setText("You like to purchase scanner the devices!");
                    textView.setText("You like to purchase scanner the devices!" + checkBox3.getText().toString());
                } else {
                    textView.setText("You donot like to purchase the devices!");
                }
            }
        });
        return view;
    }
}