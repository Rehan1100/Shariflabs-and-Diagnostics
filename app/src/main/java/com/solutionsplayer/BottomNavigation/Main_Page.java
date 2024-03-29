package com.solutionsplayer.BottomNavigation;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.solutionsplayer.shariflabs.R;
import com.solutionsplayer.shariflabs.databinding.ActivityMainPageBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;



public class Main_Page extends AppCompatActivity {

    private ActivityMainPageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_services, R.id.navigation_contactus)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main_page);
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

    }


}