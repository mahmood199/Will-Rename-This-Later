package com.example.dagger2project.di

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import javax.inject.Singleton


@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideAPIService(retrofit: Retrofit) =
        retrofit.create(APIService::class.java)


    @Singleton
    @Provides
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
        gsonConverterFactory: GsonConverterFactory,
        gson: Gson
    ) = Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl("https://randomuser.me/")
        .addConverterFactory(gsonConverterFactory)
        .build()

    @Singleton
    @Provides
    fun provideGson() = GsonBuilder().create()

    @Singleton
    @Provides
    fun provideGsonConverterFactory(gson: Gson) = GsonConverterFactory.create(gson)


    @Provides
    fun provideOkHttpClient(
        cache: Cache,
        httpLoggingInterceptor: HttpLoggingInterceptor?
    ) = OkHttpClient()
        .newBuilder()
        .cache(cache)
        .addInterceptor(httpLoggingInterceptor!!)
        .build()


    @Provides
    fun provideCache(cacheFile: File) =
        Cache(cacheFile, 10 * 1000 * 1000) //10 MB


    @Provides
    fun providesFile(context: Context) =
        File(context.cacheDir, "HttpCache")
            .apply {
                mkdirs()
            }

    @Provides
    fun httpLoggingInterceptor() =
        HttpLoggingInterceptor { message -> Log.d("Response", message) }
            .apply {
                level = HttpLoggingInterceptor.Level.BODY
            }


}