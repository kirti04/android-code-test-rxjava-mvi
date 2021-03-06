package com.monzo.ui.list

import com.monzo.articles.data.model.Article
import org.joda.time.DateTime

object ArticleStubFactory {

    fun fakeArticle(
            id: String = "",
            thumbnail: String = "",
            sectionId: String = "",
            sectionName: String = "",
            published: DateTime = DateTime.now(),
            title: String = "",
            url: String = "",
            body: String = ""
    ) = Article(id, thumbnail, sectionId, sectionName, published, title, url, body)
}