package com.ontech.progressview

/**  OnProgressClickListener is an interface for listening to the progress bar is clicked. */
interface OnProgressClickListener {
  /** called when the progress is clicked. */
  fun onClickProgress(highlighting: Boolean)
}
