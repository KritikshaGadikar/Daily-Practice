package com.example.thenewsapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.thenewsapp.models.Article

@Database(
    entities = [Article::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class ArticleDatabase : RoomDatabase() {

    abstract fun getArticleDao(): ArticleDAO

    companion object {
        @Volatile
        private var instance: ArticleDatabase? = null
        private val LOCK = Any()

        // Singleton pattern to get the instance of the database
        operator fun invoke(context: Context): ArticleDatabase {
            return instance ?: synchronized(LOCK) {
                instance ?: createDatabase(context).also { instance = it }
            }
        }

        // Function to create the database
        private fun createDatabase(context: Context): ArticleDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                ArticleDatabase::class.java,
                "article_ab.db"
            ).build()
        }
    }
}