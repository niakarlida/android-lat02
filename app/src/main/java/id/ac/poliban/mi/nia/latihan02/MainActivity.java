package id.ac.poliban.mi.nia.latihan02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hubungkan masing2 view yang ingin dimanipulasi
        //dengan objek yang kita buat
        Button btKrisna = findViewById(R.id.btKrisna);
        Button btBisma = findViewById(R.id.btBisma);
        Button btBasudewa = findViewById(R.id.btBasudewa);

        //pasang event listener dan handler
        //menggunakan kelas anonim yang mengimplementasikan interface
        //view.onClickListener

        btKrisna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I'am Krisna", Toast.LENGTH_SHORT).show();
            }
        });
        btBisma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I'am Bisma", Toast.LENGTH_SHORT).show();
            }
        });
        btBasudewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I'am Basudewa", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
