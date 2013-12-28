package org.intelij.rust

import com.intellij.lang.Language


class RustLanguage extends Language(RustLanguage.id, RustLanguage.mimeType) {
}

object RustLanguage {

  val INSTANCE  = new RustLanguage

  private val id = "Rust"

  private val mimeType = "text/x-rustsrc"

}


