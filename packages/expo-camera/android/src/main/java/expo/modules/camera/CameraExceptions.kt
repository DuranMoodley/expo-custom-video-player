package expo.modules.camera

import expo.modules.kotlin.exception.CodedException

class CameraExceptions {
  class ImageCaptureFailed : CodedException(message = "Failed to capture image")

  class VideoRecordingFailed(cause: String?) : CodedException("Video recording failed: $cause")
}
