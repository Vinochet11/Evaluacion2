package com.example.gymapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;


import com.example.gymapp2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_calentamiento, R.id.navigation_recompensa, R.id.navigation_perfil)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);


        //Toolbar tb = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(tb);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_dias,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            int id= item.getItemId();
            if (id==R.id.D1){
                Toast.makeText(this,"vas a otro lado",Toast.LENGTH_SHORT).show();
            } else if (id==R.id.D2){
                Toast.makeText(this,"otra opcion",Toast.LENGTH_LONG).show();
            } else if (id==R.id.D3) {
                Toast.makeText(this,"asdsad",Toast.LENGTH_LONG).show();
            } else if (id==R.id.D4) {
                Toast.makeText(this,"asdsad",Toast.LENGTH_LONG).show();
            } else if (id==R.id.D5) {
                Toast.makeText(this,"asdsad",Toast.LENGTH_LONG).show();
            } else if (id==R.id.D6) {
                Toast.makeText(this,"asdsad",Toast.LENGTH_LONG).show();
            } else if (id==R.id.D7) {
                Toast.makeText(this,"asdsad",Toast.LENGTH_LONG).show();
            }


        return super.onOptionsItemSelected(item);
    }
    public void Peso_actual_futuro(View V){
        Persona a = new Persona("20","70");
        Intent i = new Intent(this, Fragmentperfil.class);
        i.putExtra("Persona",a);
        startActivity(i);
    }
}