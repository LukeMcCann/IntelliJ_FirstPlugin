package com.planetdebug.firstplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.fileChooser.FileChooser
import com.intellij.openapi.fileChooser.FileChooserDescriptor
import com.intellij.openapi.ui.Messages
// import com.intellij.openapi.ui.Messages
import com.intellij.ui.layout.chooseFile

class FileChooser: AnAction()
{
    override fun actionPerformed(e: AnActionEvent)
    {
        // Messages.showMessageDialog(e.project, "C:file_here", "File Dialog", Messages.getInformationIcon())

        val fileChooserDescriptor = FileChooserDescriptor(
            false,
            true,
            false,
            false,
            false,
            false
        )
        fileChooserDescriptor.title = "Select Directory"
        fileChooserDescriptor.description = "File Chooser"
        FileChooser.chooseFile(fileChooserDescriptor, e.project, null) {
            Messages.showMessageDialog(e.project, it.path, "Path", Messages.getInformationIcon())
        }
    }
}