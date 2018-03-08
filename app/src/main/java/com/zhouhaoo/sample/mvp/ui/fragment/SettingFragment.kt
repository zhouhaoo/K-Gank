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

package com.zhouhaoo.sample.mvp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.zhouhaoo.common.base.BaseFragment
import com.zhouhaoo.sample.R
import com.zhouhaoo.sample.mvp.contract.SettingContract
import com.zhouhaoo.sample.mvp.presenter.SettingPresenter
import kotlinx.android.synthetic.main.fragment_setting.*

/**
 * Created by zhou on 18/2/28.
 */
class SettingFragment : BaseFragment<SettingPresenter>(), SettingContract.View {

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun showMessage(message: String) {

    }

    override fun initView(inflater: LayoutInflater, container: ViewGroup?,
                          savedInstanceState: Bundle?): Int {
        return R.layout.fragment_setting
    }

    override fun initData(savedInstanceState: Bundle?) {
        tvSetting.setOnClickListener {
            mPresenter.test()
        }
    }

}