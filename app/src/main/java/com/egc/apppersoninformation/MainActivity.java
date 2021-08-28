package com.egc.apppersoninformation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.egc.apppersoninformation.Models.Person;
import com.egc.apppersoninformation.ReciclerView.AdapterPerson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {


    private static ArrayList listPerson = new ArrayList();
    TextView txtName;
    TextView txtSurname;
    TextView txtIdentificationCard;
    Button btnSave;
    ListView listViewPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.txtName);
        txtSurname = findViewById(R.id.txtSurname);
        txtIdentificationCard = findViewById(R.id.txtIdentificationCard);
        btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);
        listViewPerson = findViewById(R.id.listPerson);
        listViewPerson.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnSave){
            Person person = new Person(txtName.getText().toString(),txtSurname.getText().toString(),
                    txtIdentificationCard.getText().toString());
            listPerson.add(person);
            Toast.makeText(MainActivity.this, "Persona Registrada", Toast.LENGTH_LONG).show();
            clearFields();
            AdapterPerson adapter = new AdapterPerson(MainActivity.this,listPerson);
            listViewPerson.setAdapter(adapter);

        }


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }


    public void clearFields(){
        txtName.setText("");
        txtSurname.setText("");
        txtIdentificationCard.setText("");

    }
}