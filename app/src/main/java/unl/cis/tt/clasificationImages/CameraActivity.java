package unl.cis.tt.clasificationImages;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import unl.cis.tt.R;

public class CameraActivity extends Activity {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
       /* if (null == savedInstanceState) {
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, Camera2BasicFragment.newInstance())
                    .commit();
        }*/
    }
}
