package com.bsl.bslecommerce

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import com.bsl.bslecommerce.model.Product
import com.bsl.bslecommerce.model.ProductDao

import kotlinx.android.synthetic.main.product_details.*
import kotlinx.android.synthetic.main.product_row.view.*
import okhttp3.Dispatcher
import kotlin.coroutines.experimental.CoroutineContext

class ProductDetails: AppCompatActivity(){

    private lateinit var productDao: ProductDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_details)

        val photo = intent.getIntExtra("Url", 0)// set 0 as the default value if no value for intVariableName found
        val title = intent.getStringExtra("title")
        val des = intent.getStringExtra("des")
        val price = intent.getStringExtra("price")

        product_name.text = title
        product_details.text=des
        photo_id.setImageResource(photo)

        availability.setOnClickListener {
            AlertDialog.Builder(this)
                    .setMessage("$title is in stock!")
                    .setPositiveButton("OK") { p0, p1 ->
                    }
                    .create()
                    .show()
        }

        addToCartButton.setOnClickListener {

                AlertDialog.Builder(this)
                        .setMessage("$title is added to the cart")
                        .setPositiveButton("OK") { p0, p1 ->
                        }
                        .create()
                        .show()
            }


        }

    }

