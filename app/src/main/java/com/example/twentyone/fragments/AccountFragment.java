package com.example.twentyone.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.twentyone.R;
import com.example.twentyone.model.data.User;
import com.example.twentyone.restapi.RestAPIManager;
import com.example.twentyone.restapi.callback.AccountAPICallBack;

import java.util.Objects;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AccountFragment extends Fragment implements AccountAPICallBack {

    public static final String TAG = AccountFragment.class.getSimpleName();

    private static final AccountFragment ourInstance = new AccountFragment();

    public static AccountFragment getInstance() {
        return ourInstance;
    }

    public AccountFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_account, container, false);
        return view;
    }

    @Override
    public void onChangePassword() {
        password_input = Objects.requireNonNull(ourInstance.getActivity()).findViewById(R.id.password_text_input);
        RestAPIManager.getInstance().changePassword(username, password, this);
    }

    @Override
    public void onCheckUserExistence(User user) { }

    @Override
    public void onCheckEmailExistence(User user) { }

    @Override
    public void onUsernameFailed() { }

    @Override
    public void onEmailFailed() { }

    @Override
    public void onUserIsAbleToBeCreated() { }

    @Override
    public void onFailure(Throwable t) { }
}
