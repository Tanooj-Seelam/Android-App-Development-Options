 package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
     String countries[] = {"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina",
             "Armenia", "Australia", "Austria", "Austrian Empire", "Azerbaijan", "Baden", "Bahamas", "The Bahrain", "Bangladesh",
             "Barbados", "Bavaria*", "Belarus", "Belgium", "Belize", "Benin (Dahomey)", "Bolivia", "Bosnia and Herzegovina",
             "Botswana", "Brazil", "Brunei", "Brunswick and Lüneburg", "Bulgaria", "Burkina Faso (Upper Volta)",
             "Burma", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Cayman Islands", "The Central African Republic",
             "Central American Federation*", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo Free State", "The Costa Rica",
             "Cote d’Ivoire (Ivory Coast)", "Croatia", "Cuba", "Cyprus", "Czechia", "Czechoslovakia"};

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         Spinner sp = (Spinner) findViewById(R.id.spinner);
         sp.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, countries));
         sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

             @Override
             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 String text = parent.getItemAtPosition(position).toString();
                 Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
             }

             @Override
             public void onNothingSelected(AdapterView<?> parent) {
             }
         });
     }
 }
