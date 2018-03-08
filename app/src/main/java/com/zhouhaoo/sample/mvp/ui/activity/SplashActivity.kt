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

package com.zhouhaoo.sample.mvp.ui.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.zhouhaoo.common.base.BaseActivity
import com.zhouhaoo.common.mvp.EmptyPrestener
import com.zhouhaoo.sample.R

/**
 * Created by zhou on 18/2/9.
 */
class SplashActivity : BaseActivity<EmptyPrestener>() {

    override fun initView(savedInstanceState: Bundle?): Int {
        return R.layout.activity_splash
    }

    override fun initData(savedInstanceState: Bundle?) {
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 1500)
    }

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun showMessage(message: String) {

    }

    override fun useInject(): Boolean = false
}