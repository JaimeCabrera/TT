package unl.cis.tt;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import unl.cis.tt.view.infoFragment;
import unl.cis.tt.view.GuideFragment;
import unl.cis.tt.view.HomeFragment;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //crear un obejeto de bottomNa.. para cambiar entre los fragments
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);
        //metodo que esta escuchando a los cambios en el bottombar
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        HomeFragment homeFragment = new HomeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(null).commit();
                        break;
                    case R.id.navigation_capturas:
                        GuideFragment guideFragment = new GuideFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, guideFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(null).commit();
                        break;
                    case R.id.navigation_guia:
                        infoFragment galeryFragment = new infoFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, galeryFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(null).commit();
                        break;
                }
                return true;
            }
        });
        // set default fragment with tab not selected
        HomeFragment homeFragment = new HomeFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, homeFragment);
        transaction.commit();

    }

    public native String stringFromJNI();
}
