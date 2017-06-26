package com.example.usuario.prueba;

import android.content.DialogInterface;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12;
    Button btnTiempo, btnSalir;
    TextView txtMensaje;



    int [] arregloImg;
    ImageView [] imagenes;

    int contador1;
    int enumerador;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = (ImageView) findViewById(R.id.ImageView1);
        img2 = (ImageView) findViewById(R.id.ImageView2);
        img3 = (ImageView) findViewById(R.id.ImageView3);
        img4 = (ImageView) findViewById(R.id.ImageView4);
        img5 = (ImageView) findViewById(R.id.ImageView5);
        img6 = (ImageView) findViewById(R.id.ImageView6);
        img7 = (ImageView) findViewById(R.id.ImageView7);
        img8 = (ImageView) findViewById(R.id.ImageView8);
        img9 = (ImageView) findViewById(R.id.ImageView9);
        img10 = (ImageView) findViewById(R.id.ImageView10);
        img11 = (ImageView) findViewById(R.id.ImageView11);
        img12 = (ImageView) findViewById(R.id.ImageView12);
        btnTiempo = (Button) findViewById(R.id.ButtonTiempo);
        btnSalir = (Button) findViewById(R.id.ButtonSalir);
        txtMensaje= (TextView) findViewById(R.id.TextViewContador);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);
        img10.setOnClickListener(this);
        img11.setOnClickListener(this);
        img12.setOnClickListener(this);
        btnTiempo.setOnClickListener(this);
        btnSalir.setOnClickListener(this);

        arregloImg = new int[5];
        imagenes = new ImageView[5];

        contador1 = 0;
        enumerador = 0;

        this.desactivar();
    }

    public void desactivar(){
        img1.setEnabled(false);
        img2.setEnabled(false);
        img3.setEnabled(false);
        img4.setEnabled(false);
        img5.setEnabled(false);
        img6.setEnabled(false);
        img7.setEnabled(false);
        img8.setEnabled(false);
        img9.setEnabled(false);
        img10.setEnabled(false);
        img11.setEnabled(false);
        img12.setEnabled(false);
    }

    public void activar(){
        img1.setEnabled(true);
        img2.setEnabled(true);
        img3.setEnabled(true);
        img4.setEnabled(true);
        img5.setEnabled(true);
        img6.setEnabled(true);
        img7.setEnabled(true);
        img8.setEnabled(true);
        img9.setEnabled(true);
        img10.setEnabled(true);
        img11.setEnabled(true);
        img12.setEnabled(true);
    }

    public void comparar(int idImgF, ImageView image) {

        arregloImg [contador1] = idImgF;
        imagenes [contador1] = image;

        if (contador1 == 1) {
            if (arregloImg[0]== arregloImg[1]) {
                    txtMensaje.setText("Son iguales");
                    imagenes[0].setEnabled(false); //Se encuentra almacenado el objeto ImageView, al cual lo inhabilitamos.
                    imagenes[1].setEnabled(false);
                    contador1 = -1;
                    enumerador++;
                }else{
                    txtMensaje.setText("Son diferentes");
                    imagenes[0].setEnabled(true);
                    imagenes[1].setEnabled(true);
                    imagenes[0].setImageResource(R.drawable.android);
                    imagenes[1].setImageResource(R.drawable.android);
                    contador1 = -1;
                }
            }
        contador1++;
        }

    public void cronometro(){
        new CountDownTimer(60000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                btnTiempo.setEnabled(false);
                txtMensaje.setText(""+millisUntilFinished/1000);
                    if(enumerador==6){
                        txtMensaje.setText("Ganaste...");
                    }
            }

            @Override
            public void onFinish() {
                desactivar();
                btnTiempo.setEnabled(true);
                if(enumerador!=6){
                    txtMensaje.setText("Perdiste...");
                }
            }
        }.start();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ImageView1:
                img1.setImageResource(R.drawable.pucca1);
                comparar(R.drawable.pucca1, img1);
                break;
            case R.id.ImageView2:
                img2.setImageResource(R.drawable.pucca2);
                comparar(R.drawable.pucca2, img2);
                break;
            case R.id.ImageView3:
                img3.setImageResource(R.drawable.pucca3);
                comparar(R.drawable.pucca3, img3);
                break;
            case R.id.ImageView4:
                img4.setImageResource(R.drawable.pucca4);
                comparar(R.drawable.pucca4, img4);
                break;
            case R.id.ImageView5:
                img5.setImageResource(R.drawable.pucca5);
                comparar(R.drawable.pucca5, img5);
                break;
            case R.id.ImageView6:
                img6.setImageResource(R.drawable.pucca6);
                comparar(R.drawable.pucca6, img6);
                break;
            case R.id.ImageView7:
                img7.setImageResource(R.drawable.pucca1);
                comparar(R.drawable.pucca1, img7);
                break;
            case R.id.ImageView8:
                img8.setImageResource(R.drawable.pucca2);
                comparar(R.drawable.pucca2, img8);
                break;
            case R.id.ImageView9:
                img9.setImageResource(R.drawable.pucca3);
                comparar(R.drawable.pucca3, img9);
                break;
            case R.id.ImageView10:
                img10.setImageResource(R.drawable.pucca4);
                comparar(R.drawable.pucca4, img10);
                break;
            case R.id.ImageView11:
                img11.setImageResource(R.drawable.pucca5);
                comparar(R.drawable.pucca5, img11);
                break;
            case R.id.ImageView12:
                img12.setImageResource(R.drawable.pucca6);
                comparar(R.drawable.pucca6, img12);
                break;
            case R.id.ButtonTiempo:
                this.activar();
                cronometro();
                break;
            case R.id.ButtonSalir:
                this.finish();
                break;
        }
    }
}
