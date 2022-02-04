package com.example.modul_spp_ukk2021.UI.UI.Home.punyaAdmin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.modul_spp_ukk2021.R;
import com.example.modul_spp_ukk2021.UI.UI.Home.punyaPetugas.DataSiswaFragment;
import com.example.modul_spp_ukk2021.UI.UI.Splash.LoginChoiceActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

public class HomeAdminFragment extends AppCompatActivity {
    private Fragment fragment;
    private FragmentManager fragmentManager;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home_admin);

//        MaterialCardView dataSiswa = findViewById(R.id.dataSiswa);
//        dataSiswa.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fragmentManager = getSupportFragmentManager();
//                fragmentManager.beginTransaction().replace(R.id.fragment_container, new DataSiswaFragment()).commit();
//            }
//        });
//
//        MaterialCardView dataPetugas = findViewById(R.id.dataPetugas);
//        dataPetugas.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(HomeAdminFragment.this, DataPetugasActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        MaterialCardView dataKelas = findViewById(R.id.dataKelas);
//        dataKelas.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(HomeAdminFragment.this, DataKelasActivity.class);
//                startActivity(intent);
//            }
//        });

        MaterialCardView dataSPP = findViewById(R.id.dataSPP);
        dataSPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeAdminFragment.this, DataSPPActivity.class);
                startActivity(intent);
            }
        });
    }
}