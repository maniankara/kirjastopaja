package fi.kirjastopaja.kirjastonvaraus.listener;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;

import fi.kirjastopaja.kirjastovaraus.R;

/**
 * Created by anovil on 27/09/15.
 */
public class LongClickWebViewListener implements View.OnLongClickListener {

    private final FragmentManager mFragmentManager;
    private final LayoutInflater mLayoutInflater;
    private android.content.Context mMainActivity;

    public LongClickWebViewListener(Activity mainActivity, FragmentManager fm, LayoutInflater inflater) {
        this.mMainActivity = mainActivity ;
        this.mFragmentManager = fm;
        this.mLayoutInflater = inflater;
    }

    @Override
    public boolean onLongClick(View v) {
        // PasswordModifierDialog dialog = new PasswordModifierDialog();
        // dialog.show(this.mFragmentManager, "text");
        // return false;

        AlertDialog.Builder  builder = new AlertDialog.Builder(mMainActivity);

        builder.setView(this.mLayoutInflater.inflate(R.layout.password_layout, null))
                .setTitle("Password (Un)lock")
                .setPositiveButton("lock", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // lock
                        // https://github.com/shaobin0604/Android-HomeKey-Locker
                    }
                })
                .setNegativeButton("unlock", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // unlock
                        // https://github.com/shaobin0604/Android-HomeKey-Locker
                    }
                })
                .setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // cancel
                    }
                });

        builder.show();
        return true;
    }
}
