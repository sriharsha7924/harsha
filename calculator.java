
package e.klu.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    Button b1,b2,b3,b4;
    EditText et1,et2;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        b1=(Button)findViewById(R.id.button5);
        b2=(Button)findViewById(R.id.button6);
        b3=(Button)findViewById(R.id.button7);
        b4=(Button)findViewById(R.id.button8);
        et1=(EditText)findViewById(R.id.editText9);
        et2=(EditText)findViewById(R.id.editText7);
         t=(TextView)findViewById(R.id.textView3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b;
                a=Integer.parseInt(et1.getText().toString());
                b=Integer.parseInt(et2.getText().toString());
                t.setText(Integer.toString(a+b));


            }
    });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b;
                a=Integer.parseInt(et1.getText().toString());
                b=Integer.parseInt(et2.getText().toString());
                t.setText(Integer.toString(a-b));


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b;
                a=Integer.parseInt(et1.getText().toString());
                b=Integer.parseInt(et2.getText().toString());
                t.setText(Integer.toString(a*b));


            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b;
                a=Integer.parseInt(et1.getText().toString());
                b=Integer.parseInt(et2.getText().toString());
                t.setText(Integer.toString(a/b));


            }
        });
}
}
