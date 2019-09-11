package jp.cordea.viewconstructorinjectiondemo

import dagger.Binds
import dagger.Module

@Module
interface CurrentViewStateStoreModule {
    @Binds
    fun bindCurrentViewStateSink(store: CurrentViewStateStore): CurrentViewStateSink

    @Binds
    fun bindCurrentViewStateSource(store: CurrentViewStateStore): CurrentViewStateSource
}
