package vn.edu.ntu.thedung.LeTheDung_59130403_SimpleWidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtDate, edtSTK;
    RadioGroup rbg;
    CheckBox cb1,cb2,cb3,cb4,cb5;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addAction();
    }

    void addView(){

        edtName = findViewById(R.id.edtName);
        edtDate = findViewById(R.id.edtDate);
        edtSTK = findViewById(R.id.edtSTK);

        rbg = findViewById(R.id.rbg);

        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);

        btn = findViewById(R.id.btn);
    }

    void addAction(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "";
                text += edtName.getText().toString();
                text += "\nNgày sinh: " + edtDate.getText().toString();

                switch (rbg.getCheckedRadioButtonId()){
                    case R.id.rbNam: text += "\nGiới tính: Nam"; break;
                    case R.id.rbNu: text += "\nGiới tính: Nữ"; break;
                }

                text += "\nSở thích: ";

                if (cb1.isChecked())  text += cb1.getText().toString() + "; ";
                if (cb2.isChecked())  text += cb2.getText().toString() + "; ";
                if (cb3.isChecked())  text += cb3.getText().toString() + "; ";
                if (cb4.isChecked())  text += cb4.getText().toString() + "; ";
                if (cb5.isChecked())  text += cb5.getText().toString();

                text += "; " + edtSTK.getText().toString();

                Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG).show();

            }
        });
    }
}
