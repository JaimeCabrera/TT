package unl.cis.tt.view;


import android.Manifest;
import android.animation.Animator;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.Toolbar;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

import unl.cis.tt.MainActivity;
import unl.cis.tt.R;
import unl.cis.tt.clasificationImages.CameraActivity;

import static android.Manifest.permission.ACCESS_FINE_LOCATION;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment  {
    private static final int PERMISSION_REQUEST_CODE = 200;
    private View view;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        showToolbar("Home", false, view);

       final FloatingActionButton btn_camera = (FloatingActionButton) view.findViewById(R.id.buttonOpenCamera);
        
        btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClasificator();
            }
        });
        return view;

    }

    public void showToolbar(String tittle, Boolean upButton, View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

    public void openClasificator(){
        Intent intent = new Intent(getContext(),CameraActivity.class);
        startActivity(intent);
    }
    /*//tomar funcion que abre la camara fotos
    static final int REQUEST_IMAGE_CAPTURE = 1;

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(((AppCompatActivity) getActivity()).getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    /// metodo que esta atento a ver si el botton es clickeado y verifica si tiene los permisos
    //y generata un msj toast que puede tomar fotos caso contario pide permisos de acceso a la camara
    @Override
    public void onClick(View v) {
        view = v;

        int id = v.getId();
        switch (id) {
            case R.id.buttonOpenCamera: {
                if (checkPermission()) {
                    //si el permiso es valido la app abre la camara
                    *//*Toast.makeText(getApplicationContext(), "Ahora si puedes tomar la foto", Toast.LENGTH_SHORT).show();*//*
                    dispatchTakePictureIntent();

                } else {
                    *//*Toast.makeText(getApplicationContext(), "Por favor Concede los permisos", Toast.LENGTH_SHORT).show();*//*
                    requestPermission();
                }
            }
            break;
        }

    }

    //funcion para virificar si los permisos estan dados
    private boolean checkPermission() {
        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED)
            if (ActivityCompat.checkSelfPermission(this.getContext(), ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // Permission is not granted
                return false;
            }
        return true;
    }


    //esta funcion envia un peticion para pedir permisos en este caso a la camara
    private void requestPermission() {

        ActivityCompat.requestPermissions(this.getActivity(), new String[]{Manifest.permission.CAMERA, ACCESS_FINE_LOCATION, WRITE_EXTERNAL_STORAGE}, PERMISSION_REQUEST_CODE);
    }
    //// para poner un dialogo de permisos en la app

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_REQUEST_CODE:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    *//* Toast.makeText(getApplicationContext(), "Permission Granted", Toast.LENGTH_SHORT).show();*//*

                    // main logic
                } else {
                    *//*Toast.makeText(getApplicationContext(), "Por favor Concede los permisos", Toast.LENGTH_SHORT).show();*//*
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                            showMessageOKCancel("Por favor Concede los siguientes permisos: Camara, Localizacion y Almacenamiento para acceder a todas las funcionalidades de PlagScanner",
                                    new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                                requestPermission();
                                            }
                                        }
                                    });
                        }
                    }
                }
                break;
        }
    }

    private void showMessageOKCancel(String message, DialogInterface.OnClickListener okListener) {
        new AlertDialog.Builder(this.getContext())
                .setMessage(message)
                .setPositiveButton("OK", okListener)
                .setNegativeButton("Cancel", null)
                .create()
                .show();

    }
*/
}
