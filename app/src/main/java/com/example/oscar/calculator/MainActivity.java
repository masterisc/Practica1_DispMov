package com.example.oscar.calculator;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    boolean punto = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        colorBoton();
    }

    protected void colorBoton(){
        @SuppressLint("WrongViewCast") AppCompatButton v = (AppCompatButton) findViewById(R.id.botonC);
        ColorStateList csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xffffc653});
        v.setSupportBackgroundTintList(csl);

        v = (AppCompatButton) findViewById(R.id.botonDiv);
        csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xffffc653});
        v.setSupportBackgroundTintList(csl);

        v = (AppCompatButton) findViewById(R.id.botonPor);
        csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xffffc653});
        v.setSupportBackgroundTintList(csl);

        v = (AppCompatButton) findViewById(R.id.botonDel);
        csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xffffc653});
        v.setSupportBackgroundTintList(csl);

        v = (AppCompatButton) findViewById(R.id.botonMenos);
        csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xffffc653});
        v.setSupportBackgroundTintList(csl);

        v = (AppCompatButton) findViewById(R.id.botonMas);
        csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xffffc653});
        v.setSupportBackgroundTintList(csl);

        v = (AppCompatButton) findViewById(R.id.botonIgual);
        csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xffffc653});
        v.setSupportBackgroundTintList(csl);

        v = (AppCompatButton) findViewById(R.id.boton9);
        csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xff28a3ff});
        v.setSupportBackgroundTintList(csl);

        v = (AppCompatButton) findViewById(R.id.boton8);
        csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xff28a3ff});
        v.setSupportBackgroundTintList(csl);

        v = (AppCompatButton) findViewById(R.id.boton7);
        csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xff28a3ff});
        v.setSupportBackgroundTintList(csl);

        v = (AppCompatButton) findViewById(R.id.boton6);
        csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xff28a3ff});
        v.setSupportBackgroundTintList(csl);

        v = (AppCompatButton) findViewById(R.id.boton5);
        csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xff28a3ff});
        v.setSupportBackgroundTintList(csl);

        v = (AppCompatButton) findViewById(R.id.boton4);
        csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xff28a3ff});
        v.setSupportBackgroundTintList(csl);

        v = (AppCompatButton) findViewById(R.id.boton3);
        csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xff28a3ff});
        v.setSupportBackgroundTintList(csl);

        v = (AppCompatButton) findViewById(R.id.boton2);
        csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xff28a3ff});
        v.setSupportBackgroundTintList(csl);

        v = (AppCompatButton) findViewById(R.id.boton1);
        csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xff28a3ff});
        v.setSupportBackgroundTintList(csl);

        v = (AppCompatButton) findViewById(R.id.boton0);
        csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xff28a3ff});
        v.setSupportBackgroundTintList(csl);

        v = (AppCompatButton) findViewById(R.id.botonPunto);
        csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xff28a3ff});
        v.setSupportBackgroundTintList(csl);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        TextView pantalla = (TextView) findViewById(R.id.texto);
        String texto = (String) pantalla.getText();
        int botonPresionado = v.getId();

        try{
            switch (botonPresionado){
                case R.id.boton0:
                    if(!pantalla.getText().toString().equals("0")){
                        texto += "0";
                        pantalla.setText(texto);
                    }
                    else{
                        pantalla.setText("0");
                    }
                    break;
                case R.id.boton1:
                    if(!pantalla.getText().toString().equals("0")){
                        texto += "1";
                        pantalla.setText(texto);
                    }
                    else{
                        pantalla.setText("1");
                    }
                    break;
                case R.id.boton2:
                    if(!pantalla.getText().toString().equals("0")){
                        texto += "2";
                        pantalla.setText(texto);
                    }
                    else{
                        pantalla.setText("2");
                    }
                    break;
                case R.id.boton3:
                    if(!pantalla.getText().toString().equals("0")){
                        texto += "3";
                        pantalla.setText(texto);
                    }
                    else{
                        pantalla.setText("3");
                    }
                    break;
                case R.id.boton4:
                    if(!pantalla.getText().toString().equals("0")){
                        texto += "4";
                        pantalla.setText(texto);
                    }
                    else{
                        pantalla.setText("4");
                    }
                    break;
                case R.id.boton5:
                    if(!pantalla.getText().toString().equals("0")){
                        texto += "5";
                        pantalla.setText(texto);
                    }
                    else{
                        pantalla.setText("5");
                    }
                    break;
                case R.id.boton6:
                    if(!pantalla.getText().toString().equals("0")){
                        texto += "6";
                        pantalla.setText(texto);
                    }
                    else{
                        pantalla.setText("6");
                    }
                    break;
                case R.id.boton7:
                    if(!pantalla.getText().toString().equals("0")){
                        texto += "7";
                        pantalla.setText(texto);
                    }
                    else{
                        pantalla.setText("7");
                    }
                    break;
                case R.id.boton8:
                    if(!pantalla.getText().toString().equals("0")){
                        texto += "8";
                        pantalla.setText(texto);
                    }
                    else{
                        pantalla.setText("8");
                    }
                    break;
                case R.id.boton9:
                    if(!pantalla.getText().toString().equals("0")){
                        texto += "9";
                        pantalla.setText(texto);
                    }
                    else{
                        pantalla.setText("9");
                    }
                    break;
                case R.id.botonPunto:
                    if(!punto){
                        if(pantalla.getText().toString().length() == 0){
                            texto += "0.";
                        }
                        else{
                            texto += ".";
                        }
                        pantalla.setText(texto);
                        punto = true;
                    }
                    break;
                case R.id.botonC:
                    punto = false;
                    pantalla.setText("");
                    break;
            }
        }catch(Exception e){
            pantalla.setText("ERROR");
        }
    }
}
