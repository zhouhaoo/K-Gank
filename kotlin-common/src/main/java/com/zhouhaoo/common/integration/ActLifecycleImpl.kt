/*
 * Copyright (c) 2018  zhouhaoo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.zhouhaoo.common.integration

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.zhouhaoo.common.base.delegate.IActivity
import dagger.Lazy
import dagger.android.AndroidInjection
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by zhou on 18/1/30.
 */
@Singleton
class ActLifecycleImpl @Inject constructor() : Application.ActivityLifecycleCallbacks {

    @Inject
    lateinit var mFragmentLifecycle: Lazy<FragmentLifecycleImpl>

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        if (activity is IActivity) {
            if (activity.useInject())
                AndroidInjection.inject(activity)
        }
        registerFragmentCallbacks(activity)
    }

    override fun onActivityStarted(activity: Activity) {

    }

    override fun onActivityPaused(activity: Activity) {

    }

    override fun onActivityResumed(activity: Activity) {

    }

    override fun onActivityStopped(activity: Activity) {

    }

    override fun onActivityDestroyed(activity: Activity) {

    }

    override fun onActivitySaveInstanceState(activity: Activity, savedInstanceState: Bundle?) {

    }

    /**
     * 注册Fragment的监听
     * @param activity
     */
    private fun registerFragmentCallbacks(activity: Activity) {
        var useFragment = if (activity is IActivity) activity.useFragment() else true
        if (activity is FragmentActivity && useFragment) {
            activity.supportFragmentManager.registerFragmentLifecycleCallbacks(mFragmentLifecycle.get(),
                    true)
        }
    }
}