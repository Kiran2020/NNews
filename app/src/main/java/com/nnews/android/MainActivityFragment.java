package com.nnews.android;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import java.util.InputMismatchException;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    /**
     * Private instace variable.
     */
    private static final String LOG_TAG = "MainAcitivityFragment";

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_main, container, false);

        Button logIn = (Button) rootView.findViewById(R.id.login_button);
        // event handler for logIn Button
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call next Acitivity
                Intent intent = new Intent(getActivity(), Viewer.class);
                getActivity().startActivity(intent);
            }
        });

        // Facebook callback Manager
//        CallbackManager callbackManager = CallbackManager.Factory.create();
//
//        LoginButton loginButton = (LoginButton) rootView.findViewById(R.id.login_button);
//
//
//        loginButton.setFragment(this);
//
//        // Callback registration
//        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
//            @Override
//            public void onSuccess(LoginResult loginResult) {
//                Log.v(LOG_TAG, "Login Successfull.");
//                // Call next Acitivity
//                Intent intent = new Intent(getActivity().getApplicationContext(), Viewer.class);
//                getActivity().startActivity(intent);
//            }
//
//            @Override
//            public void onCancel() {
//
//            }
//
//            @Override
//            public void onError(FacebookException error) {
//
//            }
//        });

        return rootView;
    }

 }
