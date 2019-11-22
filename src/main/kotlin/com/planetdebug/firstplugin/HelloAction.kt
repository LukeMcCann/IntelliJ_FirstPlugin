package com.planetdebug.firstplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

// Java: public class HelloAction extends AnAction {}
// AnAction is an Abstract class
class HelloAction: AnAction()
{
    override fun actionPerformed(e: AnActionEvent)
    {
        Messages.showMessageDialog(e.project, "Hello World", "FirstPlugin", Messages.getInformationIcon())
    }
}