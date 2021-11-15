
package com.deflatedpickle.neotextureedit;

import com.bulenkov.darcula.DarculaLaf;
import com.mystictri.neotextureedit.TextureEditor;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;

class Main {
	public static void main(String[] args) throws Exception {
		// Needed for the OpenGL canvas
		JPopupMenu.setDefaultLightWeightPopupEnabled(false);
		System.setProperty(
						"org.lwjgl.librarypath",
						System.getProperty("user.dir") + "/build/natives"
		);
		// TODO: Add a theme GUI
		UIManager.setLookAndFeel(new DarculaLaf());

		TextureEditor textureEditor = new TextureEditor(args);
		textureEditor.createMainFrame();
		textureEditor.initialize();
		textureEditor.registerForMacOSXEvents();
		// textureEditor.m_MainFrame.isVisible = true;
		textureEditor.m_MainFrame.setVisible(true);
	}
}
