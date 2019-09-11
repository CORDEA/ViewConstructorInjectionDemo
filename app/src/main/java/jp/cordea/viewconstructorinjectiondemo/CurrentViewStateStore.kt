package jp.cordea.viewconstructorinjectiondemo

import androidx.fragment.app.Fragment
import javax.inject.Inject
import javax.inject.Singleton

interface CurrentViewStateSink {
    fun write(fragment: Fragment)
}

interface CurrentViewStateSource {
    fun getFragment(): Fragment
}

@Singleton
class CurrentViewStateStore @Inject constructor() : CurrentViewStateSink, CurrentViewStateSource {
    private var fragment: Fragment? = null

    override fun write(fragment: Fragment) {
        this.fragment = fragment
    }

    override fun getFragment(): Fragment = fragment!!
}
