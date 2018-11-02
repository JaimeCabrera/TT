package unl.cis.tt.view;


import android.content.Intent;
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
public class GuideFragment extends Fragment {


    public GuideFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_guide, container, false);
        showToolbar("Guia de plagas", false, view);

        RecyclerView picturesRecicler = (RecyclerView) view.findViewById(R.id.pictureRecycled);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        picturesRecicler.setLayoutManager(linearLayoutManager);
        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buildPictures(), R.layout.cardview_picture, getActivity());
        picturesRecicler.setAdapter(pictureAdapterRecyclerView);
        return view;

    }

    public ArrayList<Picture> buildPictures() {
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture(getResources().getDrawable(R.drawable.ic_imageview).toString(), "Escarabajo de patata", "La lancha "));
        pictures.add(new Picture(getResources().getDrawable(R.drawable.ic_imageview).toString(), "Pie Negro", "La lancha "));
        pictures.add(new Picture(getResources().getDrawable(R.drawable.ic_imageview).toString(), "Polilla de patata", "La lancha "));
        pictures.add(new Picture(getResources().getDrawable(R.drawable.ic_imageview).toString(), "Pulgón de patata", "La lancha "));
        pictures.add(new Picture(getResources().getDrawable(R.drawable.ic_imageview).toString(), "Ácaros(araña roja)", "La lancha "));
        return pictures;
    }

    public void showToolbar(String tittle, Boolean upButton, View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

}
