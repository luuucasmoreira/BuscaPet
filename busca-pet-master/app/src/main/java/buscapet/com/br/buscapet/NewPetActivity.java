package buscapet.com.br.buscapet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class NewPetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_pet);

        // Spinner de Pets
        Spinner spinnerPets = findViewById(R.id.spinner_pet);
        ArrayAdapter<CharSequence> adapterPets = ArrayAdapter.createFromResource(this, R.array.pets, android.R.layout.simple_spinner_dropdown_item);
        adapterPets.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPets.setAdapter(adapterPets);

        // Spinner de Raça
        Spinner spinnerRaca = findViewById(R.id.spinner_raca);
        ArrayAdapter<CharSequence> adapterRaca = ArrayAdapter.createFromResource(this, R.array.racas, android.R.layout.simple_spinner_dropdown_item);
        adapterRaca.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRaca.setAdapter(adapterRaca);

        // Spinner de Sexo
        Spinner spinnerSexo = findViewById(R.id.spinner_sexo);
        ArrayAdapter<CharSequence> adapterSexo = ArrayAdapter.createFromResource(this, R.array.sexo, android.R.layout.simple_spinner_dropdown_item);
        adapterSexo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSexo.setAdapter(adapterSexo);
    }
}
