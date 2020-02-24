package com.cherepiv.weare8.datasource

import com.google.gson.Gson

object Repository {

    fun <T> getData(json: String, t: Class<T>) = Gson().fromJson<T>(json, t)
}



