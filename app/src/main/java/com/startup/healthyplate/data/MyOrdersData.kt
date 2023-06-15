package com.startup.healthyplate.data

import com.startup.healthyplate.R
import com.startup.healthyplate.model.MyOrders

object MyOrdersData {
    val myOrders = MyOrders(
        1,
        R.drawable.burger,
        "Chicken Burger",
        12.000
    )

    val myOrdersList = listOf(
        myOrders,
        myOrders.copy(
            id = 2,
            ordersImageId = R.drawable.burger2,
            name = "Beef Burger",
            price = 10.000
        ),
        myOrders.copy(
            id = 3,
            ordersImageId = R.drawable.pizza,
            name = "Chicken Pizza",
            price = 18.000
        )
    )
}