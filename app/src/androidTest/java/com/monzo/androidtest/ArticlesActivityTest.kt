package com.monzo.androidtest

import androidx.lifecycle.Lifecycle
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.monzo.articles.ui.list.ArticlesActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ArticlesActivityTest {
    @get:Rule
    val testRule = ActivityScenarioRule(ArticlesActivity::class.java)

    @Test
    fun test() {
        val scenario = testRule.scenario
        scenario.moveToState(Lifecycle.State.CREATED)
    }
}
