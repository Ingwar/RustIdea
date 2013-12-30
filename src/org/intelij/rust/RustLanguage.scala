package org.intelij.rust

import com.intellij.lang.Language


class RustLanguage extends Language("Rust", "text/x-rustsrc") {
}

object RustLanguage {

  val INSTANCE  = new RustLanguage

}


