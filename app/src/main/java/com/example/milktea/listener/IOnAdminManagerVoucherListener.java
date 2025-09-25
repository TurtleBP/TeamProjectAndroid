package com.example.milktea.listener;

import com.example.milktea.model.Voucher;

public interface IOnAdminManagerVoucherListener {
    void onClickUpdateVoucher(Voucher voucher);
    void onClickDeleteVoucher(Voucher voucher);
}
