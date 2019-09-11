package jp.cordea.viewconstructorinjectiondemo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import javax.inject.Inject
import javax.inject.Provider

class FragmentFactory @Inject constructor(
    private val currentViewStateSink: CurrentViewStateSink,
    private val fragment: Provider<MainFragment>
) : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        val fragment = if (className == MainFragment::class.java.name) {
            fragment.get()
        } else {
            super.instantiate(classLoader, className)
        }
        currentViewStateSink.write(fragment)
        return fragment
    }
}
