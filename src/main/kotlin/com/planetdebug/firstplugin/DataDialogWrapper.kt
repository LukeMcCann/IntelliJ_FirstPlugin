package com.planetdebug.firstplugin

import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.components.JBLabel
import com.intellij.uiDesigner.core.AbstractLayout
import com.intellij.util.ui.GridBag
import com.intellij.util.ui.JBUI
import com.intellij.util.ui.UIUtil
import java.awt.Dimension
import java.awt.GridBagConstraints
import java.awt.GridBagLayout
import java.awt.Insets
import javax.swing.JComponent
import javax.swing.JPanel
import javax.swing.JPasswordField
import javax.swing.JTextField

class DataDialogWrapper: DialogWrapper(true)
{
    private val panel = JPanel(GridBagLayout())
    private val txtMode = JTextField()
    private val txtUsername = JTextField()
    private val txtPassword = JPasswordField()

    init
    {
        init()
        title = "FirstPlugin Data"
    }

    override fun createCenterPanel(): JComponent
    {
        val gb = GridBag()
            .setDefaultInsets(Insets(0,0, AbstractLayout.DEFAULT_VGAP, AbstractLayout.DEFAULT_HGAP))
            .setDefaultWeightX(1.0)
            .setDefaultFill(GridBagConstraints.HORIZONTAL)

        panel.preferredSize = Dimension(400, 200)

        panel.add(label("Mode"), gb.nextLine().next().weightx(0.2))
        panel.add(txtMode, gb.next().weightx(0.8))
        panel.add(label("Username: "), gb.nextLine().next().weightx(0.2))
        panel.add(txtUsername, gb.next().weightx(0.8))
        panel.add(label("Password: "), gb.nextLine().next().weightx(0.2))
        panel.add(txtPassword, gb.next().weightx(0.8))

        return panel
    }

    override fun doOKAction()
    {
        val mode = txtMode.text
        val username = txtUsername.text
        val password = txtPassword.password

        print("")
    }

    private fun label(txt: String) : JComponent
    {
        val label = JBLabel(txt)
        label.componentStyle = UIUtil.ComponentStyle.SMALL
        label.fontColor = UIUtil.FontColor.BRIGHTER
        label.border = JBUI.Borders.empty(0, 5,2,0)
        return label
    }
}