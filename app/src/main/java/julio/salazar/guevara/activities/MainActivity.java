package julio.salazar.guevara.activities;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import julio.salazar.guevara.botones.ImagenFragment;
import julio.salazar.guevara.botones.R;
import julio.salazar.guevara.botones.WebFragment;
import julio.salazar.guevara.botones.botonFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnBtn, btnImg,btnWww;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBtn = findViewById(R.id.btn1);
        btnImg = findViewById(R.id.btnImagen);
        btnWww = findViewById(R.id.btnWeb);

        btnBtn.setOnClickListener(this);
        btnImg.setOnClickListener(this);
        btnWww.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Fragment f = null;
        boolean transaccion = false;
        switch (v.getId()){
            case R.id.btn1:
                f = new botonFragment();
                mensaje("Verás un boton");
                transaccion = true;
                break;
            case R.id.btnImagen:
                f = new ImagenFragment();
                mensaje("Verás una imagen");
                transaccion = true;
                break;
            case R.id.btnWeb:
                f = new WebFragment();
                mensaje("Verás una web");
                transaccion = true;
                break;
        }
        if (transaccion) {
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, f).commit();
        }
    }
    private void mensaje(String mensaje){
        Toast.makeText(MainActivity.this,mensaje,Toast.LENGTH_LONG).show();
    }
}
