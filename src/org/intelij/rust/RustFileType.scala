package org.intelij.rust

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object RustFileType  extends LanguageFileType(RustLanguage) {

  override def getName: String = "Rust"

  override def getDescription: String = "Rust file"

  override def getDefaultExtension: String = "rs"

  override def getIcon: Icon = Icons.fileIcon

}