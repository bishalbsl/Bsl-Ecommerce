package com.bsl.bslecommerce.model

interface ProductDao {
    fun insert(product: Product): Long
}