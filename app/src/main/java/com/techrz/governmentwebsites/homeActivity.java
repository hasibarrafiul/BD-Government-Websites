package com.techrz.governmentwebsites;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;


public class homeActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    static String link;
    //Dialog myDialoag;
    private AlertDialog.Builder dialogeBuilder;
    private AlertDialog myDialog;
    private AlertDialog myDialog2;
    private AlertDialog myDialog3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        boolean firstStart = prefs.getBoolean("firstStart", true);

        if (firstStart) {
            howtouse();
        }

        ImageView education= findViewById(R.id.edu);
        ImageView sports= findViewById(R.id.spo);
        ImageView transportation= findViewById(R.id.trans);
        ImageView health= findViewById(R.id.health);
        ImageView agriculture= findViewById(R.id.agriculture);
        ImageView embassies= findViewById(R.id.embassy);
        ImageView entertainment= findViewById(R.id.entertainment);
        ImageView literature= findViewById(R.id.literature);
        ImageView religion= findViewById(R.id.religion);
        ImageView technology= findViewById(R.id.technology);
        ImageView birthRegistration= findViewById(R.id.birthReg);
        ImageView defense= findViewById(R.id.defense);
        ImageView nid= findViewById(R.id.nid);
        ImageView epassport= findViewById(R.id.ePassport);
        ImageView newspaper= findViewById(R.id.newspaper);
        ImageView bank= findViewById(R.id.bank);
        ImageButton b=findViewById(R.id.menu);
       // myDialoag= new Dialog(this);

        education.setOnClickListener(v -> education());

        sports.setOnClickListener(v -> sports());

        transportation.setOnClickListener(v -> transportation());

        health.setOnClickListener(v -> health());

        agriculture.setOnClickListener(v -> agriculture());

        embassies.setOnClickListener(v -> embassies());

        entertainment.setOnClickListener(v -> entertainment());

        literature.setOnClickListener(v -> literature());

        religion.setOnClickListener(v -> religion());

        technology.setOnClickListener(v -> tech());

        birthRegistration.setOnClickListener(v -> birthreg());

        defense.setOnClickListener(v -> defense());

        nid.setOnClickListener(v -> nid());

        epassport.setOnClickListener(v -> ePassport());

        newspaper.setOnClickListener(v -> newspaper());

        bank.setOnClickListener(v -> bank());

        b.setOnClickListener(this::showPopup);


    }

    void education(){
        Intent i= new Intent(this,Education.class);
        startActivity(i);
        //finish();
    }
    void sports(){
        Intent i= new Intent(this,Sports.class);
        startActivity(i);
        //finish();
    }
    void transportation(){
        Intent i= new Intent(this,Transportation.class);
        startActivity(i);
        //finish();
    }
    void health(){
        Intent i= new Intent(this,Health.class);
        startActivity(i);
        //finish();
    }
    void agriculture(){
        Intent i= new Intent(this,Agriculture.class);
        startActivity(i);
        //finish();
    }
    void embassies(){
        Intent i= new Intent(this,Embassies.class);
        startActivity(i);
        //finish();
    }
    void entertainment(){
        Intent i= new Intent(this,Entertainment.class);
        startActivity(i);
        //finish();
    }
    void literature(){
        Intent i= new Intent(this, Literature.class);
        startActivity(i);
        //finish();
    }
    void religion(){
        Intent i= new Intent(this,Religions.class);
        startActivity(i);
        //finish();
    }
    void tech(){
        Intent i= new Intent(this,Technology.class);
        startActivity(i);
        //finish();
    }
    void birthreg(){
        Intent i = new Intent(this,BirthRegistration.class);
        startActivity(i);
    }
    void defense(){
        Intent i =new Intent(this,Defense.class);
        startActivity(i);
    }
    void nid(){
        Intent i =new Intent(this,Nid.class);
        startActivity(i);
    }
    void ePassport(){
        Intent i =new Intent(this,ePassport.class);
        startActivity(i);
    }
    void newspaper(){
        Intent i =new Intent(this,newspaper.class);
        startActivity(i);
    }
    void bank(){
        Intent i =new Intent(this,bank.class);
        startActivity(i);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.dropdown_menu,menu);
//        return true;
//    }
    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        //MenuInflater inflater = popup.getMenuInflater();
        popup.inflate(R.menu.dropdown_menu);
        popup.show();

    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        if(item.getItemId()==R.id.howToUSe){
            howtouse();
            return true;
        }
        if(item.getItemId()==R.id.aboutUs){
            aboutus();
            return true;
        }
        if(item.getItemId()==R.id.otherapps){
            otherapps();
            return true;
        }
        if(item.getItemId()==R.id.exit){
            exit();
            return true;
        }
        else{
            return false;
        }

    }

    void howtouse(){
        dialogeBuilder = new AlertDialog.Builder(this);
        final View contentpopupview = getLayoutInflater().inflate(R.layout.howtouse,null);
        dialogeBuilder.setView(contentpopupview);
        myDialog2= dialogeBuilder.create();
        myDialog2.show();
        Button ok= contentpopupview.findViewById(R.id.howtouseok);
        ok.setOnClickListener(v -> myDialog2.cancel());
        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("firstStart", false);
        editor.apply();
    }
    void aboutus(){
        dialogeBuilder = new AlertDialog.Builder(this);
        final View contentpopupview = getLayoutInflater().inflate(R.layout.aboutus,null);
        dialogeBuilder.setView(contentpopupview);
        myDialog3= dialogeBuilder.create();
        myDialog3.show();
        Button ok= contentpopupview.findViewById(R.id.okabout);
        TextView rafsan= contentpopupview.findViewById(R.id.rafsan);
        TextView maruf= contentpopupview.findViewById(R.id.maruf);
        TextView fardin= contentpopupview.findViewById(R.id.fardin);
        TextView fahim= contentpopupview.findViewById(R.id.fahim);
        TextView techrz= contentpopupview.findViewById(R.id.techrz);

        TextView textView = contentpopupview.findViewById(R.id.about);
        SpannableString content = new SpannableString("Team Techrz");
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        textView.setText(content);
        rafsan.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rashikbuksh"));
            startActivity(intent);
        });
        maruf.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/maruf.ahmed.official"));
            startActivity(intent);
        });
        fardin.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/fardinwasif1"));
            startActivity(intent);
        });
        fahim.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/hasib.fahim.official"));
            startActivity(intent);
        });
        techrz.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Techrzit"));
            startActivity(intent);
        });
        ok.setOnClickListener(v -> myDialog3.cancel());
    }
    void otherapps(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Techrz+ltd."));
        startActivity(intent);
    }
    void exit(){
        dialogeBuilder = new AlertDialog.Builder(this);
        final View contentpopupview = getLayoutInflater().inflate(R.layout.exitpopup,null);
        dialogeBuilder.setView(contentpopupview);
        myDialog= dialogeBuilder.create();
        myDialog.show();
        Button exitt= contentpopupview.findViewById(R.id.eixtreally);
        Button goback= contentpopupview.findViewById(R.id.goback);
        exitt.setOnClickListener(v -> {
            finish();
            System.exit(0);
        });
        goback.setOnClickListener(v -> myDialog.cancel());

    }

    @Override
    public void onBackPressed() {
        exit();
    }
}