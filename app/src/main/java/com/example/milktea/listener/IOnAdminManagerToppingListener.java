package com.example.milktea.listener;

import com.example.milktea.model.Topping;

public interface IOnAdminManagerToppingListener {
    void onClickUpdateTopping(Topping topping);
    void onClickDeleteTopping(Topping topping);
}
