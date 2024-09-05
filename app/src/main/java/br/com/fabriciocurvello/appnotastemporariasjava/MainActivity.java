package br.com.fabriciocurvello.appnotastemporariasjava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private EditText etNotaEntrada;
    private Button btSalvar;
    private Button btCarregar;
    private TextView tvNotaSaida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etNotaEntrada = findViewById(R.id.et_nota_entrada);
        btSalvar = findViewById(R.id.bt_salvar);
        btCarregar = findViewById(R.id.bt_carregar);
        tvNotaSaida = findViewById(R.id.tv_nota_saida);

        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNote();
            }
        });

        btCarregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadNote();
            }
        });
    }

    private void saveNote() {
        String note = etNotaEntrada.getText().toString();
        File cacheDir = getCacheDir();
        File file = new File(cacheDir, "temp_note.txt");

        try (FileOutputStream fos = new FileOutputStream(file)){
            fos.write(note.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadNote() {
        File cacheDir = getCacheDir();
        File file = new File(cacheDir, "temp_note.txt");

        if (file.exists()) {
            try (FileInputStream fis = new FileInputStream(file)){
                int lenght = (int) file.length();
                byte[] bytes = new byte[lenght];
                fis.read(bytes);
                String note = new String(bytes);
                tvNotaSaida.setText(note);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            tvNotaSaida.setText("Nenhuma nota encontrada.");
        }
    }
}


