package vsga.sidiq.calkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText angka_pertama, angka_kedua;
    Button kali,bagi,tambah,kurang;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        angka_pertama = findViewById(R.id.ETanga1);
        angka_kedua = findViewById(R.id.ETanga2);
        tambah = findViewById(R.id.btnTambah);
        kurang = findViewById(R.id.btnkurang);
        hasil = findViewById(R.id.tvHasil);
        kali  = findViewById(R.id.btnKali);
        bagi = findViewById(R.id.btnBagi);


        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0) &&(angka_kedua.getText().length()>0) ){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result= angka1 + angka2;
                    Log.e("hasil",""+result);
                    hasil.setText(Double.toString(result));

                }else{
                    Toast toast = Toast.makeText(MainActivity.this,"angka harus di inputkan ",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });


        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0) &&(angka_kedua.getText().length()>0) ){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result= angka1 - angka2;
                    Log.e("hasil",""+result);
                    hasil.setText(Double.toString(result));

                }else{
                    Toast toast = Toast.makeText(MainActivity.this,"angka harus di inputkan ",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });


        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0) &&(angka_kedua.getText().length()>0) ){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result= angka1 * angka2;
                    Log.e("hasil",""+result);
                    hasil.setText(Double.toString(result));

                }else{
                    Toast toast = Toast.makeText(MainActivity.this,"angka harus di inputkan ",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });


        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0) &&(angka_kedua.getText().length()>0) ){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result= angka1 / angka2;
                    Log.e("hasil",""+result);
                    hasil.setText(Double.toString(result));

                }else{
                    Toast toast = Toast.makeText(MainActivity.this,"angka harus di inputkan ",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });





    }


}