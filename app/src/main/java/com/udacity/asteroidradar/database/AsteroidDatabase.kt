package com.udacity.asteroidradar.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [AsteroidEntity::class], version = 1, exportSchema = false)
abstract class AsteroidDatabase : RoomDatabase() {
    abstract val asteroidDao: AsteroidDatabaseDao
}

@Volatile
private var INSTANCE: AsteroidDatabase? = null

fun getDatabase(context: Context): AsteroidDatabase {
    synchronized(AsteroidDatabase::class.java) {
        var instance = INSTANCE
        if (instance == null) {
            instance = Room.databaseBuilder(
                context.applicationContext,
                AsteroidDatabase::class.java,
                "asteroid_database"
            )
                .fallbackToDestructiveMigration()
                .build()
            INSTANCE = instance
        }
        return instance
    }
}