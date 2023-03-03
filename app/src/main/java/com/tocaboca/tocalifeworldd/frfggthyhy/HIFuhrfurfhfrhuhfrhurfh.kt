package com.tocaboca.tocalifeworldd.frfggthyhy

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.tocaboca.tocalifeworldd.defrgtgtgt.JIOFjjijiifr
import com.tocaboca.tocalifeworldd.derfggtgtgt.NKJnfjruhrfuhrfhurfhrf
import com.tocaboca.tocalifeworldd.derfgtgtgt.IUHFhrhhrfuhhrf
import com.tocaboca.tocalifeworldd.dvfgthy.JOIFJirjrfjjrfjirf
import com.tocaboca.tocalifeworldd.fregrtyh.OKokooooo
import com.tocaboca.tocalifeworldd.frghyhyjhy.Gygfrgygrfrfrf
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun hy62j59ju95ju59uj(): Gson {
    return GsonBuilder().create()
}



val bgbgnhhy5995uj5ju = module {
    viewModel (named("MainModel")){
        OKokooooo((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Gygfrgygrfrfrf(get())
    }
}

val hhy5hy595hy95hy = module {

    single  <NKJnfjruhrfuhrfhurfhrf> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(NKJnfjruhrfuhrfhurfhrf::class.java)
    }

    single <JIOFjjijiifr> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(JIOFjjijiifr::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://affluentbeam.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        JOIFJirjrfjjrfjirf(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        IUHFhrhhrfuhhrf(get(named("HostInter")))
    }
    single{
        hy62j59ju95ju59uj()
    }
    single (named("SharedPreferences")) {
        hykpohykohykohyko(androidApplication())
    }
}

fun hykpohykohykohyko(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}


