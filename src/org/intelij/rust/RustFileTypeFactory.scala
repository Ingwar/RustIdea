package org.intelij.rust

import com.intellij.openapi.fileTypes.{FileTypeConsumer, FileTypeFactory}

class RustFileTypeFactory extends FileTypeFactory {

  def createFileTypes(consumer: FileTypeConsumer): Unit = {
    consumer.consume(RustFileType, RustFileType.getDefaultExtension)
  }

}
