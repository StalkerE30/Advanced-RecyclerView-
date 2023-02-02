package ru.netology.nmedia.util

import com.google.firebase.messaging.FirebaseMessaging
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@InstallIn(SingletonComponent::class)
@Module
object FirebaseMessagingModule {
    @Provides
    fun provideFBMessaging():FirebaseMessaging{
        return FirebaseMessaging.getInstance()
    }
}