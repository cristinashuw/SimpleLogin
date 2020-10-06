package com.cristinashuw.simplelogin;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preferences {
    /** Pendeklarasian key-data berupa String, untuk sebagai wadah penyimpanan data.
     * Jadi setiap data mempunyai key yang berbeda satu sama lain */
    static final String KEY_USER_TEREGISTER ="user", KEY_PASS_TEREGISTER = "pass";
    static final String KEY_USERNAME_SEDANG_LOGIN = "username_logged_in";
    static final String KEY_STATUS_SEDANG_LOGIN = "status_logged_in";


    /** Pendlakarasian Shared Preferences yang berdasarkan paramater context */
    private static SharedPreferences getSharedPreferences(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    /** Deklarasi Edit Preferences dan mengubah data
     *  yang memiliki key isi KEY_USER_TEREGISTER dengan parameter username */
    public static void setRegisteredUser(Context context, String username) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString(KEY_USER_TEREGISTER, username);
        editor.apply();
    }

    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
    public static String getRegisteredUser(Context context) {
        return getSharedPreferences(context).getString(KEY_USER_TEREGISTER, "");
    }

    /** Deklarasi Edit Preferences dan mengubah data
     *  yang memiliki key KEY_PASS_TEREGISTER dengan parameter password */

}
