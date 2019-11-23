package com.planetdebug.firstplugin

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.ServiceManager
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage

@State {
    name = "FirstPlugin"
    storages = [Storage("First-Plugin.xml")]
}
class FirstPluginSettings: PersistentStateComponent<FirstPluginState>
{
    var pluginState = FirstPluginState();

    override fun getState(): FirstPluginState?
    {
        return pluginState
    }

    override fun loadState(state: FirstPluginState)
    {
        pluginState = state
    }

    companion object
    {
        @JvmStatic
        fun getInstance(): PersistentStateComponent<FirstPluginState>
        {
            return ServiceManager.getService(FirstPluginSettings::class.java)
        }
    }
}