package org.intelij.rust

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class RustFileType  extends LanguageFileType(RustLanguage.INSTANCE) {

  import RustFileType._

  override def getName: String = "Rust"

  override def getDescription: String = "Rust language file"

  override def getDefaultExtension: String = DEFAULT_EXTENSION

  override def getIcon: Icon = Icons.fileIcon

}

object RustFileType {

  val DEFAULT_EXTENSION = "rs"

  val INSTANCE = new RustFileType
}
