package com.dirakto

import com.dirakto.views.MainView
import javafx.stage.Stage
import tornadofx.App
import tornadofx.launch

class TiApp : App(MainView:: class) {
    override fun start(stage: Stage) {
        super.start(stage)
        stage.isMaximized = true
//        stage.hide()
    }
}

fun main(args: Array<String>) {
    launch<TiApp>(args)
}