package com.bsl.bslecommerce.model



abstract class AppDatabase {
    abstract fun productDao():ProductDao
}