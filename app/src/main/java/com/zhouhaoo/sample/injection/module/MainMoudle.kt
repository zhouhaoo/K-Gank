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

package com.zhouhaoo.sample.injection.module

import com.zhouhaoo.common.injection.ActivityScope
import com.zhouhaoo.common.injection.FragmentScope
import com.zhouhaoo.sample.mvp.ui.activity.MainActivity
import com.zhouhaoo.sample.mvp.ui.fragment.SettingFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by zhou on 18/2/26.
 */
@Module
abstract class MainMoudle {
    @ActivityScope
    @ContributesAndroidInjector(modules = [MainPresenterModule::class])
    abstract fun contributeMainActivity(): MainActivity

    @FragmentScope
    @ContributesAndroidInjector(modules = [SettingPresenterModule::class])
    abstract fun contributeSettingFragment(): SettingFragment
}