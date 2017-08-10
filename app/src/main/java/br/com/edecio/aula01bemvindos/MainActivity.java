package br.com.edecio.aula01bemvindos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtNome;
    private Button btnMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText) findViewById(R.id.edtNome);
    }

    public void MostrarNome(View view) {
        // obtém a informação digitada na View
        String nome = edtNome.getText().toString();

        // mostrar mensagem em um toast
        Toast.makeText(this, "Olá " + nome, Toast.LENGTH_LONG).show();
    }
}
