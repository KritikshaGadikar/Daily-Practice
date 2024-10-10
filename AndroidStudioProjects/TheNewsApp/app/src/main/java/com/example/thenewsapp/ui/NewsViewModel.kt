package com.example.thenewsapp.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.thenewsapp.models.Article
import com.example.thenewsapp.models.NewsResponse
import com.example.thenewsapp.repository.NewsRepository
import com.example.thenewsapp.util.Resource
import kotlinx.coroutines.launch
import retrofit2.Response

class NewsViewModel(app: Application, val newsRepository: NewsRepository): AndroidViewModel(app) {

    val headline: MutableLiveData<Resource<NewsResponse>> = MutableLiveData()
    var headlinesPage = 1
    var headlineResponse: NewsResponse? = null

    val searchNews: MutableLiveData<Resource<NewsResponse>> = MutableLiveData()
    var searchNewsPage = 1
    var searchNewsResponse: NewsResponse? = null
    val newSearchResponse: String? = null
    val newSearchQuery: String? = null
    var oldSearchQuery: String? = null

    private fun handleHeadlineResponse(response: Response<NewsResponse>): Resource<NewsResponse> {
        if (response.isSuccessful) {
            response.body()?.let { resultResponse ->
                headlinesPage++
                if (headlineResponse == null) {
                    headlineResponse = resultResponse
                } else{
                    val oldArticle = headlineResponse?.articles
                    val newArticle = resultResponse.articles
                    oldArticle?.addAll(newArticle)
                }
                    return  Resource.Success(headlineResponse ?: resultResponse)
            }
        }
        return Resource.Error(response.message())
    }

    fun addToFavourites(article: Article) = viewModelScope.launch {
        newsRepository.upsert(article)
    }

    fun getFavouriteNews() = newsRepository.getFavouriteNews()

    fun deleteArticle(article: Article) = viewModelScope.launch {
        newsRepository.upsert(article)
    }
}