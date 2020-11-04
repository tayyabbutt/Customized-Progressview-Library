package com.ontech.progressview

/**  OnProgressChangeListener is an interface for listening to the progress is changed. */
interface OnProgressChangeListener {
  /** called when the progress is changed. */
  fun onChange(progress: Float)
}
