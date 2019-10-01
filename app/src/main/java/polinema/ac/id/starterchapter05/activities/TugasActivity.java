package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HandstandFragment;
import polinema.ac.id.starterchapter05.fragments.PushupsFragment;

public class TugasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas);
    }

    public void handlePushUp(View view) {
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_right,R.anim.enter_from_right,R.anim.exit_from_left)
                .replace(R.id.contentFragment, new PushupsFragment())
                .addToBackStack(null)
                .commit();
    }

    public void handleDips(View view) {
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right)
                .replace(R.id.contentFragment, new DipsFragment())
                .addToBackStack(null)
                .commit();
    }

    public void handleHandstand(View view) {
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right)
                .replace(R.id.contentFragment, new HandstandFragment())
                .addToBackStack(null)
                .commit();
    }
}
