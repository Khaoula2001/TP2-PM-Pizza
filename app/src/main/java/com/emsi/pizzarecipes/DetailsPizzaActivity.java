package com.emsi.pizzarecipes;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.emsi.pizzarecipes.beans.Produit;
import com.emsi.pizzarecipes.service.ProduitService;

public class DetailsPizzaActivity extends AppCompatActivity {

    private ProduitService ps=ProduitService.getInstance();
    private Produit produit ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_pizza);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Pizza Recipes");
        int id =  Integer.parseInt(getIntent().getStringExtra("idp"));
        produit = ps.findById(id);
        ((ImageView) findViewById(R.id.PizzaImage)).setImageResource(produit.getPhoto());
        ((TextView) findViewById(R.id.PizzaTitle)).setText(produit.getNom());
        ((TextView) findViewById(R.id.discription)).setText(produit.getDescription());
        ((TextView) findViewById(R.id.ingredients)).setText(produit.getDetaisIngred());
        ((TextView) findViewById(R.id.discription)).setText(produit.getDescription());
        ((TextView) findViewById(R.id.preparation)).setText(produit.getPreparation());


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem shareItem = menu.add(0, 1, 0, "Share");
        shareItem.setIcon(ContextCompat.getDrawable(this, R.mipmap.share));
        shareItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        shareItem.setOnMenuItemClickListener(item -> {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this amazing app!");
            startActivity(Intent.createChooser(shareIntent, "Share via"));
            return true;
        });

        return true;
    }
}