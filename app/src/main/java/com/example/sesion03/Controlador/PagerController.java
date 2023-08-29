package com.example.sesion03.Controlador;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerController extends FragmentStatePagerAdapter {

    int numoftabs;

    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm);
        this.numoftabs = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Hamburguesas();
            case 1:
                return new Bebidas();
            case 2:
                return new Golosinas();
            default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}
