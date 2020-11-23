package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button alertDialogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alertDialogButton = (Button) findViewById(R.id.alertDialogButton);
        addListenerButtons();
    }

    public Button getAlertDialogButton() {
        return alertDialogButton;
    }

    public void setAlertDialogButton(Button alertDialogButton) {
        this.alertDialogButton = alertDialogButton;
    }

    private void addListenerButtons(){
        this.getAlertDialogButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createFileDialog();
            }
        });
    }

    private void createFileDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("AlertDialog 2 botones");
        builder.setMessage("¿Quieres cerrar la app?");

        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                TextView aux = (TextView) findViewById(R.id.textViewAlert);
                aux.setText("has pulsado aceptar");
            }
        });

        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                TextView aux = (TextView) findViewById(R.id.textViewAlert);
                aux.setText("Has pulsado cancelar");
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}