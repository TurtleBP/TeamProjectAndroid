package com.example.milktea.listener;

import com.example.milktea.model.Drink;

public interface IOnAdminManagerDrinkListener {
    void onClickUpdateDrink(Drink drink);
    void onClickDeleteDrink(Drink drink);
}
