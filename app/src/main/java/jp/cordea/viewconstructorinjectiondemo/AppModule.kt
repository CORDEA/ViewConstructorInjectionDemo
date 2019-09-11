package jp.cordea.viewconstructorinjectiondemo

import dagger.Module

@Module(
    includes = [
        CurrentViewStateStoreModule::class
    ]
)
interface AppModule
