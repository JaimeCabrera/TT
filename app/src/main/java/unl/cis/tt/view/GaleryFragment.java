package unl.cis.tt.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import unl.cis.tt.R;
import unl.cis.tt.adapter.PictureAdapterRecyclerView;
import unl.cis.tt.model.Picture;

/**
 * A simple {@link Fragment} subclass.
 */
public class GaleryFragment extends Fragment {


    public GaleryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_galery, container, false);
        ///trayendo un string desde resourses
        showToolbar(getResources().getString(R.string.textToolbarGalery),false,view);
        RecyclerView picturesRecicler = (RecyclerView)view.findViewById(R.id.pictureRecycled);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        picturesRecicler.setLayoutManager(linearLayoutManager);
        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buildPictures(),R.layout.cardview_picture,getActivity());
        picturesRecicler.setAdapter(pictureAdapterRecyclerView);
        return view;

    }
    public ArrayList<Picture> buildPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("http://www.certisagrosostenible.es/wp-content/uploads/2017/03/colorado-potato-beetle-582966_640.jpg","Escarabajo de patata","La lancha "));
        pictures.add(new Picture("http://hidroponia.mx/wp-content/uploads/2015/09/minador.jpg","Pie Negro","La lancha "));
        pictures.add(new Picture("https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/Late_blight_on_potato_leaf_2.jpg/220px-Late_blight_on_potato_leaf_2.jpg","Polilla de patata","La lancha "));
        pictures.add(new Picture("https://planetahuerto-6f4f.kxcdn.com/estaticos/imagenes/guia/6/6_620x466.jpg","Pulgón de patata","La lancha "));
        pictures.add(new Picture("http://agricultura101.com/wp-content/uploads/2014/09/Plagas-en-el-cultivo-de-la-papa-1.jpg","Ácaros(araña roja)","La lancha "));
        return pictures;
    }
    public void showToolbar(String tittle, Boolean upButton, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

}
