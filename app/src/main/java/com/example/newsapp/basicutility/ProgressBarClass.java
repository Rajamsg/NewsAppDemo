package com.example.newsapp.basicutility;

import android.app.ProgressDialog;
import android.content.Context;

import com.example.newsapp.R;

public class ProgressBarClass {

    ProgressDialog progressDialog;

    public void showProgress(Context context)
    {
        try {
            progressDialog = new ProgressDialog(context);
            progressDialog.setMessage("Loading");
            progressDialog.setTitle(R.string.app_name);
            progressDialog.setCancelable(false);
            progressDialog.show();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void showProgressFalse(Context context)
    {
        try {
            progressDialog = new ProgressDialog(context);
            progressDialog.setMessage("Loading");
            progressDialog.setTitle(R.string.app_name);
            progressDialog.setCancelable(true);
            progressDialog.show();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void dismissProgress()
    {
        try {
            progressDialog.dismiss();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
