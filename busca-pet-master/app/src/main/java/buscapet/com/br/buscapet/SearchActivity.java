package buscapet.com.br.buscapet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Spinner Menu de Raças
        Spinner spinnerRaca = findViewById(R.id.spinner_raca);
        ArrayAdapter<CharSequence> adapterRaca = ArrayAdapter.createFromResource(this, R.array.racas, android.R.layout.simple_spinner_dropdown_item);
        adapterRaca.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRaca.setAdapter(adapterRaca);

        Spinner spinnerPorte = findViewById(R.id.spinner_porte);
        ArrayAdapter<CharSequence> adapterPorte = ArrayAdapter.createFromResource(this, R.array.portes, android.R.layout.simple_spinner_dropdown_item);
        adapterPorte.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPorte.setAdapter(adapterPorte);

        Spinner spinnerCor = findViewById(R.id.spinner_cor);
        ArrayAdapter<CharSequence> adapterCor = ArrayAdapter.createFromResource(this, R.array.cores, android.R.layout.simple_spinner_dropdown_item);
        adapterCor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCor.setAdapter(adapterCor);

        Spinner spinnerEstado = findViewById(R.id.spinner_estado);
        ArrayAdapter<CharSequence> adapterEstado = ArrayAdapter.createFromResource(this, R.array.estados, android.R.layout.simple_spinner_dropdown_item);
        adapterEstado.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEstado.setAdapter(adapterEstado);

        Spinner spinnerCidade = findViewById(R.id.spinner_cidade);
        ArrayAdapter<CharSequence> adapterCidade = ArrayAdapter.createFromResource(this, R.array.cidades, android.R.layout.simple_spinner_dropdown_item);
        adapterCidade.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCidade.setAdapter(adapterCidade);
    }
}
