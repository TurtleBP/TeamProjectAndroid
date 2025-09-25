package com.example.milktea.activity;

import android.os.Bundle;
import android.os.Handler;

import com.example.milktea.MyApplication;
import com.example.milktea.R;
import com.example.milktea.database.DrinkDatabase;
import com.example.milktea.event.DisplayCartEvent;
import com.example.milktea.event.OrderSuccessEvent;
import com.example.milktea.model.Order;
import com.example.milktea.utils.Constant;
import com.example.milktea.utils.GlobalFunction;

import org.greenrobot.eventbus.EventBus;

public class PaymentActivity extends BaseActivity {

    private Order mOrderBooking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        getDataIntent();

        Handler handler = new Handler();
        handler.postDelayed(this::createOrderFirebase, 2000);
    }

    private void getDataIntent() {
        Bundle bundle = getIntent().getExtras();
        if (bundle == null) return;
        mOrderBooking = (Order) bundle.get(Constant.ORDER_OBJECT);
    }

    private void createOrderFirebase() {
        MyApplication.get(this).getOrderDatabaseReference()
                .child(String.valueOf(mOrderBooking.getId()))
                .setValue(mOrderBooking, (error1, ref1) -> {

                    DrinkDatabase.getInstance(this).drinkDAO().deleteAllDrink();
                    EventBus.getDefault().post(new DisplayCartEvent());
                    EventBus.getDefault().post(new OrderSuccessEvent());

                    Bundle bundle = new Bundle();
                    bundle.putLong(Constant.ORDER_ID, mOrderBooking.getId());
                    GlobalFunction.startActivity(PaymentActivity.this,
                            ReceiptOrderActivity.class, bundle);

                    finish();
                });
    }
}
