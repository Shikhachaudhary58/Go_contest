package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;


public class homefragment extends Fragment {
    DrawerLayout drawerLayout;
    NavigationView navigationView;


    public homefragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_homefragment, container, false);

        drawerLayout = rootView.findViewById(R.id.navDrawer);
        navigationView = rootView.findViewById(R.id.navViewAcceptedTask);

        // Set the custom layout for menu items


        // Set the center menu items separately
        Menu menu = navigationView.getMenu();
        menu.clear();
        navigationView.inflateMenu(R.menu.main_menu); // Your existing items
        navigationView.inflateMenu(R.menu.center_menu); // Center item

        // Handle menu item clicks
        navigationView.setNavigationItemSelectedListener(item -> {
            // Handle item clicks here based on the item's ID
            switch (item.getItemId()) {
                case R.id.nav_profile:
                    drawerLayout.closeDrawer(GravityCompat.START);
                    Intent i = new Intent(getActivity(), profile.class);
                    startActivity(i);
                    break;
            }
            switch (item.getItemId()) {
                case R.id.nav_contest:
                    drawerLayout.closeDrawer(GravityCompat.START);
                    Intent contest = new Intent(getActivity(), mycontest.class);
                    startActivity(contest);
                    break;
            }
            switch (item.getItemId()) {
                case R.id.nav_wallet:
                    drawerLayout.closeDrawer(GravityCompat.START);
                    Intent wallet = new Intent(getActivity(), mywallet.class);
                    startActivity(wallet);
                    break;
            }
            switch (item.getItemId()) {
                case R.id.nav_transaction:
                    drawerLayout.closeDrawer(GravityCompat.START);
                    Intent trans = new Intent(getActivity(), mytransaction.class);
                    startActivity(trans);
                    break;
            }
            switch (item.getItemId()) {
                case R.id.nav_account:
                    drawerLayout.closeDrawer(GravityCompat.START);
                    Intent acc = new Intent(getActivity(), Balance.class);
                    startActivity(acc);
                    break;
            }
            switch (item.getItemId()) {
                case R.id.nav_refer:
                    drawerLayout.closeDrawer(GravityCompat.START);
                    Intent refer = new Intent(getActivity(), Refer.class);
                    startActivity(refer);
                    break;
            }
            switch (item.getItemId()) {
                case R.id.nav_play:
                    drawerLayout.closeDrawer(GravityCompat.START);
                    Intent play = new Intent(getActivity(), how_to_play.class);
                    startActivity(play);
                    break;
            }
            switch (item.getItemId()) {
                case R.id.nav_privacy:
                    drawerLayout.closeDrawer(GravityCompat.START);
                    Intent privacy = new Intent(getActivity(), privacy_policy.class);
                    startActivity(privacy);
                    break;
            }
            switch (item.getItemId()) {
                case R.id.nav_terms:
                    drawerLayout.closeDrawer(GravityCompat.START);
                    Intent term = new Intent(getActivity(), term_and_condition.class);
                    startActivity(term);
                    break;
            }
            switch (item.getItemId()) {
                case R.id.nav_Help:
                    drawerLayout.closeDrawer(GravityCompat.START);
                    Intent help = new Intent(getActivity(), help_support.class);
                    startActivity(help);
                    break;
            }

            switch (item.getItemId()) {
                case R.id.nav_logout:
                    drawerLayout.closeDrawer(GravityCompat.START);
                    Intent log_out = new Intent(getActivity(), Login.class);
                    startActivity(log_out);
                    break;
            }
            return true;
        });
        return rootView;
    }






    // Method to toggle the drawer
    public void toggleDrawer() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            drawerLayout.openDrawer(GravityCompat.START);
        }
    }
}