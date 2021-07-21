package com.bsl.bslecommerce

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bsl.bslecommerce.model.Product
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)

        val products = arrayListOf<Product>()
            products.add(Product("Iphone 12 ", R.drawable.glass, 1.99, "Meet the new iPhone 12 and iPhone 12 mini. 5G speed. A14 Bionic."))
            products.add(Product("Iphone", R.drawable.iphone1,999.0,"ddf"))
            products.add(Product("Apple MacBook", R.drawable.lg,899.00,"df"))
            products.add(Product("AirPods", R.drawable.airpods,199.00,"dfd"))
            products.add(Product("Charger", R.drawable.charger,19.00,"dfsd"))
            products.add(Product("Iphone 12 glass", R.drawable.glass,9.00,"The iPhone 12 has Ceramic Shield. The Galaxy Note 20 Ultra has Gorilla Glass Victus."))
            products.add(Product("Chrome Book", R.drawable.chromebook,999.00,"dewr"))
            products.add(Product("Beats Headphones", R.drawable.beats,99.00,"sdfsd"))

        root.recycler_view.apply {
            layoutManager = GridLayoutManager(activity, 2)
            adapter = ProductsAdapter(products)
        }
        return root
    }
}