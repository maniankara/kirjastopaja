package fi.kirjastopaja.kirjastonvaraus.listener;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;

import fi.kirjastopaja.kirjastovaraus.MainActivity;

/**
 * Created by anovil on 27/09/15.
 */
public class LongClickWebViewListener implements View.OnLongClickListener {

    private android.content.Context mMainActivity;

    public LongClickWebViewListener(Activity mainActivity) {
        this.mMainActivity = mainActivity ;
    }

    @Override
    public boolean onLongClick(View v) {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(mMainActivity); //Read Update
        alertDialogBuilder.setTitle("Password Unlock")
            .setMessage("Type the unlock password here...")
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
            .setNeutralButton("cancel", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // cancel
                }
            })
        ;

        alertDialogBuilder.show();  //<-- See This!
        return false;
    }
}
