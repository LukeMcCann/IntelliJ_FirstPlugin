package com.planetdebug.firstplugin

import com.intellij.openapi.components.PersistentStateComponent

class FirstPluginSettings: PersistentStateComponent<FirstPluginState>
{
    override fun getState(): FirstPluginState?
    {
    }

    override fun loadState(state: FirstPluginState)
    {
    }

}