package com.example.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class Drawer_menu extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    BottomNavigationView bottomNavigationView;
    home h1= new home();
    home1 h2 = new home1();
    home2 h3 =new home2();
    home3 h4 = new home3();
    ImageView arrow;

    TabLayout tabLayout;
    TabItem tab1, tab2, tab3;
    ViewPager viewpager;
    fragments frag1;
    fragmentsAdapter fragmentsAdapter;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_menu);
        MaterialToolbar toolbar= findViewById(R.id.topappbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tab1 = (TabItem) findViewById(R.id.tab1);
        tab2 = (TabItem) findViewById(R.id.tab2);
        tab3 = (TabItem) findViewById(R.id.tab3);
        
        viewpager =(ViewPager)findViewById(R.id.Pager);
        drawerLayout = findViewById(R.id.drawer_layout);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);
        
        navigationView = findViewById(R.id.nav_view);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.menu_open,R.string.close_menu);
        actionBarDrawerToggle.syncState();

        bottomNavigationView = findViewById(R.id.bottom_nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,h1).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.homefragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,h1).commit();
                        break;
                }
                switch (item.getItemId()) {
                    case R.id.home1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,h2).commit();
                        break;
                }
                switch (item.getItemId()) {
                    case R.id.home2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,h3).commit();
                        break;
                }
                switch (item.getItemId()) {
                    case R.id.home3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,h4).commit();
                        break;
                }
                return true;
            }
        });

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                switch (item.getItemId()){
                    case R.id.nav_profile:
                        drawerLayout.closeDrawer(GravityCompat.START);

                        Intent i = new Intent(Drawer_menu.this, profile.class);
                        startActivity(i);
                        break;
                }
                switch (item.getItemId()){
                    case R.id.nav_contest:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Intent contest = new Intent(Drawer_menu.this,mycontest.class);
                        startActivity(contest);
                        break;
                }
                switch (item.getItemId()){
                    case R.id.nav_wallet:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Intent wallet = new Intent(Drawer_menu.this,mywallet.class);
                        startActivity(wallet);
                        break;
                }
                switch (item.getItemId()){
                    case R.id.nav_transaction:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Intent trans = new Intent(Drawer_menu.this, mytransaction.class);
                        startActivity(trans);
                        break;
                }
                switch (item.getItemId()){
                    case R.id.nav_account:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Intent acc = new Intent(Drawer_menu.this, Balance.class);
                        startActivity(acc);
                        break;
                }
                switch (item.getItemId()){
                    case R.id.nav_refer:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Intent refer = new Intent(Drawer_menu.this, Refer.class);
                        startActivity(refer);
                        break;
                }
                switch (item.getItemId()){
                    case R.id.nav_play:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Intent play = new Intent(Drawer_menu.this, how_to_play.class);
                        startActivity(play);
                        break;
                }
                switch (item.getItemId()){
                    case R.id.nav_privacy:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Intent privacy = new Intent(Drawer_menu.this, privacy_policy.class);
                        startActivity(privacy);
                        break;
                }
                switch (item.getItemId()){
                    case R.id.nav_terms:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Intent term = new Intent(Drawer_menu.this, term_and_condition.class);
                        startActivity(term);
                        break;
                }
                switch (item.getItemId()){
                    case R.id.nav_Help:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        Intent help = new Intent(Drawer_menu.this, help_support.class);
                        startActivity(help);
                        break;
                }

                switch (item.getItemId()){
                    case R.id.nav_logout:
                        Toast.makeText(Drawer_menu.this, "Logout", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Intent log_out = new Intent(Drawer_menu.this, Login.class);
                        startActivity(log_out);
                        break;
                }
                return true;
            }
        });


    }


}