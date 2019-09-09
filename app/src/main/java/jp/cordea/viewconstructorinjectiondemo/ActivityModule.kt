package jp.cordea.viewconstructorinjectiondemo

import dagger.Module

@Module(
    includes = [
        MainActivityModule::class
    ]
)
interface ActivityModule
