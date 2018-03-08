package com.zhouhaoo.common.mvp

import javax.inject.Inject

/**
 * Created by caorb1 on 2018/3/6.
 * Desc:
 */
class EmptyPrestener @Inject constructor():IPresenter{


    override fun onDestroy() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStart() {
        print("onStart")
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}