package chitra.helloworld.fragmentcalcheckbx;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import androidx.annotation.Nullable;
import android.app.Fragment;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;



public class Calculator extends Fragment {
    EditText num1txt,num2txt,resultedit;
    Button clearBtn;
    Button addBtn,subBtn,mulBtn,divBtn;
    int num1,num2,result;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {
       final View view=inflater.inflate(R.layout.calculator , container,false);

        num1txt=(EditText) view.findViewById(R.id.num1txt);
        num2txt=(EditText) view.findViewById(R.id.num2txt);
        resultedit=(EditText) view.findViewById(R.id.result);
        addBtn=(Button) view.findViewById(R.id.addBtn);
        subBtn=(Button) view.findViewById(R.id.subBtn);
        mulBtn=(Button) view.findViewById(R.id.mulBtn);
        divBtn=(Button) view.findViewById(R.id.divBtn);
        clearBtn=(Button) view.findViewById(R.id.clrBtn);


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                num1=Integer.parseInt(num1txt.getText().toString());
                num2=Integer.parseInt(num2txt.getText().toString());
                result=num1+num2;
                resultedit.setText(String.valueOf(result));
            }
        });
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                num1=Integer.parseInt(num1txt.getText().toString());
                num2=Integer.parseInt(num2txt.getText().toString());
                result=num1-num2;
                resultedit.setText(String.valueOf(result));
            }
        });
        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                num1=Integer.parseInt(num1txt.getText().toString());
                num2=Integer.parseInt(num2txt.getText().toString());
                result=num1*num2;
                resultedit.setText(String.valueOf(result));
            }
        });
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                num1 = Integer.parseInt(num1txt.getText().toString());
                num2 = Integer.parseInt(num2txt.getText().toString());
                if (num1 != 0) {
                    result = num1 / num2;
                    resultedit.setText(String.valueOf(result));
                } else
                    Toast.makeText(view.getContext(), "Division by zero", Toast.LENGTH_LONG).show();
            }
        });
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1txt.setText("");
                num2txt.setText("");
                resultedit.setText("");
            }
        });

            return view;
    }
}
